/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalPackage;

import Admin.UserForms;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class userDash extends javax.swing.JInternalFrame {

  
    public userDash() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0)); 
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI(); 
        bi.setNorthPane(null);
    }

  Color navcolor = new Color(116, 105, 182);
Color headcolor = new Color(255,230,230);
Color bodycolor = new Color(225,175,209);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        stulist = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        subj = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        gra = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(37, 37, 69));
        jPanel1.setLayout(null);

        stulist.setBackground(new java.awt.Color(204, 204, 255));
        stulist.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        stulist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stulistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stulistMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RENTERS");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout stulistLayout = new javax.swing.GroupLayout(stulist);
        stulist.setLayout(stulistLayout);
        stulistLayout.setHorizontalGroup(
            stulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(stulistLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        stulistLayout.setVerticalGroup(
            stulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stulistLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.add(stulist);
        stulist.setBounds(120, 40, 190, 161);

        subj.setBackground(new java.awt.Color(204, 204, 255));
        subj.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        subj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subjMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subjMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("RENTED");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout subjLayout = new javax.swing.GroupLayout(subj);
        subj.setLayout(subjLayout);
        subjLayout.setHorizontalGroup(
            subjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(54, 54, 54))
        );
        subjLayout.setVerticalGroup(
            subjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel1.add(subj);
        subj.setBounds(340, 40, 465, 160);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 250));

        jPanel2.setBackground(new java.awt.Color(37, 37, 69));
        jPanel2.setLayout(null);

        gra.setBackground(new java.awt.Color(204, 204, 255));
        gra.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        gra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                graMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                graMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("RATINGS");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout graLayout = new javax.swing.GroupLayout(gra);
        gra.setLayout(graLayout);
        graLayout.setHorizontalGroup(
            graLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
            .addGroup(graLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        graLayout.setVerticalGroup(
            graLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jPanel2.add(gra);
        gra.setBounds(220, 10, 190, 160);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 251, 650, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stulistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stulistMouseEntered
        stulist.setBackground(navcolor);
    }//GEN-LAST:event_stulistMouseEntered

    private void stulistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stulistMouseExited
        stulist.setBackground(headcolor);
    }//GEN-LAST:event_stulistMouseExited

    private void subjMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjMouseEntered
        subj .setBackground(navcolor);
    }//GEN-LAST:event_subjMouseEntered

    private void subjMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjMouseExited
        subj .setBackground(headcolor);
    }//GEN-LAST:event_subjMouseExited

    private void graMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graMouseEntered
        gra .setBackground(navcolor);
    }//GEN-LAST:event_graMouseEntered

    private void graMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graMouseExited
        gra .setBackground(headcolor);
    }//GEN-LAST:event_graMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gra;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel stulist;
    private javax.swing.JPanel subj;
    // End of variables declaration//GEN-END:variables
}
