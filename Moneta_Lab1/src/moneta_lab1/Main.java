/*
 * Main.java
 *
 * Created on 8 Октябрь 2008 г., 20:54
 */

package moneta_lab1;

import java.util.Random;


/**
 *
 * @author  MozEvil
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        Bob.setVisible(true);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bob = new javax.swing.JFrame();
        jButton2 = new javax.swing.JButton();
        textField1 = new java.awt.TextField();
        label1 = new java.awt.Label();
        label3 = new java.awt.Label();
        jButton4 = new javax.swing.JButton();
        label4 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        label2 = new java.awt.Label();
        jButton3 = new javax.swing.JButton();
        label5 = new java.awt.Label();

        Bob.setTitle("Bob");
        Bob.setMinimumSize(new java.awt.Dimension(225, 180));
        Bob.setName("frameBob"); // NOI18N

        jButton2.setText("Отправить догадку");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        textField1.setText("1");

        label1.setText("----------------------------------------------");

        label3.setText("Результат: ");

        jButton4.setText("Проверить");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        label4.setText("???");

        javax.swing.GroupLayout BobLayout = new javax.swing.GroupLayout(Bob.getContentPane());
        Bob.getContentPane().setLayout(BobLayout);
        BobLayout.setHorizontalGroup(
            BobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BobLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addGroup(BobLayout.createSequentialGroup()
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(BobLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BobLayout.setVerticalGroup(
            BobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BobLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alise");
        setName("frameAlise"); // NOI18N

        jButton1.setText("Подбросить монету, зашифровать и отправить");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        label2.setText("Догадка :");

        jButton3.setText("Отправить результат");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        label5.setText("Key = ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
// бросаем монету шифруем отправляем
    c1 = false;
    c2 = false;
    c3 = false;
    Bob.setVisible(true);
    label1.setText("----------------------------------------------");
    label2.setText("Догадка :");
    label3.setText("Результат: ");
    label4.setText("???");
    
    Random rand = new Random(); 
    key = rand.nextInt(1000000);
    moneta = rand.nextInt(1000000);
    System.out.println(moneta);
    crypto = ZA(moneta, key);
    
    label5.setText("Key = " + key);
    label1.setText("" + crypto);   
    
    c1 = true;
 
        
}//GEN-LAST:event_jButton1MouseClicked

private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
// отправить догадку
    if (c1){
        label2.setText("Догадка : " + textField1.getText());    
        c2 = true;
    }
    
}//GEN-LAST:event_jButton2MouseClicked

private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
// отправить результат
    if (c2){
        int a1 = Integer.parseInt(textField1.getText());
        int a2 = moneta%2;
        if (a1 == a2)
            label3.setText("Результат: Угадал =)");
        else label3.setText("Результат: НЕ Угадал =(");
        c3 = true;
    }
}//GEN-LAST:event_jButton3MouseClicked

private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
// проверка   
    if (c3){
        label4.setText("" + RA(crypto,key));
        c1 = false;
        c2 = false;
        c3 = false;
    }
}//GEN-LAST:event_jButton4MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);

            }
        });
    }
    
    
   int ZA(int in, int key){
       in = in + key;
       in = in * 2;
       in = in - key;
       return in;
   }

   int RA(int in, int key){
       in = in + key;
       in = in/2;
       in = in - key;
       return in;
   }

    private int moneta, crypto, key;
    private boolean c1, c2, c3;
   // private String moneta;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Bob;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.TextField textField1;
    // End of variables declaration//GEN-END:variables

}
