/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mozevil;

import java.util.*;
import javax.mail.*;
import javax.swing.table.*;

/**
 *
 * @author MozEvil
 */
public class MessageTableModel extends AbstractTableModel{

    // имена столбцов 
    private static final String[] columnNames = {"От кого", "Тема", "Дата"};
    
    // список сообщений таблицы
    private ArrayList messageList = new ArrayList();
    
    // вывести список сообщений в таблицу
    public void setMessages(Message[] messages) {
        for (int i = messages.length - 1; i>=0; i--) {
            messageList.add(messages[i]);
        }
        //уведомление для таблицы об изменнении данных
        fireTableDataChanged();        
    }
    
    //получить сообщение от указанной строки
    public Message getMessage(int row) {
        return (Message) messageList.get(row);
    }
    //удалить сообщение из списка
    public void deleteMessage(int row) {
        messageList.remove(row);
        fireTableRowsDeleted(row, row);
    }


    public int getRowCount() {
        return messageList.size();
    }

    public int getColumnCount() {
        return columnNames.length;
    }
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        try {
            Message message = (Message) messageList.get(row);
            switch(col) {
                case 0: //от кого
                    Address[] senders = message.getFrom();
                    if (senders != null || senders.length > 0) {
                        return senders[0].toString();
                    } else {
                        return "[none]";
                    }
                case 1: // тема
                    String subject = message.getSubject();
                    if (subject != null && subject.length() > 0) {
                        return subject;
                    } else {
                        return "[none]";
                    }
                case 2: //дата
                    Date date = message.getSentDate();
                    if (date != null) {
                        return date.toString();
                    } else {
                        return "[none]";
                    }
            }
        } catch (Exception e) {
            return "";
        }
        return "";
    }


}
