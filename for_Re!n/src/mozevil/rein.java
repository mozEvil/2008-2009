/*
 * rein.java
 *
 * Created on 18.02.2009, 17:10:54
 */

package mozevil;

import java.math.BigInteger;
import javax.swing.JOptionPane;

/**
 *
 * @author mozEvil
 */
public class rein extends javax.swing.JFrame {

    /** Creates new form rein */
    public rein() {
        initComponents();
        max64 = BigInteger.valueOf(2).pow(64);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_A_High = new javax.swing.JTextField();
        jTextField_A_Low = new javax.swing.JTextField();
        jLabel_A = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_B_High = new javax.swing.JTextField();
        jTextField_B_Low = new javax.swing.JTextField();
        jLabel_B = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField_Res_High = new javax.swing.JTextField();
        jTextField_Res_Low = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel_Res = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_P = new javax.swing.JLabel();
        jTextField_P_High = new javax.swing.JTextField();
        jTextField_P_Low = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("a = ");

        jTextField_A_High.setText("18446744073709551615");

        jTextField_A_Low.setText("18446744073709551615");

        jLabel2.setText("b = ");

        jTextField_B_High.setText("18446744073709551615");

        jTextField_B_Low.setText("18446744073709551615");

        jButton2.setText("a + b");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton3.setText("a * b mod p");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        jButton4.setText("a mod b");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });

        jButton5.setText("a^2 mod p");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });

        jButton6.setText("a^b mod p");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });

        jLabel3.setText("p = ");

        jTextField_P_High.setText("18446744073709551615");

        jTextField_P_Low.setText("18446744073709551615");

        jButton1.setText("a + b mod p");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_A, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_A_High, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_A_Low, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(190, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_B, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_B_High, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_B_Low, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(193, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_P, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_P_High, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_P_Low, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel_Res, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                                        .addGap(20, 20, 20))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField_Res_High, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_Res_Low, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)))))))
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_A_High, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_A_Low, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_A, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_B_High, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_B_Low, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_B, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_P_High, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_P_Low, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_P, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Res_High, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Res_Low, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Res, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
    // a + b
    input();
    Res = A.add(B);
    result();
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
    // a * b mod p
    input();
    Res = A.multiply(B).mod(P);
    result();
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
    // a mod b
    input();
    Res = A.mod(B);
    result();
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
    // a^2 mod p
    input();
    Res = A.multiply(A).mod(P);
    result();
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
    // a^b mod p
    input();
   /* if (A.equals(BigInteger.valueOf(0))) {
        Res = BigInteger.valueOf(0);
    }else {
        Res = BigInteger.valueOf(1);
        BigInteger i = BigInteger.valueOf(0);
        while(!i.equals(B)){
            Res = Res.multiply(A);
            i = i.add(BigInteger.valueOf(1));
        }
    }*/
    Res = A.modPow(B, P);
    result();
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
    // a + b mod p
    input();
    Res = A.add(B).mod(P);
    result();

    }//GEN-LAST:event_jButton1MousePressed



