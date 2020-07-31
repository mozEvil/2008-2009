/*
 * NewJApplet1.java
 *
 * Created on 3 Ноябрь 2008 г., 21:23
 */

package desexample;

import javax.crypto.*;
import java.io.*;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
/**
 *
 * @author  MozEvil
 */
public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents(); 
        kart();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        choice1 = new java.awt.Choice();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Собрать карты");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jLabel1.setText("Кол-во участников:");

        jButton1.setText("Раздать карты");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(choice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
kart();
chk = true;
}//GEN-LAST:event_jButton2MousePressed

private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
if (chk){
try{
    KeyGenerator keygen = KeyGenerator.getInstance("DES");
    SecureRandom random = new SecureRandom();
    keygen.init(random);  
    int N = Integer.parseInt(choice1.getSelectedItem());
    String[][] krt = new String[N][10];
    SecretKey[] key = new SecretKey[N];
    DesEncrypter[] DES = new DesEncrypter[N];

    for (int i=0; i<N; i++){
        key[i] = keygen.generateKey();
        DES[i] = new DesEncrypter(key[i]);
    }
    
    //String[] str = new String[]{"C:/!!!/A.txt","C:/!!!/B.txt","C:/!!!/C.txt","C:/!!!/D.txt","C:/!!!/E.txt"};
    String[] str = new String[]{"A.txt","B.txt","C.txt","D.txt","E.txt"};
    DataOutputStream[] out = new DataOutputStream[N];
    
    //каждый участник перемешивает колоду и шифрует ее своим ключем
    for (int i=0; i<N; i++){
        randKart();
        for (int j=0; j<52; j++)
            kld[j] = "" + DES[i].encrypt(kld[j]); 
    }
    //раздаем карты
    for (int i=0; i<N; i++){
        out[i] = new DataOutputStream(new FileOutputStream(str[i]));
        for (int j = i*10; j<(i*10)+10; j++)
            krt[i][j%10] = "" + kld[j]; 
    }
    //расшифровываем и записываем карты в файл
    for (int i=0; i<N; i++){
        for (int j=0; j<10; j++){
            for (int l=N-1; l>=0; l--){           
                krt[i][j] = ""+DES[l].decrypt(krt[i][j]); 
            }
            out[i].writeUTF(""+koloda[Integer.parseInt(krt[i][j])]);            
        }
        out[i].close();        
    }      
    chk = false;

} catch (IOException exception){exception.printStackTrace();}
  catch (GeneralSecurityException exception){exception.printStackTrace();}

}
}//GEN-LAST:event_jButton1MousePressed

void randKart() {
    String buf = "";
    Random random = new Random();
    for (int i=0; i<10000; i++){
        int rnd1 = random.nextInt(52);
        int rnd2 = random.nextInt(52);
        buf = "" + kld[rnd1];
        kld[rnd1] = kld[rnd2];
        kld[rnd2] = buf;
    }
}
void kart(){
         koloda = new String[]
        {"А крести; ","А буби; ","А черви; ","А пики; ",
         "2 крести; ","2 буби; ","2 черви; ","2 пики; ",
         "3 крести; ","3 буби; ","3 черви; ","3 пики; ",
         "4 крести; ","4 буби; ","4 черви; ","4 пики; ",
         "5 крести; ","5 буби; ","5 черви; ","5 пики; ",
         "6 крести; ","6 буби; ","6 черви; ","6 пики; ",
         "7 крести; ","7 буби; ","7 черви; ","7 пики; ",
         "8 крести; ","8 буби; ","8 черви; ","8 пики; ",
         "9 крести; ","9 буби; ","9 черви; ","9 пики; ",
         "10 крести; ","10 буби; ","10 черви; ","10 пики; ",
         "В крести; ","В буби; ","В черви; ","В пики; ",
         "Д крести; ","Д буби; ","Д черви; ","Д пики; ",
         "К крести; ","К буби; ","К черви; ","К пики; ",};
        
        kld = new String[] {"0","1","2","3","4","5","6","7","8","9","10","11",
        "12","13","14","15","16","17","18","19","20","21","22","23","24","25","26",
        "27","28","29","30","31","32","33","34","35","36","37","38","39","40","41",
        "42","43","44","45","46","47","48","49","50","51"};
        
        choice1.removeAll();
        choice1.add("2");
        choice1.add("3");
        choice1.add("4");
        choice1.add("5");
    }
/////////////////////////////////////////////////////////    
class DesEncrypter {
    Cipher ecipher;
    Cipher dcipher;

public DesEncrypter(SecretKey key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
    ecipher = Cipher.getInstance("DES");
    dcipher = Cipher.getInstance("DES");
    ecipher.init(Cipher.ENCRYPT_MODE, key);
    dcipher.init(Cipher.DECRYPT_MODE, key);
}

public String encrypt(String str) throws UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException {
    byte[] utf8 = str.getBytes("UTF8");
    byte[] enc = ecipher.doFinal(utf8);
    return new sun.misc.BASE64Encoder().encode(enc)+"";
}

public String decrypt(String str) throws IOException, IllegalBlockSizeException, BadPaddingException {
    byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(str);
    byte[] utf8 = dcipher.doFinal(dec);
    return new String(utf8, "UTF8");
}
}   


    public static void main(String args[])throws IllegalBlockSizeException, BadPaddingException, IOException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException{
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    private boolean chk = true;
    private String[] koloda, kld;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
