/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.penulis;

import com.mysql.cj.xdevapi.Statement;
import controller.Application;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Buku;
import model.Ringkasan;

/**
 *
 * @author USER
 */
public class TulisRingkasan extends javax.swing.JFrame {

    private static Application APP = new Application();
    private final Color darkRed = new Color(153, 0, 51);
    private final Color darkBlue = new Color(25, 4, 130);
    private static String current_user;
    private static String bookTitle;
    private static int bookId;
    private static int userId;
    private static String bookAuthor;
    private static String contentRingkasan;
    private static String pubYear;

    /**
     * Creates new form KontenRingkasan
     *
     * @param username
     * @param userId
     * @param bookId
     * @param bookTitle
     * @param bookAuthor
     * @param pubYear
     */
//    Untuk Pertama kali 
    public TulisRingkasan(String username, int userId, int bookId, String bookTitle, String bookAuthor, String pubYear) {
        initComponents();
        TulisRingkasan.current_user = username;
        TulisRingkasan.userId = userId;
        TulisRingkasan.bookId = bookId;
        TulisRingkasan.bookTitle = bookTitle;
        TulisRingkasan.bookAuthor = bookAuthor;
        TulisRingkasan.pubYear = pubYear;
        judulBukuData.setText(bookTitle);

    }
//    Untuk Edit

    public TulisRingkasan(String username, int userId, int bookId, String bookTitle, String bookAuthor, String pubYear, String content) {
        initComponents();
        TulisRingkasan.current_user = username;
        TulisRingkasan.userId = userId;
        TulisRingkasan.bookId = bookId;
        TulisRingkasan.bookTitle = bookTitle;
        TulisRingkasan.bookAuthor = bookAuthor;
        TulisRingkasan.pubYear = pubYear;
        TulisRingkasan.contentRingkasan = content;
        judulBukuData.setText(bookTitle);
        taKontenRingkasan.setText(content);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taKontenRingkasan = new javax.swing.JTextArea();
        saveRingkasan = new javax.swing.JButton();
        judulBukuData = new javax.swing.JLabel();
        navBar = new javax.swing.JMenuBar();
        ringkasinLogo = new javax.swing.JMenu();
        Ringkasin = new javax.swing.JMenu();
        btnBeranda = new javax.swing.JMenu();
        btnPerpustakaan = new javax.swing.JMenu();
        btnTulis = new javax.swing.JMenu();
        btnProfile = new javax.swing.JMenu();
        btnLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(new java.awt.Dimension(1910, 1080));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        taKontenRingkasan.setColumns(20);
        taKontenRingkasan.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        taKontenRingkasan.setForeground(new java.awt.Color(51, 51, 51));
        taKontenRingkasan.setLineWrap(true);
        taKontenRingkasan.setRows(5);
        taKontenRingkasan.setWrapStyleWord(true);
        taKontenRingkasan.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        jScrollPane1.setViewportView(taKontenRingkasan);

        saveRingkasan.setBackground(new java.awt.Color(0, 0, 204));
        saveRingkasan.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        saveRingkasan.setForeground(new java.awt.Color(255, 255, 255));
        saveRingkasan.setText("Simpan Ringkasan");
        saveRingkasan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveRingkasanActionPerformed(evt);
            }
        });

        judulBukuData.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        judulBukuData.setForeground(new java.awt.Color(51, 51, 51));
        judulBukuData.setText("Judul Buku");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1143, Short.MAX_VALUE)
                    .addComponent(judulBukuData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveRingkasan)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(judulBukuData)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(saveRingkasan)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void saveRingkasanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveRingkasanActionPerformed
        String content = taKontenRingkasan.getText();
        try {
            ArrayList<Ringkasan> daftar = APP.getCurrentRingkasan(bookId, userId);
            int status = 0;
            for (Ringkasan r : daftar) {
                status = r.getStatus();
            }
            if (status == 0) {
                status = 4;
            }
            System.out.println("Status ringkasan pada laman Tulis Ringkasan: " + status);
            APP.goToSumDetails(this, bookTitle, bookAuthor, pubYear, userId, bookId, content, status);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception: " + ex.getMessage());
        }
    }//GEN-LAST:event_saveRingkasanActionPerformed

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
            java.util.logging.Logger.getLogger(TulisRingkasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TulisRingkasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TulisRingkasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TulisRingkasan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            TulisRingkasan app1 = new TulisRingkasan(current_user, userId, bookId, bookTitle, bookAuthor, pubYear);
            app1.setSize(1920, 1080);
            app1.setTitle("Tulis Ringkasan");
            app1.setVisible(true);
            APP.isLoggedIn(app1);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ringkasin;
    private javax.swing.JMenu btnBeranda;
    private javax.swing.JMenu btnLogout;
    private javax.swing.JMenu btnPerpustakaan;
    private javax.swing.JMenu btnProfile;
    private javax.swing.JMenu btnTulis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judulBukuData;
    private javax.swing.JMenuBar navBar;
    private javax.swing.JMenu ringkasinLogo;
    private javax.swing.JButton saveRingkasan;
    private javax.swing.JTextArea taKontenRingkasan;
    // End of variables declaration//GEN-END:variables
}
