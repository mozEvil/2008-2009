/*
 * HideProtocol.java
 *
 * Created on 21 Ноябрь 2008 г., 2:07
 */

package lab4;

import java.awt.Color;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.*;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author  mozEvil
 */
public class HideProtocol extends javax.swing.JFrame {

    public HideProtocol(){
        initComponents();
        initKEYS();
    }
    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HideProtocol().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label_check = new java.awt.Label();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        textField1 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        textField_keystr = new java.awt.TextField();
        textField_hidestr = new java.awt.TextField();
        textField3 = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("mozEvil : Lab4 (скрытый протокол)");

        jButton1.setText("А");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Б");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setText("-------------------");

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setText("-------------------");

        label_check.setAlignment(java.awt.Label.CENTER);
        label_check.setBackground(java.awt.Color.yellow);
        label_check.setText("check");

        jButton3.setText("?????");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Б");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("A");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("check");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        textField1.setEditable(false);
        textField1.setEnabled(false);
        textField1.setText("невинное сообщение");

        textField2.setEditable(false);
        textField2.setEnabled(false);
        textField2.setText("подписанное сообщение");

        textField_keystr.setEditable(false);
        textField_keystr.setEnabled(false);
        textField_keystr.setText("подпись");

        textField_hidestr.setEditable(false);
        textField_hidestr.setEnabled(false);
        textField_hidestr.setText("скрытое сообщение");

        textField3.setEditable(false);
        textField3.setEnabled(false);
        textField3.setText("скрытое сообщение");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField_hidestr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(textField_keystr, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jButton4)
                    .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField_keystr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_check, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField_hidestr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * ручная авторизация, А отправляет ответ
 */
private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    zprB = true;
    A();
    if (label1.getText().equals(label2.getText())){
        jButton3.setText("TRUE");
        textField1.setEnabled(true);
        textField1.setEditable(true);
        textField3.setEnabled(true);
        textField3.setEditable(true);
        textField1.setText("");
        textField3.setText("");
        aut = true;
    }
    else {
        jButton3.setText("FALSE");
        textField1.setEnabled(false);
        textField1.setEditable(false);
        textField1.setText("невинное сообщение");
        textField3.setEnabled(false);
        textField3.setEditable(false);
        textField3.setText("скрытое сообщение");
        aut = false;
    }
}//GEN-LAST:event_jButton1MouseClicked
/**
 * ручная авторизация, Б посылает запрос 
 */
private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
    zprA = true;
    a1 = false;
    aut = false;
    jButton3.setText("?????");
    textField1.setEnabled(false);
    textField1.setEditable(false);
    textField2.setEnabled(false);
    textField2.setEditable(false);
    textField_hidestr.setEnabled(false);
    textField_hidestr.setEditable(false);
    textField_keystr.setEnabled(false);
    textField_keystr.setEditable(false);
    textField3.setEnabled(false);
    textField3.setEditable(false);
    textField3.setText("скрытое сообщение");
    textField1.setText("невинное сообщение");
    textField2.setText("подписанное сообщение");
    textField_keystr.setText("r:s");
    textField_hidestr.setText("скрытое сообщение");
    label_check.setText("check");
    label_check.setBackground(Color.YELLOW);
    B();
}//GEN-LAST:event_jButton2MouseClicked
/**
 * авто авторизиция
 */
private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
    zprA = true;
    zprB = true;
    jButton3.setText("?????");

    for (int i=0; i<3; i++){
        switch (i) {
            case 0: B();
            break;
            case 1: A();
            break;
            case 2: if (label1.getText().equals(label2.getText())){
                        jButton3.setText("TRUE");
                        textField1.setEnabled(true);
                        textField1.setEditable(true);
                        textField3.setEnabled(true);
                        textField3.setEditable(true);
                        textField1.setText("");
                        textField3.setText("");
                        aut = true;
                    }
                    else {
                        jButton3.setText("FALSE");
                        textField1.setEnabled(false);
                        textField1.setEditable(false);
                        textField1.setText("невинное сообщение");
                        textField3.setEnabled(false);
                        textField3.setEditable(false);
                        textField3.setText("скрытое сообщение");
                        aut = false;
                    }
            break;
            default: 
            // Неверный выбор.
            break;
        }        
    }
}//GEN-LAST:event_jButton3MouseClicked
/**
 * подписываем сообщение
 */
