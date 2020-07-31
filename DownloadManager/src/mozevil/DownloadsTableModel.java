package mozevil;

import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author MozEvil
 */

public class DownloadsTableModel extends AbstractTableModel implements Observer {

    //имена столбцов таблицы
    private static final String[] columnNames = {"URL", "Size", "Progress", "Status"};
    //классы для каждого значения столбцов
    private static final Class[] columnClasses = {String.class, String.class, JProgressBar.class, String.class};
    //какие столбцы можна редактирвоать
     boolean[] canEdit = new boolean[] {true, false, false, false};

    //список для загрузки
    private ArrayList downloadList = new ArrayList();

    //добавить новую загрузку в таблицу
    public void addDownload(Download download) {
        download.addObserver(this);     //зарегать для уведомлнеия об изменениях в загрузке
        downloadList.add(download);     //добавляем загрузку в список загрузок
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1);    //вводим уведомление в строку таблицы
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
    }

    //получить загрузку для указанной строки
    public Download getDownload(int row) {
        return (Download) downloadList.get(row);
    }
    //удалить загрузку из списка
    public void clearDownload(int row) {
        downloadList.remove(row);
        fireTableRowsDeleted(row, row);     //удаляем уведомление в строке таблицы
    }
    //получить счетчик столбцов таблицы
    public int getColumnCount() {
        return columnNames.length;
    }
    //получить имя столбца
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
    //получить класс столбца
    @Override
    public Class getColumnClass(int col) {
        return columnClasses[col];
    }
    //получить счетчик строк таблицы
    public int getRowCount() {
        return downloadList.size();
    }
    //получить значение для указанной строки и столбца
    public Object getValueAt(int row, int col) {
        Download download = (Download) downloadList.get(row);
        switch (col) {
            case 0: //URL
                return download.getUrl();
            case 1: //размер файла
                int size = download.getSize();
                return (size == -1) ? "" : "" + size;
            case 2: //Прогресс загрузки
                return new Float(download.getProgress());
            case 3: //Состояние загрузки
                return Download.STATUSES[download.getStatus()];
        }
        return "";
    }
    //Обновить при вызове, когда класс Download уведомляет экземпляры Observers об изменениях
    public void update(Observable o, Object arg) {
        int index = downloadList.indexOf(o);
        fireTableRowsUpdated(index, index);     //запустить обновление уведомления для строки таблицы
    }

}




