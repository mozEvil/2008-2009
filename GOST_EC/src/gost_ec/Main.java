/**
 * @author  mozEvil
 *
 * Created on 4 Август 2008 г., 21:47
 */ 
package gost_ec;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.*;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    public Main() {
        initComponents();        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        labelA = new java.awt.Label();
        labelB = new java.awt.Label();
        labelp = new java.awt.Label();
        jButton3 = new javax.swing.JButton();
        textFieldp = new java.awt.TextField();
        textFieldB = new java.awt.TextField();
        textFieldA = new java.awt.TextField();
        labelq = new java.awt.Label();
        textFieldq = new java.awt.TextField();
        jButton4 = new javax.swing.JButton();
        textFieldBitP = new java.awt.TextField();
        textFieldBitQ = new java.awt.TextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textFieldd = new java.awt.TextField();
        jPanel9 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        labelQ = new java.awt.Label();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        labelP = new java.awt.Label();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        textFieldHash1 = new java.awt.TextField();
        textFieldHash2 = new java.awt.TextField();
        jPanel6 = new javax.swing.JPanel();
        list1 = new java.awt.List();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textFieldr = new java.awt.TextField();
        textFields = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        labelCheck = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldText1 = new java.awt.TextField();
        textFieldText2 = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ГОСТ Р 34.10-2001");

        labelA.setText("A = ");

        labelB.setText("B = ");

        labelp.setText("p = ");

        jButton3.setText("p");
        jButton3.setActionCommand("Rand p");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        textFieldp.setText("401");

        textFieldB.setText("81");

        textFieldA.setText("7");

        labelq.setText("q =");

        textFieldq.setText("127");

        jButton4.setText("q");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });

        textFieldBitP.setText("9");

        textFieldBitQ.setText("8");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldBitP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                            .addComponent(textFieldA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                            .addComponent(textFieldp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldBitQ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldq, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(textFieldBitP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(textFieldBitQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Параметры", jPanel2);

        jLabel6.setText("Секретный ключ (0 < d < q)");

        jLabel7.setText("d =");

        textFieldd.setText("11");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldd, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton8.setText("Найти открытый ключ Q");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
        });

        labelQ.setFont(new java.awt.Font("Dialog", 1, 14));
        labelQ.setForeground(new java.awt.Color(255, 51, 51));
        labelQ.setText("(?,?)");

        jLabel8.setText("Открытый ключ (dP = Q),  Q(x,y) = ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelQ, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelQ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton7.setText("Найти точку Р");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
        });

        jLabel5.setText("Найти точку (qP = 0),   P(x,y)  =");

        labelP.setFont(new java.awt.Font("Dialog", 1, 14));
        labelP.setForeground(new java.awt.Color(255, 51, 51));
        labelP.setText("(?,?)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ключи", jPanel4);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldHash2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                    .addComponent(textFieldHash1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldHash1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldHash2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Хеш", jPanel7);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(461, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Все точки", jPanel6);

        jLabel4.setText("Подпись:");

        jButton1.setText("Подписать");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(textFieldr, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFields, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelCheck.setText("......................");

        jButton2.setText("Проверить");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(44, 44, 44)
                .addComponent(labelCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelCheck, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Исходный текст:");

        jLabel3.setText("Подписаснный текст:");

        textFieldText1.setText("На основе лабораторной работы №5 модифицировать свою криптосистему");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldText1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                    .addComponent(textFieldText2, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(textFieldText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldText2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
    // генерим p
    textFieldp.setText("" + getRandTestFerma(Integer.parseInt(textFieldBitP.getText())));
}//GEN-LAST:event_jButton3MousePressed
private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
    //генерим q
    textFieldq.setText("" + getRandTestFerma(Integer.parseInt(textFieldBitQ.getText())));
}//GEN-LAST:event_jButton4MousePressed
private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
   //поиск точки P
    list1.removeAll();  P[0] = 0;   P[1] = 0;   labelP.setText(P[0]+","+P[1]);
    try {
        a = Integer.parseInt(textFieldA.getText());   aBig = BigInteger.valueOf(a);
        b = Integer.parseInt(textFieldB.getText());   bBig = BigInteger.valueOf(b);
        p = Integer.parseInt(textFieldp.getText());   pBig = BigInteger.valueOf(p);
        q = Integer.parseInt(textFieldq.getText());   qBig = BigInteger.valueOf(q); 
        
        if (Check())
            LookingForP();
        else
            JOptionPane.showMessageDialog(null, "Суперсингулярная кривая"); 
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, e, "Error", 0);
    } 
}//GEN-LAST:event_jButton7MousePressed
private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
    //щитаем открытый ключ Q
    d = Integer.parseInt(textFieldd.getText());
    Q = getPointMultiply(d,P);
    labelQ.setText(Q[0]+","+Q[1]);   
}//GEN-LAST:event_jButton8MousePressed
private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
// подписываем сообщение
   labelCheck.setText("----");
   textFieldText2.setText(textFieldText1.getText());
   LookingForAlfa(1); 
   int e = getE(); 
   int k = 0;
   r = 0;
   s = 0;
   do{
       do{
           k = getK();
           C = getPointMultiply(k,P);       
           r = C[0]%q;
       }while(r == 0);
       int s1 = (r*d)%q;
       int s2 = (k*e)%q;
       s =  (s1 + s2)%q;
   }while(s == 0);
   textFieldr.setText(""+r);
   textFields.setText(""+s);
}//GEN-LAST:event_jButton1MousePressed
private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
//проверка подписанного сообщения   
    LookingForAlfa(2);
    int e = getE(); 
    int v = (BigInteger.valueOf(e).modInverse(qBig)).intValue(); 
    int z1 = (s*v)%q;                           
    int z2 = (-r*v)%q; 
    z2 = (q+z2)%q;                              
    int[] xy1 = new int[2];
    int[] xy2 = new int[2];
    xy1 = getPointMultiply(z1,P);
    xy2 = getPointMultiply(z2, Q);
    C = PlusPoint(xy1[0],xy1[1],xy2[0],xy2[1]);
    R = (C[0])%q;                              
    if (R == r) labelCheck.setText("true");
        else labelCheck.setText("false");
}//GEN-LAST:event_jButton2MousePressed
BigInteger getRand(int bit){ //получаем рандомное bit-битное НЕ ЧЕТНОЕ число      
    BigInteger sum = BigInteger.valueOf(2).pow(bit-1); // т.к. 1-й бит = 1 всегда           
    for( int i=1; i<(bit-1); i++)  // щитаем число
        sum = sum.add(BigInteger.valueOf((int)Math.round(Math.random())).multiply(BigInteger.valueOf(2).pow(bit-i-1)));                                                
    return sum.add(BigInteger.valueOf(1)); // добавляем 1 т.к. последний бит = 1 всегда      
}
BigInteger getRandA(int bit){
    BigDecimal min = BigDecimal.valueOf(2).pow(bit-1);
    min = min.multiply(BigDecimal.valueOf(Math.random())); // min = min*[0,1)
    return min.toBigInteger();
}    
boolean TestFerma(BigInteger n, int bit){
    for (int i=1; i<=50; i++){
        if(getRandA(bit).modPow(n.subtract(BigInteger.valueOf(1)),n).equals(BigInteger.valueOf(1)))                
            continue;            
        else
            return false;
    }
    return true;
}    
BigInteger getRandTestFerma(int bit){
    BigInteger n;
    do n = getRand(bit);    
    while (TestFerma(n, bit) == false);
    return n;
}
boolean Check(){    // 4A^3 + 27B^2 != 0  (mod p) // проверка на суперсингулярность
    int A = (a*a*a*4)%p;
    int B = (b*b*27)%p;
    if ((A + B)%p == 0)
 //   if ((((aBig.pow(3).multiply(BigInteger.valueOf(4))).add(bBig.pow(2).multiply(BigInteger.valueOf(27)))).mod(pBig)).equals(BigInteger.valueOf(0)))
        return false;
    return true;    
}
void LookingForP(){
    boolean mod = false;
    for (int x=0; x<=p; x++)     
        for (int y=0; y<=p; y++)  
            if (CheckPoint(x, y, a, b, p)){             
                list1.add(x + "," + y);
                if (y != 0) list1.add(x + "," + -y);
                if (mod == false){
                    if (CheckP(x,y)){
                        P[0] = x;
                        P[1] = y;
                        labelP.setText(P[0]+","+P[1]);
                        mod = true;
                    }
                    if (y != 0)
                        if (CheckP(x,-y)){
                            P[0] = x;
                            P[1] = -y;
                            labelP.setText(P[0]+","+P[1]);
                            mod = true;
                        }                    
                }
                break;
            }
}
boolean CheckPoint(int x, int y, int a, int b, int p){
    //(x*x*x + a*x + b)%p == (y*y)%p
    int X1 = x*x*x;
    int X2 = a*x;
    int X = (X1 + X2 + b)%p;
    int Y = (y*y)%p;
    if (X == Y)
        return true;
    return false;
}
boolean CheckP (int x, int y){    
    int[] buf = new int[]{x,y};
    int[] bufP = new int[2];
    bufP = getPointMultiply(q, buf);
    if (bufP[0] == 0 && bufP[1] == 0)
        return true;
    else
        return false;    
}
/**
 * возвращает Х и У с наименшим вычетом по модулю p
 */