private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
    if (aut){
            try {
                a1 = true;
                textField2.setText(textField1.getText());
                textField2.setEnabled(true);
                textField_keystr.setEnabled(true);
                
                textField_keystr.setText(ecp.podpisat(textField1.getText(), textField3.getText()));


            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(HideProtocol.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}//GEN-LAST:event_jButton4MouseClicked
/**
 * проверяем подписанное сообщение
 */
private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
    if(a1){
            try {
                
                textField2.setEditable(true);
                if (ecp.proverit(textField2.getText(), textField_keystr.getText())) {
                    label_check.setText("true");
                    label_check.setBackground(Color.GREEN);
                }
                else {
                    label_check.setText("false");
                    label_check.setBackground(Color.RED);
                }

            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(HideProtocol.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}//GEN-LAST:event_jButton6MouseClicked
/**
 * извлекаем скрытое сообщение
 */
private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
    if (a1){
            try {

                textField_hidestr.setEnabled(true);
                textField_hidestr.setText(ecp.izvlech(textField2.getText(), textField_keystr.getText()));

            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(HideProtocol.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}//GEN-LAST:event_jButton5MouseClicked

void B(){
    try{
        if (zprA){ 
            Random rnd = new Random();
            ccA = rnd.nextInt();  // рандомное число отпавляет абонетну А
            label1.setText(""+ GOST.encrypt(""+ccA)); // шифрует это число своим ключем
            zprA = false;
        }        
    }
    catch (UnsupportedEncodingException ex) {
        Logger.getLogger(HideProtocol.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalBlockSizeException ex) {
        Logger.getLogger(HideProtocol.class.getName()).log(Level.SEVERE, null, ex);
    } catch (BadPaddingException ex) {
        Logger.getLogger(HideProtocol.class.getName()).log(Level.SEVERE, null, ex);
    }    catch (GeneralSecurityException exception){exception.printStackTrace();}
} 
void A(){
    try{        
        if (zprB){            
            label2.setText(""+ GOST.encrypt(""+ccA));
            zprB = false;
        }        
    }
    catch (UnsupportedEncodingException ex) {
        Logger.getLogger(HideProtocol.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalBlockSizeException ex) {
        Logger.getLogger(HideProtocol.class.getName()).log(Level.SEVERE, null, ex);
    } catch (BadPaddingException ex) {
        Logger.getLogger(HideProtocol.class.getName()).log(Level.SEVERE, null, ex);
    }    catch (GeneralSecurityException exception){exception.printStackTrace();}
}

/**
 * Электронно цифровая подпись
 */
class ECP {
    BigInteger Hash10;
    String Hash16, Hash2;
    int q, p, a, x, y;
    BigInteger qBig, pBig, aBig, xBig, yBig;
    BP bp = new BP();

ECP(){
    int b = 0;
    qBig = bp.nextRandBP(16);               q = qBig.intValue();
    do{
        b += 2;
        p = b*q + 1;                        pBig = BigInteger.valueOf(p);
    }
    while (!bp.TestFerma(pBig, 16));

    for (int i=2; i<p; i++){
        a = i;                              aBig = BigInteger.valueOf(a);
        if (aBig.modPow(qBig, pBig).equals(BigInteger.valueOf(1)))
            break;
    }

    x = (int)Math.round(q*Math.random());   xBig = BigInteger.valueOf(x);
    yBig = aBig.modPow(xBig, pBig);         y = yBig.intValue();

}
/**
 *  подписываем сообщение со встроеным скрытым сообщением
 */
 String podpisat(String str, String hideStr) throws NoSuchAlgorithmException{
   int k = 0, r = 0, s = 0;
   int e = getE(str);
   do{
       do{
           k = getK(hideStr);
           r = aBig.modPow(BigInteger.valueOf(k), pBig).intValue();
           r = r%q;
       }while(r == 0);
       int s1 = (k*e)%q;
       int s2 = (x*r)%q;
       s = (s1 + s2)%q;
   }while(s == 0);

   return  r +":"+ s;
}
/**
 * подписываем введенный текст
 */
String podpisat(String str) throws NoSuchAlgorithmException{
   int k = 0, r = 0, s = 0;
   int e = getE(str); 
   do{
       do{
           k = getK();      
           r = aBig.modPow(BigInteger.valueOf(k), pBig).intValue(); 
           r = r%q;         
       }while(r == 0);
       int s1 = (k*e)%q;
       int s2 = (x*r)%q;
       s = (s1 + s2)%q;
   }while(s == 0);

   return  r +":"+ s;
}
String izvlech(String str, String keystr) throws NoSuchAlgorithmException{
    int r = 0, s = 0;
    for (int i=0; i<keystr.length(); i++)
        if (keystr.charAt(i) == ':'){
            r = Integer.parseInt(keystr.substring(0, i));
            s = Integer.parseInt(keystr.substring(i+1));
        }
    int e = getE(str);
    int v = (BigInteger.valueOf(e).modInverse(qBig)).intValue(); 
    BigInteger z = BigInteger.valueOf(s).subtract(xBig.multiply(BigInteger.valueOf(r)));
               z = z.mod(qBig);                                    
               z = z.multiply(BigInteger.valueOf(v));
               z = z.mod(qBig);                                    
    return "" + z;
}

/**
 * проверяем подписанный текст
 */
boolean proverit(String str, String keystr) throws NoSuchAlgorithmException{
    int r = 0, s = 0;
    BigInteger R = BigInteger.valueOf(0);
    for (int i=0; i<keystr.length(); i++)
        if (keystr.charAt(i) == ':'){
            r = Integer.parseInt(keystr.substring(0, i));
            s = Integer.parseInt(keystr.substring(i+1));
        }
    int e = getE(str);
    int v = (BigInteger.valueOf(e).modInverse(qBig)).intValue();  
    int u1 = (s*v)%q;
    int u2 = (q-r)*v;
        u2 = u2%q;
    
    BigInteger R1 = aBig.modPow(BigInteger.valueOf(u1), pBig);
    BigInteger R2 = yBig.modPow(BigInteger.valueOf(u2), pBig);
    R = (R1.multiply(R2)).mod(pBig);
    R = R.mod(qBig);
    
    if (R.intValue() == r)
        return true;
    else
        return false;
}

private int getE(String str) throws NoSuchAlgorithmException{
    Hash2 = "";
    Hash10 = BigInteger.valueOf(0);
    Hash16 = HashGOST(str.getBytes());
    //------------переводим подпись из 16-рич. в 2-ич.-------------------
    for (int i=0; i<Hash16.length(); i+=3){
        String bufstr16 = Hash16.substring(i, i+2);
        int bufint = Integer.parseInt(bufstr16, 16);
        String bufstr2 = Integer.toString(bufint, 2);
        if (bufstr2.length()<8)
            bufstr2 = "00000000".substring(0, 8 - bufstr2.length()) + bufstr2;
        Hash2+=bufstr2;
    }// -----------------переводим из 2 в 10--------------------------------
    for(int i=0; i<128; i++)
           Hash10 = Hash10.add(BigInteger.valueOf(Integer.parseInt("" +
                   Hash2.charAt(i))).multiply(BigInteger.valueOf(2).pow(127-i))); // sum = sum + (0|1)*2^(127-i);
    //----------------------------------------------------------------------
    if(Hash10.mod(qBig).equals(BigInteger.valueOf(0)))
        return 1; 
    return Hash10.mod(qBig).intValue();
}
private int getK(){
    int k = 0;
    do k = (int)Math.round(q*Math.random()); 
    while (k<=0 && k>=q); 
    return k;    
}
private int getK(String hideStr){
    try {
        return Integer.parseInt(hideStr);
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e, "Error", 0);
        return 0;
    }

}
/**
 * возвращает хеш код
 * @param массив байт
 * @return хеш код
 */
String HashGOST(byte[] bt) throws NoSuchAlgorithmException{
    MessageDigest hash = MessageDigest.getInstance(GOST_Р341194);
    hash.reset();
    hash.update(bt);
    String HashStr = "";    
    byte[] hs = hash.digest();
    for(int i=0; i<hs.length; i++){
        int v = hs[i] & 0xFF;
        if (v < 16) HashStr += "0";
        HashStr += Integer.toString(v, 16).toUpperCase() + " ";
    }    
    return HashStr;
}
    }
/**
 * инициализируем ключи
 */
void initKEYS(){
    try{
        KeyGenerator keygen = KeyGenerator.getInstance(GOST_2814789);
        SecureRandom random = new SecureRandom();
        keygen.init(random);      
        key256 = keygen.generateKey();            
        GOST = new GOST_28147_89(key256);
        ecp = new ECP();
    }
    catch (GeneralSecurityException exception){exception.printStackTrace();}
}
/**
 * ГОСТ 28147-89 шифруем и расшифровываем
 */
class GOST_28147_89{
    private Cipher ecipher;
    private Cipher dcipher;
    
public GOST_28147_89(SecretKey key) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
    ecipher = Cipher.getInstance(GOST_2814789);
    dcipher = Cipher.getInstance(GOST_2814789);
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
/**
 * Большие простые числа
 */
public class BP{

public BigInteger nextRandBP(int bit){
    BigInteger n;
    do n = getRand(bit);
    while (TestFerma(n, bit) == false);
    return n;
}
private BigInteger getRand(int bit){ //получаем рандомное bit-битное НЕ ЧЕТНОЕ число
    BigInteger sum = BigInteger.valueOf(2).pow(bit-1); // т.к. 1-й бит = 1 всегда           
    for( int i=1; i<(bit-1); i++)  // щитаем число
        sum = sum.add(BigInteger.valueOf((int)Math.round(Math.random())).multiply(BigInteger.valueOf(2).pow(bit-i-1)));                                                
    return sum.add(BigInteger.valueOf(1)); // добавляем 1 т.к. последний бит = 1 всегда      
}
private BigInteger getRandA(int bit){
    BigDecimal min = BigDecimal.valueOf(2).pow(bit-1);
    min = min.multiply(BigDecimal.valueOf(Math.random())); // min = min*[0,1)
    return min.toBigInteger();
}    
private boolean TestFerma(BigInteger n, int bit){
    for (int i=1; i<=50; i++){
        if(getRandA(bit).modPow(n.subtract(BigInteger.valueOf(1)),n).equals(BigInteger.valueOf(1)))                
            continue;            
        else
            return false;
    }
    return true;
}    
}

   
    ECP ecp;
    GOST_28147_89 GOST;
    SecretKey key256;
    int ccA, ccB;
    boolean zprB = true, zprA = true, a1 = false, aut = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label_check;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField_hidestr;
    private java.awt.TextField textField_keystr;
    // End of variables declaration//GEN-END:variables
    String GOST_2814789 = "DES";
    String GOST_Р341194 = "MD5";
}