void input(){
    try {

        a_high = jTextField_A_High.getText().trim();
        a_low = jTextField_A_Low.getText().trim();
        b_high = jTextField_B_High.getText().trim();
        b_low  = jTextField_B_Low.getText().trim();
        p_high = jTextField_P_High.getText().trim();
        p_low  = jTextField_P_Low.getText().trim();

        // извращения юного гения
        if (a_high.length() == 20)
            A_high = BigInteger.valueOf(Long.parseLong(a_high.substring(1))).add(BigInteger.valueOf(Long.parseLong(""+a_high.charAt(0))).multiply(BigInteger.valueOf(10000000000L)).multiply(BigInteger.valueOf(1000000000L)));
        else A_high = BigInteger.valueOf(Long.parseLong(a_high));
        if (a_low.length() == 20)
           A_low = BigInteger.valueOf(Long.parseLong(a_low.substring(1))).add(BigInteger.valueOf(Long.parseLong(""+a_low.charAt(0))).multiply(BigInteger.valueOf(10000000000L)).multiply(BigInteger.valueOf(1000000000L)));
        else A_low = BigInteger.valueOf(Long.parseLong(a_low));
        if (b_high.length() == 20)
            B_high = BigInteger.valueOf(Long.parseLong(b_high.substring(1))).add(BigInteger.valueOf(Long.parseLong(""+b_high.charAt(0))).multiply(BigInteger.valueOf(10000000000L)).multiply(BigInteger.valueOf(1000000000L)));
        else B_high = BigInteger.valueOf(Long.parseLong(b_high));
        if (b_low.length() == 20)
           B_low = BigInteger.valueOf(Long.parseLong(b_low.substring(1))).add(BigInteger.valueOf(Long.parseLong(""+b_low.charAt(0))).multiply(BigInteger.valueOf(10000000000L)).multiply(BigInteger.valueOf(1000000000L)));
        else B_low = BigInteger.valueOf(Long.parseLong(b_low));
        if (p_high.length() == 20)
            P_high = BigInteger.valueOf(Long.parseLong(p_high.substring(1))).add(BigInteger.valueOf(Long.parseLong(""+p_high.charAt(0))).multiply(BigInteger.valueOf(10000000000L)).multiply(BigInteger.valueOf(1000000000L)));
        else P_high = BigInteger.valueOf(Long.parseLong(p_high));
        if (p_low.length() == 20)
           P_low = BigInteger.valueOf(Long.parseLong(p_low.substring(1))).add(BigInteger.valueOf(Long.parseLong(""+p_low.charAt(0))).multiply(BigInteger.valueOf(10000000000L)).multiply(BigInteger.valueOf(1000000000L)));
        else P_low = BigInteger.valueOf(Long.parseLong(p_low));
        //--

        // собираем из 2-х 64 битных чисел одно 128 битное
        A = A_high.shiftLeft(64);
        A = A.add(A_low);
        jLabel_A.setText(A+"");

        B = B_high.shiftLeft(64);
        B = B.add(B_low);
        jLabel_B.setText(B+"");

        P = P_high.shiftLeft(64);
        P = P.add(P_low);
        jLabel_P.setText(P+"");
        //--
        
     } catch (Exception e) {
         JOptionPane.showMessageDialog(rootPane, e);
    }
}
void result(){ //разбираем 128 битное число на 2 64 битных
    try {
        
        Res_low = Res.mod(max64);
        T = Res.subtract(Res_low);
        Res_high = T.divide(max64);
        jTextField_Res_High.setText(""+Res_high);
        jTextField_Res_Low.setText(""+Res_low);
        jLabel_Res.setText(""+Res);
        
        if (Res.bitLength() > 128)
            JOptionPane.showMessageDialog(rootPane, "полученное число больше 128 бит");
        
    } catch (Exception e) {
         JOptionPane.showMessageDialog(rootPane, e);
    }
}

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rein().setVisible(true);
            }
        });
    }

    String a_high, a_low, b_high, b_low, p_high, p_low;
    BigInteger A, B, T, A_high, A_low, B_high, B_low, Res, Res_low, Res_high, max64, P_high, P_low, P;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_A;
    private javax.swing.JLabel jLabel_B;
    private javax.swing.JLabel jLabel_P;
    private javax.swing.JLabel jLabel_Res;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField_A_High;
    private javax.swing.JTextField jTextField_A_Low;
    private javax.swing.JTextField jTextField_B_High;
    private javax.swing.JTextField jTextField_B_Low;
    private javax.swing.JTextField jTextField_P_High;
    private javax.swing.JTextField jTextField_P_Low;
    private javax.swing.JTextField jTextField_Res_High;
    private javax.swing.JTextField jTextField_Res_Low;
    // End of variables declaration//GEN-END:variables

}

/*
 *
вот так перевести 128 битное число к старшей и младшей части:
    int128 a,t; //a= искомое число
    int64 high,low;

    low=a mod 18446744073709551616;
    t=a-low;
    high=t/18446744073709551616;
 *
вот так из старшей и младшей частей по 64 бита собирается одно 128 битное число:
    int128 a;
    int64 high,low;

    a=hight;
    a=a <<(битовый сдвиг влево) 64;
    a=a+low;

напиши пож код который делает следующее:
 задаются a,b числа длинной 128 бит и над ними производятся следующие операции :
    +,*, mod,a^2(возведение в квадрат), a^b(возведение в степень)

- a,b задаются как старшая и младшая частьи
- результаты операций выводяться как старшая и младшая части
- если при операциях сложение,умножение,возведения полученое число больше чем 128 бит выводить сообщение об этом


 */
