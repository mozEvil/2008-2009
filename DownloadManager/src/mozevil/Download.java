package mozevil;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author MozEvil
 */

//этот класс загружает файл из указанного URL
public class Download extends Observable implements Runnable {

    //максимальный размер буфера загрузки
    private static final int MAX_BUFFER_SIZE = 1024;

    //имена состояний
    public  static final String STATUSES[] = {"Downloading", "Paused", "Complete", "Cancelled", "Error"};

    //коды состояний
    public static final int DOWNLOADING = 0;
    public static final int PAUSED = 1;
    public static final int COMPLETE = 2;
    public static final int CANCELLED = 3;
    public static final int ERROR = 4;

    private URL url;            //загрузка URL
    private  int size;          //размер загрузки в байтах
    private  int downloaded;    //кол-во загруженных байтов
    private  int status;        //текущее состояние загрузки

    //конструктор
    public Download(URL url){
        this.url = url;
        size = -1;
        downloaded = 0;
        status = DOWNLOADING;
        download();
    }

     //уведомить об изменении статуса загрузки
    private void stateChanged() {
        setChanged();
        notifyObservers();
    }
    //получить имя файла из URL
    private String getFileName(URL url) {
        String fileName = url.getFile();
        return fileName.substring(fileName.lastIndexOf('/') + 1);
    }
    //отменить загрузку из за ошибки
    private void error() {
        status = ERROR;
        stateChanged();
    }
    //начать или продолжить загрузку
    private void download(){
        Thread thread = new Thread(this);
        thread.start();
    }

    //загрузка
    public void run(){
        RandomAccessFile file = null;
        InputStream stream = null;
        try {
            //открыть соединения с URL
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            //определить часть загруженного файла
            conn.setRequestProperty("Range", "bytes=" + downloaded + "-");

            //соединиться с сервером
            conn.connect();

            //убедитса что код ответа в диапозоне 200 (2XX - ok)
            if (conn.getResponseCode() /100 != 2) {
                error();
            }

            //проверить допустимую длину содержимого
            int contentLenght = conn.getContentLength();
            if (contentLenght < 1) {
                error();
            }

            //установить размер для загрузки (если не установлен)
            if (size == -1) {
                size = contentLenght;
                stateChanged();
            }

            //открыть файл и установить индекс в конец файла
            file = new RandomAccessFile(getFileName(url), "rw");
            file.seek(downloaded);
            stream = conn.getInputStream();

            //ПОЕХАЛИ БАЙТИКИ!!!
            while (status == DOWNLOADING) {
                //размер буфера = размеру части файла, которую осталось загрузить(если она меньше чем MAX_BUFFER_SIZE)
                byte buffer[];
                if (size - downloaded > MAX_BUFFER_SIZE) {
                    buffer = new byte[MAX_BUFFER_SIZE];
                } else {
                    buffer = new byte[size - downloaded];
                }
                //считать с сервера в буфер
                int read = stream.read(buffer);     //возвращает число считанных байтов
                if (read == -1) {
                    break;
                }
                // записать из буфера в файл
                file.write(buffer, 0, read);
                downloaded += read;
                stateChanged();
            }

            //загрузка окончена, ставим соответствующий статус
            if (status == DOWNLOADING) {
                status = COMPLETE;
                stateChanged();
            }

        } catch (Exception e) {
            error();
        } finally {
            try {
                // закрываем файл и соединение с сервером
                if (file != null) {
                    file.close();
                }
                if (stream != null) {
                    stream.close();
                }
            } catch (Exception e) {
            }
        }
    }

    //получить URL загрузки
    public String getUrl() {
        return url.toString();
    }
    //получить размер загружаемого файла
    public int getSize() {
        return size;
    }
    //получить сколько процентов загружено
    public float getProgress() {
        return ((float) downloaded / size) * 100;
    }
    //получить состояние загрузки
    public int getStatus() {
        return status;
    }
    //приостановить загрузку (пауза)
    public void pause() {
        status = PAUSED;
        stateChanged();
    }
    //возобновить загрузку
    public void resume() {
        status = DOWNLOADING;
        stateChanged();
        download();
    }
    //отменить загрузку
    public void cancel() {
        status = CANCELLED;
        stateChanged();
    }
}
