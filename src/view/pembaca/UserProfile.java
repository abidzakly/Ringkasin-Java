package view.pembaca;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import controller.Application;
import java.awt.Color;
import java.awt.Cursor;
import model.Pembaca;
import model.Pengguna;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author fawwa
 */
public class UserProfile extends javax.swing.JFrame {

    private static final Application APP = new Application();
    private static String currentFullname;
    private static String currentUsername;
    private static String currentEmail;
    private final Color darkRed = new Color(153, 0, 51);
    private final Color darkBlue = new Color(25, 4, 130);

    /**
     * Creates new form EditProfile
     */
    public UserProfile(String username) {
        initComponents();
        UserProfile.currentUsername = username;
        try {
            ArrayList<Pembaca> daftar = APP.getCurrentPengguna();
            for (Pembaca p : daftar) {
                currentFullname = p.getFullname();
                currentEmail = p.getEmail();
            }
        } catch (SQLException ex) {
            System.out.println("Eksepsi: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Exception: "
                    + ex.getMessage());
        }

        kosongkan();
    }

    private void kosongkan() {
        tfFullname.setVisible(false);
        dataFullname.setText(currentFullname);
        dataFullname.setVisible(true);

        tfUsername.setVisible(false);
        dataUsername.setText(currentUsername);
        dataUsername.setVisible(true);

        tfEmail.setVisible(false);
        dataEmail.setText(currentEmail);
        dataEmail.setVisible(true);

        labelPassword.setVisible(false);
        tfPassword.setVisible(false);

        btnHapus.setVisible(true);
        btnEdit.setText("Edit Data");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDataDiri = new javax.swing.JLabel();
        labelFullname = new javax.swing.JLabel();
        tfFullname = new javax.swing.JTextField();
        dataFullname = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        dataUsername = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        dataEmail = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        navBar = new javax.swing.JMenuBar();
        ringkasinLogo = new javax.swing.JMenu();
        Ringkasin = new javax.swing.JMenu();
        btnBeranda = new javax.swing.JMenu();
        btnPerpustakaan = new javax.swing.JMenu();
        btnTulis = new javax.swing.JMenu();
        btnProfile = new javax.swing.JMenu();
        btnLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelDataDiri.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        labelDataDiri.setText("DATA DIRI");

        labelFullname.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        labelFullname.setText("Nama Lengkap");

        tfFullname.setToolTipText("");
        tfFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFullnameActionPerformed(evt);
            }
        });

        dataFullname.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        dataFullname.setText("User's Fullname");

        labelUsername.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        labelUsername.setText("Username");

        dataUsername.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        dataUsername.setText("User's Username");

        labelEmail.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        labelEmail.setText("Email");

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        dataEmail.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        dataEmail.setText("User's Email");

        labelPassword.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        labelPassword.setText("Masukkan password untuk mengubah:");

        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(0, 0, 153));
        btnEdit.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit Data");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(204, 0, 0));
        btnHapus.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus Akun");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        ringkasinLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/ringkasinLogo.png"))); // NOI18N
        ringkasinLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        navBar.add(ringkasinLogo);

        Ringkasin.setText("Ringkasin");
        Ringkasin.setToolTipText("");
        Ringkasin.setFont(new java.awt.Font("Poppins", 1, 28)); // NOI18N
        navBar.add(Ringkasin);

        btnBeranda.setText("Beranda");
        btnBeranda.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnBeranda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBeranda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBeranda.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                btnBerandaMenuSelected(evt);
            }
        });
        btnBeranda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBerandaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBerandaMouseExited(evt);
            }
        });
        navBar.add(btnBeranda);

        btnPerpustakaan.setText("Perpustakaan");
        btnPerpustakaan.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnPerpustakaan.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                btnPerpustakaanMenuSelected(evt);
            }
        });
        btnPerpustakaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPerpustakaanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPerpustakaanMouseExited(evt);
            }
        });
        navBar.add(btnPerpustakaan);

        btnTulis.setText("Ringkas Buku");
        btnTulis.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnTulis.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                btnTulisMenuSelected(evt);
            }
        });
        btnTulis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTulisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTulisMouseExited(evt);
            }
        });
        navBar.add(btnTulis);

        btnProfile.setText("Profil");
        btnProfile.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnProfile.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                btnProfileMenuSelected(evt);
            }
        });
        btnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProfileMouseExited(evt);
            }
        });
        navBar.add(btnProfile);

        btnLogout.setText("Keluar");
        btnLogout.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        btnLogout.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                btnbtnLogoutMenuSelected(evt);
            }
        });
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });
        navBar.add(btnLogout);

        setJMenuBar(navBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapus))
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsername)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dataEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(152, 152, 152))
                        .addComponent(labelPassword)
                        .addComponent(labelDataDiri)
                        .addComponent(labelFullname)
                        .addComponent(labelEmail)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dataFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dataUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(labelDataDiri)
                .addGap(18, 18, 18)
                .addComponent(labelFullname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dataFullname)
                    .addComponent(tfFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataUsername)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataEmail))
                .addGap(18, 18, 18)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit)
                .addGap(31, 31, 31)
                .addComponent(btnHapus)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        btnHapus.setVisible(false);
        String fullname = tfFullname.getText();
        String username = tfUsername.getText();
        String email = tfEmail.getText();
        String password = String.valueOf(tfPassword.getPassword());
        Pengguna p = new Pembaca(fullname, username, email, password);
        if (btnEdit.getText().equals("Simpan")) {
            try {
                if (APP.updatePengguna(p)) {
                    JOptionPane.showMessageDialog(this,
                            "Berhasil Update");
                    APP.goToProfile(this, APP.getCurrentPengguna().get(0).getUsername());
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Update");
                }
            } catch (SQLException ex) {
                System.out.println("Eksepsi: " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "Exception: "
                        + ex.getMessage());
            }

        } else {
            btnEdit.setText("Simpan");
            dataFullname.setVisible(false);
            tfFullname.setVisible(true);

            dataUsername.setVisible(false);
            tfUsername.setVisible(true);

            dataEmail.setVisible(false);
            tfEmail.setVisible(true);

            labelPassword.setVisible(true);
            tfPassword.setVisible(true);

            tfFullname.setText(currentFullname);
            tfUsername.setText(currentUsername);
            tfEmail.setText(currentEmail);

        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String username = dataUsername.getText();
        int jawaban;
        if (!username.equals("User's Username")) {
            jawaban = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus akun "
                    + username + "?", "Hapus", JOptionPane.YES_NO_OPTION);
        } else {
            jawaban = JOptionPane.showConfirmDialog(this, "Data tidak ada!", "Hapus", JOptionPane.PLAIN_MESSAGE);
        }
        if (jawaban == JOptionPane.YES_OPTION) {
            //hapus
            try {
                if (APP.deletePengguna(username)) {
                    JOptionPane.showMessageDialog(this,
                            "Berhasil Delete");
                    APP.logoutAccount(this, this);
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Delete");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Eksepsi: "
                        + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBerandaMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_btnBerandaMenuSelected
        APP.goToDashboard(this);
    }//GEN-LAST:event_btnBerandaMenuSelected

    private void btnBerandaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBerandaMouseEntered
        btnBeranda.setOpaque(true);
        btnBeranda.setBackground(this.darkBlue);
        btnBeranda.setForeground(Color.white);
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnBerandaMouseEntered

    private void btnBerandaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBerandaMouseExited
        btnBeranda.setOpaque(false);
        btnBeranda.setBackground(Color.white);
        btnBeranda.setForeground(Color.black);
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnBerandaMouseExited

    private void btnPerpustakaanMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_btnPerpustakaanMenuSelected
        APP.goToLibrary(this);
    }//GEN-LAST:event_btnPerpustakaanMenuSelected

    private void btnPerpustakaanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerpustakaanMouseEntered
        btnPerpustakaan.setOpaque(true);
        btnPerpustakaan.setBackground(this.darkBlue);
        btnPerpustakaan.setForeground(Color.white);
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnPerpustakaanMouseEntered

    private void btnPerpustakaanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerpustakaanMouseExited
        btnPerpustakaan.setOpaque(false);
        btnPerpustakaan.setBackground(Color.white);
        btnPerpustakaan.setForeground(Color.black);
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnPerpustakaanMouseExited

    private void btnTulisMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_btnTulisMenuSelected
        APP.goToChooseBook(this);
    }//GEN-LAST:event_btnTulisMenuSelected

    private void btnTulisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTulisMouseEntered
        btnTulis.setOpaque(true);
        btnTulis.setBackground(this.darkBlue);
        btnTulis.setForeground(Color.white);
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnTulisMouseEntered

    private void btnTulisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTulisMouseExited
        btnTulis.setOpaque(false);
        btnTulis.setBackground(Color.white);
        btnTulis.setForeground(Color.black);
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnTulisMouseExited

    private void btnProfileMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_btnProfileMenuSelected
        APP.goToProfile(this);
    }//GEN-LAST:event_btnProfileMenuSelected

    private void btnProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMouseEntered
        btnProfile.setOpaque(true);
        btnProfile.setBackground(this.darkBlue);
        btnProfile.setForeground(Color.white);
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnProfileMouseEntered

    private void btnProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMouseExited
        btnProfile.setOpaque(false);
        btnProfile.setBackground(Color.white);
        btnProfile.setForeground(Color.black);
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnProfileMouseExited

    private void btnbtnLogoutMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_btnbtnLogoutMenuSelected
        APP.logoutAccount(this, this);
    }//GEN-LAST:event_btnbtnLogoutMenuSelected

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        btnLogout.setOpaque(true);
        btnLogout.setBackground(this.darkRed);
        btnLogout.setForeground(Color.white);
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        btnLogout.setOpaque(false);
        btnLogout.setBackground(Color.white);
        btnLogout.setForeground(Color.black);
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnLogoutMouseExited

    private void tfFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFullnameActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            UserProfile app1 = new UserProfile(currentUsername);
            app1.setTitle("Profil");
            app1.setSize(1920, 1080);
            app1.setVisible(true);
            APP.isLoggedIn(app1);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ringkasin;
    private javax.swing.JMenu btnBeranda;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JMenu btnLogout;
    private javax.swing.JMenu btnPerpustakaan;
    private javax.swing.JMenu btnProfile;
    private javax.swing.JMenu btnTulis;
    private javax.swing.JLabel dataEmail;
    private javax.swing.JLabel dataFullname;
    private javax.swing.JLabel dataUsername;
    private javax.swing.JLabel labelDataDiri;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFullname;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JMenuBar navBar;
    private javax.swing.JMenu ringkasinLogo;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFullname;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
