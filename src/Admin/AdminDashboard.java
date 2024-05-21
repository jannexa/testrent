/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import proprent.Login;
import java.awt.Color;
import javax.swing.JOptionPane;


import InternalPackage.userDash;
import config.Session;




   
public class AdminDashboard extends javax.swing.JFrame {


    public AdminDashboard() {
         
        initComponents();
        
       

  }
  Color navcolor = new Color(153,153,0);
      Color hovercolor = new Color(204,204,0);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j = new javax.swing.JPanel();
        su = new javax.swing.JPanel();
        das3 = new javax.swing.JLabel();
        sub = new javax.swing.JPanel();
        das2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        us = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        acc_name1 = new javax.swing.JLabel();
        acc_name = new javax.swing.JLabel();
        stud = new javax.swing.JPanel();
        das1 = new javax.swing.JLabel();
        dasb = new javax.swing.JPanel();
        dash = new javax.swing.JLabel();
        des = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        stulist = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        subj = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        gra = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        uss = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        j.setBackground(new java.awt.Color(102, 102, 102));

        su.setBackground(new java.awt.Color(102, 102, 102));
        su.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                suMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                suMousePressed(evt);
            }
        });
        su.setLayout(null);

        das3.setBackground(new java.awt.Color(153, 153, 153));
        das3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        das3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        das3.setText("PLACES");
        su.add(das3);
        das3.setBounds(35, 0, 138, 25);

        sub.setBackground(new java.awt.Color(102, 102, 102));
        sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                subMousePressed(evt);
            }
        });
        sub.setLayout(null);

        das2.setBackground(new java.awt.Color(153, 153, 153));
        das2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        das2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        das2.setText("EMPLOYEES");
        sub.add(das2);
        das2.setBounds(26, 0, 138, 25);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        us.setBackground(new java.awt.Color(102, 102, 102));
        us.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usMousePressed(evt);
            }
        });
        us.setLayout(null);

        user.setBackground(new java.awt.Color(153, 153, 153));
        user.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("User");
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userMousePressed(evt);
            }
        });
        us.add(user);
        user.setBounds(70, 0, 44, 24);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Log out");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        acc_name1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        acc_name1.setText("Admin");

        acc_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        acc_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        stud.setBackground(new java.awt.Color(173, 136, 198));
        stud.setOpaque(false);
        stud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studMouseExited(evt);
            }
        });
        stud.setLayout(null);

        das1.setBackground(new java.awt.Color(153, 153, 153));
        das1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        das1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        das1.setText("Renter List");
        das1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                das1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                das1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                das1MouseExited(evt);
            }
        });
        stud.add(das1);
        das1.setBounds(20, 0, 160, 25);

        dasb.setBackground(new java.awt.Color(102, 102, 102));
        dasb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dasbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dasbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dasbMouseExited(evt);
            }
        });
        dasb.setLayout(null);

        dash.setBackground(new java.awt.Color(153, 153, 153));
        dash.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        dash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dash.setText("Dashboard");
        dasb.add(dash);
        dash.setBounds(20, 0, 169, 25);

        des.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desLayout = new javax.swing.GroupLayout(des);
        des.setLayout(desLayout);
        desLayout.setHorizontalGroup(
            desLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desLayout.setVerticalGroup(
            desLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayout = new javax.swing.GroupLayout(j);
        j.setLayout(jLayout);
        jLayout.setHorizontalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayout.createSequentialGroup()
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayout.createSequentialGroup()
                        .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayout.createSequentialGroup()
                                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel4))
                                    .addGroup(jLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(acc_name, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(acc_name1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(des, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dasb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                        .addComponent(su, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sub, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(us, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayout.setVerticalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(des, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayout.createSequentialGroup()
                        .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(acc_name1)
                                .addGap(45, 45, 45)))
                        .addComponent(acc_name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(dasb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(stud, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(su, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        stulist.setBackground(new java.awt.Color(255, 255, 255));
        stulist.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        stulist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stulistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stulistMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Renter List");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout stulistLayout = new javax.swing.GroupLayout(stulist);
        stulist.setLayout(stulistLayout);
        stulistLayout.setHorizontalGroup(
            stulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(stulistLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        stulistLayout.setVerticalGroup(
            stulistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stulistLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.add(stulist);
        stulist.setBounds(90, 40, 190, 161);

        subj.setBackground(new java.awt.Color(255, 255, 255));
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
        jLabel12.setText("places");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout subjLayout = new javax.swing.GroupLayout(subj);
        subj.setLayout(subjLayout);
        subjLayout.setHorizontalGroup(
            subjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
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
        subj.setBounds(330, 40, 210, 160);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);

        gra.setBackground(new java.awt.Color(255, 255, 255));
        gra.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        gra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                graMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                graMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("employees");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout graLayout = new javax.swing.GroupLayout(gra);
        gra.setLayout(graLayout);
        graLayout.setHorizontalGroup(
            graLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(graLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        graLayout.setVerticalGroup(
            graLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jPanel2.add(gra);
        gra.setBounds(80, 40, 190, 160);

        uss.setBackground(new java.awt.Color(255, 255, 255));
        uss.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        uss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ussMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ussMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ussMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("User");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout ussLayout = new javax.swing.GroupLayout(uss);
        uss.setLayout(ussLayout);
        ussLayout.setHorizontalGroup(
            ussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ussLayout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(55, 55, 55))
        );
        ussLayout.setVerticalGroup(
            ussLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ussLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel2.add(uss);
        uss.setBounds(330, 40, 210, 158);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
          Login ads= new Login();
           ads.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void suMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suMousePressed

     
    }//GEN-LAST:event_suMousePressed

    private void suMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suMouseClicked

    }//GEN-LAST:event_suMouseClicked

    private void subMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMousePressed

    }//GEN-LAST:event_subMousePressed

    private void subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseClicked

    }//GEN-LAST:event_subMouseClicked

    private void usMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usMousePressed

    }//GEN-LAST:event_usMousePressed

    private void usMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usMouseClicked
   UserForms ufs= new  UserForms();
        ufs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_usMouseClicked

    private void userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMousePressed
     
    }//GEN-LAST:event_userMousePressed

    private void das1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_das1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_das1MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Session sess=  Session.getInstances();
         if(sess.getUid()==0){
              JOptionPane.showMessageDialog(null,"No account, Login First!");
              Login ads= new Login();
           ads.setVisible(true);
           this.dispose();
         }
         acc_name.setText(""+sess.getFname());
    }//GEN-LAST:event_formWindowActivated

    private void suMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suMouseEntered
        su.setBackground(hovercolor);
    }//GEN-LAST:event_suMouseEntered

    private void suMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suMouseExited
       su.setBackground(navcolor);
    }//GEN-LAST:event_suMouseExited

    private void subMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseEntered
       sub.setBackground(hovercolor);
    }//GEN-LAST:event_subMouseEntered

    private void subMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMouseExited
          sub.setBackground(navcolor);
    }//GEN-LAST:event_subMouseExited

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
      
    }//GEN-LAST:event_userMouseEntered

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
      
    }//GEN-LAST:event_userMouseExited

    private void usMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usMouseEntered
          us.setBackground(hovercolor);
    }//GEN-LAST:event_usMouseEntered

    private void usMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usMouseExited
       us.setBackground(navcolor);
    }//GEN-LAST:event_usMouseExited

    private void dasbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dasbMouseClicked
    
    }//GEN-LAST:event_dasbMouseClicked

    private void dasbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dasbMouseEntered
         dasb.setBackground(hovercolor);
    }//GEN-LAST:event_dasbMouseEntered

    private void dasbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dasbMouseExited
         dasb.setBackground(navcolor);
    }//GEN-LAST:event_dasbMouseExited

    private void studMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studMouseEntered
         stud.setBackground(hovercolor);
    }//GEN-LAST:event_studMouseEntered

    private void studMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studMouseExited
                 stud.setBackground(navcolor);
    }//GEN-LAST:event_studMouseExited

    private void das1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_das1MouseEntered
     
    }//GEN-LAST:event_das1MouseEntered

    private void das1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_das1MouseExited
      
    }//GEN-LAST:event_das1MouseExited

    private void stulistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stulistMouseEntered
        stulist.setBackground(navcolor);
    }//GEN-LAST:event_stulistMouseEntered

    private void stulistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stulistMouseExited
        stulist.setBackground( hovercolor);
    }//GEN-LAST:event_stulistMouseExited

    private void subjMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjMouseEntered
        subj .setBackground(navcolor);
    }//GEN-LAST:event_subjMouseEntered

    private void subjMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjMouseExited
        subj .setBackground( hovercolor);
    }//GEN-LAST:event_subjMouseExited

    private void graMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graMouseEntered
        gra .setBackground(navcolor);
    }//GEN-LAST:event_graMouseEntered

    private void graMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_graMouseExited
        gra .setBackground( hovercolor);
    }//GEN-LAST:event_graMouseExited

    private void ussMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ussMouseClicked

        UserForms ufs= new  UserForms();
        ufs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ussMouseClicked

    private void ussMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ussMouseEntered
        uss .setBackground(navcolor);
    }//GEN-LAST:event_ussMouseEntered

    private void ussMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ussMouseExited
        uss .setBackground( hovercolor);
    }//GEN-LAST:event_ussMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel acc_name1;
    private javax.swing.JLabel das1;
    private javax.swing.JLabel das2;
    private javax.swing.JLabel das3;
    private javax.swing.JPanel dasb;
    private javax.swing.JLabel dash;
    private javax.swing.JPanel des;
    private javax.swing.JPanel gra;
    private javax.swing.JPanel j;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel stud;
    private javax.swing.JPanel stulist;
    private javax.swing.JPanel su;
    private javax.swing.JPanel sub;
    private javax.swing.JPanel subj;
    private javax.swing.JPanel us;
    private javax.swing.JLabel user;
    private javax.swing.JPanel uss;
    // End of variables declaration//GEN-END:variables
}
