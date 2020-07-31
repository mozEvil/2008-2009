/*
 * msgr_mozevil.java
 *
 * Created on 11.12.2008, 2:48:45
 */

package first_inet;

import java.awt.Color;
import java.io.*;
import java.net.*;
import java.security.*;
import java.util.logging.*;
import javax.crypto.*;

/**
 *
 * @author mozEvil
 */
public class msgr_mozevil extends javax.swing.JFrame {
    String ip;
    int port;
    DatagramSocket ds;
    boolean cc = false;
    SecretKey key;
    DesEncrypter DES;

    /** Creates new form msgr_mozevil */
    public msgr_mozevil() throws Exception {
        initComponents();
        initKey();
        label1.setBackground(Color.RED);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        label1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jTextField_ip = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_port = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("mozEvil's messenger");
        setResizable(false);

        jTextArea1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Send");
        jButton1.setEnabled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jTextArea2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        label1.setText("        ");

        jLabel3.setText(" ip:");

        jTextField_ip.setText("87.254.156.47");

        jLabel4.setText("port:");

        jTextField_port.setText("12000");

        jButton2.setText("Open");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton3.setText("Close");
        jButton3.setEnabled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(jTextField_port, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(155, 155, 155)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
// send
       if (cc && jTextArea2.getText().trim().length() != 0){
            try { 
                //отправяем на fr_ip : fr_port
                ds.send(new DatagramPacket(jTextArea2.getText().getBytes(),
                        jTextArea2.getText().getBytes().length,
                        InetAddress.getByName(ip), port));

                jTextArea1.insert("Отправили: \n" + jTextArea2.getText()+ "\n\n", jTextArea1.getText().getBytes().length);
                jTextArea1.setCaretPosition(jTextArea1.getText().length());
                jTextArea2.setText("");

            } catch (Exception ex) {
                Logger.getLogger(msgr_mozevil.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
 
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
// open
        if (!cc){
            try {

                ip = jTextField_ip.getText();
                port = Integer.parseInt(jTextField_port.getText());

                ds = new DatagramSocket(port);   // с какого порта отправляем и принимаем

                cc = true;
                jButton1.setEnabled(cc);
                jButton2.setEnabled(!cc);
                jButton3.setEnabled(cc);
                
                new as();

            } catch (IOException ex) {
                Logger.getLogger(msgr_mozevil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
// close
        if(cc){
            cc = false;
            jButton1.setEnabled(cc);
            jButton2.setEnabled(!cc);
            jButton3.setEnabled(cc);
            try {
                ds.send(new DatagramPacket("CLOSE".getBytes(), "CLOSE".length(), InetAddress.getLocalHost(), port));

            } catch (IOException ex) {
                Logger.getLogger(msgr_mozevil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3MousePressed

    class as extends Thread{
    public as() {
        super("asss");
        start();
    }
        @Override
    public void run() {
            try {
                label1.setBackground(Color.green);                
                DatagramPacket p = new DatagramPacket(new byte[1024], 1024);
                while(true){

                    ds.receive(p);
                    jTextArea1.insert("Пришло: \n" + new String(p.getData(), 0, p.getLength()) + "\n\n",jTextArea1.getText().getBytes().length);
                    jTextArea1.setCaretPosition(jTextArea1.getText().length());

                    if (!cc) {
                        ds.close();
                        break;
                    }
                }
                label1.setBackground(Color.red);
                
            } catch (IOException ex) {
                Logger.getLogger(msgr_mozevil.class.getName()).log(Level.SEVERE, null, ex);
              }
    }
    }

void initKey() throws Exception {
    KeyGenerator keygen = KeyGenerator.getInstance("DES");
    SecureRandom random = new SecureRandom();
    keygen.init(random);

    key = keygen.generateKey();     System.out.println(key);
    DES = new DesEncrypter(key);
}

class DesEncrypter {
    Cipher ecipher;
    Cipher dcipher;

public DesEncrypter(SecretKey key) throws Exception {
    ecipher = Cipher.getInstance("DES");
    dcipher = Cipher.getInstance("DES");
    ecipher.init(Cipher.ENCRYPT_MODE, key);
    dcipher.init(Cipher.DECRYPT_MODE, key);
}

public String encrypt(String str) throws Exception {
    byte[] utf8 = str.getBytes("UTF8");
    byte[] enc = ecipher.doFinal(utf8);
    return new sun.misc.BASE64Encoder().encode(enc)+"";
}

public String decrypt(String str) throws Exception {
    byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(str);
    byte[] utf8 = dcipher.doFinal(dec);
    return new String(utf8, "UTF8");
}
    }




    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) throws Exception{
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new msgr_mozevil().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(msgr_mozevil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField_ip;
    private javax.swing.JTextField jTextField_port;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

}
