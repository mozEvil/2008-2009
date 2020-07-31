/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mozevil;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.RootPaneContainer;

/**
 *
 * @author MozEvil
 */
public class Download implements Runnable {

    private URL url;
    private int size;

    public Download(URL url) {
        Thread t = new Thread(this);
        this.url = url;
        t.start();
    }

    public void run() {
        try {

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.connect();

            if (conn.getResponseCode() /100 == 2){
                String fileName = url.getFile();
                fileName = fileName.substring(fileName.lastIndexOf('/') + 1);

                RandomAccessFile file = new RandomAccessFile(fileName, "rw");
                InputStream stream = conn.getInputStream();

                size = conn.getContentLength();
                byte[] buffer = new byte[size];

                stream.read(buffer);
                file.write(buffer);

                file.close();
                stream.close();

                JOptionPane.showMessageDialog(null, "Имя файл: " + fileName + "\nРазмер файла: " + size + " байт", "Загрузка завершена!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, conn.getResponseMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
