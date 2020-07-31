/*
 * AppMailz.java
 *
 * Created on 19.04.2009, 18:59:30
 */

package mozevil;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author mozEvil
 */
public class AppMailz extends javax.swing.JApplet {

    /** Initializes the applet AppMailz */
    @Override
    public void init() {
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_from = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_to = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_subject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_content = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextField_pop3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_smtp = new javax.swing.JTextField();
        jButton_send = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_send = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_login = new javax.swing.JTextField();
        jPasswordField_pass = new javax.swing.JPasswordField();

        setStub(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("From:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("To:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Subject:");

        jTextArea_content.setColumns(20);
        jTextArea_content.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea_content.setRows(5);
        jTextArea_content.setText("\n");
        jScrollPane1.setViewportView(jTextArea_content);

        jLabel4.setText("POP3:");

        jLabel5.setText("SMTP:");

        jButton_send.setText("Send");
        jButton_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sendActionPerformed(evt);
            }
        });

        jLabel_send.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setText("Login: ");

        jLabel7.setText("Pass: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField_smtp))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField_pop3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField_login)
                                        .addComponent(jPasswordField_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField_from, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_to, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_send)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_send, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_pop3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_smtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_to))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_send)
                    .addComponent(jLabel_send, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sendActionPerformed
        // Send
        if (jTextField_smtp.getText().trim().length() < 1
                || jTextField_pop3.getText().trim().length() < 1
                || jTextField_login.getText().trim().length() < 1
                || jPasswordField_pass.getPassword().length < 1
                || jTextField_from.getText().trim().length() < 1
                || jTextField_to.getText().trim().length() < 1
                || jTextField_subject.getText().trim().length() < 1
                || jTextArea_content.getText().trim().length() < 1) {
            jLabel_send.setText("ERROR");
        } else {            
            try {                
                // делаем УРЛ = pop3://логин:пароль@сервер/
                String connURL = "pop3://" + jTextField_login.getText().trim()
                        + ":" + new String(jPasswordField_pass.getPassword())
                        + "@" + jTextField_pop3.getText().trim() + "/";

                // инициализировать сеанс Java Mail c SMTP сервером
                Properties props = new Properties();
                props.put("mail.smtp.host", jTextField_smtp.getText().trim());
                session = Session.getDefaultInstance(props);

                // подключитса к почтовому серверу
                store = session.getStore(new URLName(connURL));
                store.connect();

                // создаем и отправляем сообщение
                InternetAddress[] ia = parserTo(jTextField_to.getText().trim()); // получить адреса отправки
                Message mes = new MimeMessage(session);
                
                mes.setFrom(new InternetAddress(jTextField_from.getText().trim())); //от кого
                mes.setSubject(jTextField_subject.getText().trim());                //тема
                mes.setSentDate(new Date());                                        //дата
                mes.setText(jTextArea_content.getText());                           //текст
                
                for (int i=0; i<ia.length; i++) {
                    mes.setRecipient(Message.RecipientType.TO, ia[i]);                    //кому
                    new SendMes(mes);
                }

                jLabel_send.setText("OK");
            } catch (Exception e) {
                jLabel_send.setText("ERROR");
            } finally {
                try {
                    store.close();
                } catch (MessagingException ex) {
                }
            }
        }
}//GEN-LAST:event_jButton_sendActionPerformed
    InternetAddress[] parserTo(String to) throws AddressException {
        StringTokenizer st = new StringTokenizer(to, ",");
        int n = st.countTokens();
        InternetAddress[] ia = new InternetAddress[n];
        for (int i=0; i<n; i++){
            ia[i] = new InternetAddress(st.nextToken().trim());
        }
        return ia;
    }
    
    class SendMes implements Runnable {
        Message mes;
        public SendMes(Message mes) {
            this.mes = mes;
            Thread t = new Thread(this);
            t.start();
        }
        public void run() {
            try {
                Transport.send(mes);
            } catch (MessagingException ex) {
            }
        }
    }
    private Store store;
    private Session session; // сессия для Java Mail
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_send;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_send;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea_content;
    private javax.swing.JTextField jTextField_from;
    private javax.swing.JTextField jTextField_login;
    private javax.swing.JTextField jTextField_pop3;
    private javax.swing.JTextField jTextField_smtp;
    private javax.swing.JTextField jTextField_subject;
    private javax.swing.JTextField jTextField_to;
    // End of variables declaration//GEN-END:variables

}