int[] ppc(int X, int Y){
    int[] buf = new int[2];
    if (X<0) X = (X+p)%p;
    if (Y<0 && Y<-p/2) Y = (Y+p)%p;
    if (Y>0 && Y>p/2) Y = (Y-p)%p; 
    buf[0] = X;
    buf[1] = Y;
    return buf;     
}
int[] PlusPoint(int x1, int y1, int x2, int y2){
    int X, Y, S;    
    if (x1 == 0 && y1 == 0)
        return ppc(x2,y2);
    else 
        if (x2 == 0 && y2 == 0)
            return ppc(x1,y1);
        else
            if (x1 != x2) {     //(y2 - y1)/(x2 - x1) , если P <> Q                  
                int xInvers = (BigInteger.valueOf(x2-x1).modInverse(pBig)).intValue();                
                S = (y2-y1)%p;          
                S= (S * xInvers)%p;    
                X = (S*S)%p; 
                X = (X - x1)%p; 
                X = (X - x2)%p;
                Y = S*(x1 - X);         
                Y = (Y - y1)%p;
                return ppc(X,Y); 
            }else 
                if (y1 == -y2)
                    return ppc(0,0);
                else
                    if (y1 == y2){          //(3*x1^2 + a)/(2*y1) , если P = Q                   
                        int yInvers = (BigInteger.valueOf(2*y1).modInverse(pBig)).intValue();
                        S = (3*x1*x1)%p;
                        S = (S + a)%p;
                        S= (S * yInvers)%p;
                        X = (S*S)%p; 
                        X = (X - x1)%p; 
                        X = (X - x2)%p;
                        Y = (x1 - X)*S;
                        Y = (Y - y1)%p;
                        return ppc(X,Y);
                    }else 
                        return ppc(0,0); 
}
int[] getPointMultiply(int kolvo, int[]t4k){
    int x=t4k[0],y=t4k[1], X=t4k[0], Y=t4k[1];       
    for (int j=1; j<kolvo; j++){   // кратность
        t4k = PlusPoint(x, y, X, Y);
        X = t4k[0];
        Y = t4k[1];        
    }
    return t4k;
}
String Podpis(byte[] bt){
    MessageDigest md5;
    String HashStr = "";
    try{
        md5 = MessageDigest.getInstance("MD5");
        md5.reset();
        md5.update(bt);
        byte[] hash = md5.digest();
        for(int i=0; i<hash.length; i++){
            int v = hash[i] & 0xFF;
            if (v < 16) HashStr += "0";
            HashStr += Integer.toString(v, 16).toUpperCase() + " ";
        }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e, "Error", 0);
    }
    return HashStr;
}
int getE(){
    if(Hash10.mod(qBig).equals(BigInteger.valueOf(0)))
        return 1; 
    return Hash10.mod(qBig).intValue();
}
int getK(){
    int k = 0;
    do k = (int)Math.round(q*Math.random()); 
    while (k<=0 && k>=q); 
    return k;    
}
void LookingForAlfa(int modif){
    Hash16 = "";  
    Hash2 = "";  
    Hash10 = BigInteger.valueOf(0);    
    String text = "";
    if (modif == 1){
        textFieldHash1.setText(""); 
        textFieldHash2.setText("");
        text = textFieldText1.getText();
        Hash16 = Podpis(text.getBytes());    
        textFieldHash1.setText(Hash16);
    }else{
        textFieldHash2.setText("");
        text = textFieldText2.getText();
        Hash16 = Podpis(text.getBytes());    
        textFieldHash2.setText(Hash16);
    }//------------переводим подпись из 16-рич. в 2-ич.-------------------
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
}
    public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);                
            }
        }); 
    }
    
    private BigInteger Hash10;
    private String Hash16, Hash2;
    private int[] P = new int[2];
    private int[] Q = new int[2];
    private int[] C = new int[2];
    private BigInteger aBig, pBig, qBig, bBig;
    private int a, b, p, q, d, s, r, R;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label labelA;
    private java.awt.Label labelB;
    private java.awt.Label labelCheck;
    private java.awt.Label labelP;
    private java.awt.Label labelQ;
    private java.awt.Label labelp;
    private java.awt.Label labelq;
    private java.awt.List list1;
    private java.awt.TextField textFieldA;
    private java.awt.TextField textFieldB;
    private java.awt.TextField textFieldBitP;
    private java.awt.TextField textFieldBitQ;
    private java.awt.TextField textFieldHash1;
    private java.awt.TextField textFieldHash2;
    private java.awt.TextField textFieldText1;
    private java.awt.TextField textFieldText2;
    private java.awt.TextField textFieldd;
    private java.awt.TextField textFieldp;
    private java.awt.TextField textFieldq;
    private java.awt.TextField textFieldr;
    private java.awt.TextField textFields;
    // End of variables declaration//GEN-END:variables
}

/* ГОСТ Р34.10-2001 
Криптосистемы на эл. кривых
На основе лабораторной работы №5 модифицировать свою криптосистему 
на основе дискр. логарифмирования, написанную в лаб 3-4, для использования на эл. кривых.
Для этого вам понадобится вычислять генератор кривой или порядок точки. Это делать перебором. 
 */