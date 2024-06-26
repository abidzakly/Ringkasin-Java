/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.pembaca;

import controller.Application;
import controller.Koneksi;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Ringkasan;

/**
 *
 * @author USER
 */
public class DetailBuku extends javax.swing.JFrame {

    private static String current_user;
    private static String sumContent;
    private static int peringkasId;
    private static int bookId;
    private static final Application APP = new Application();
    private final Color darkRed = new Color(153, 0, 51);
    private final Color darkBlue = new Color(25, 4, 130);
    private final Koneksi k = new Koneksi();

    /**
     * Creates new form BookDetail
     *
     * @param username
     * @param bookId
     * @param peringkasId
     */
    public DetailBuku(String username, int bookId, int peringkasId) {
        initComponents();
        try {
            ArrayList<Ringkasan> ringkasan = APP.getCurrentRingkasan(bookId, peringkasId);
            for (Ringkasan r : ringkasan) {
                txtJudulBuku.setText(r.getTitle());
                txtPenulis.setText(r.getAuthor());
                txtPubYear.setText("Terbit: " + r.getPub_year());
                txtIsbn.setText("ISBN: " + r.getIsbn());
                txtKategori.setText("Kategori: " + r.getGenre());
                txtDeskripsi.setText(r.getContent());
                txtPeringkas.setText("Peringkas: " + r.getPeringkas());
                String filename = r.getFilename() == null ? "" : r.getFilename();
                coverImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/" + filename)));
                DetailBuku.sumContent = r.getContent();
            }
            String deskripsiTruncate = txtDeskripsi.getText();
            int maxLength = 500; // Set your maximum length here

            if (deskripsiTruncate.length() > maxLength) {
                deskripsiTruncate = deskripsiTruncate.substring(0, maxLength);
                txtDeskripsi.setText(deskripsiTruncate);
            }
        } catch (SQLException ex) {
            System.out.println("Eksepsi: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Exception: "
                    + ex.getMessage());
        }
        DetailBuku.current_user = username;
        DetailBuku.bookId = bookId;
        DetailBuku.peringkasId = peringkasId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *
     * @param bookId
     * @throws java.sql.SQLException
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contents = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        coverImage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtJudulBuku = new javax.swing.JLabel();
        txtPenulis = new javax.swing.JLabel();
        txtPubYear = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JLabel();
        txtKategori = new javax.swing.JLabel();
        txtPeringkas = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        descBukuLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDeskripsi = new javax.swing.JTextArea();
        bacaRingkasanBtn = new javax.swing.JButton();
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
        setSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        contents.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        coverImage.setBackground(new java.awt.Color(204, 204, 204));
        coverImage.setForeground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        txtJudulBuku.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N

        txtPenulis.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        txtPubYear.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        txtIsbn.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        txtKategori.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        txtPeringkas.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtJudulBuku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPubYear, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPenulis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(txtKategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPeringkas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtJudulBuku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPenulis)
                .addGap(24, 24, 24)
                .addComponent(txtPubYear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIsbn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKategori)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPeringkas)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(coverImage, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(coverImage, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        descBukuLabel.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        descBukuLabel.setText("Kilas Pandang Ringkasan");

        txtDeskripsi.setEditable(false);
        txtDeskripsi.setBackground(new java.awt.Color(204, 204, 255));
        txtDeskripsi.setColumns(20);
        txtDeskripsi.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtDeskripsi.setForeground(new java.awt.Color(51, 51, 51));
        txtDeskripsi.setLineWrap(true);
        txtDeskripsi.setRows(5);
        txtDeskripsi.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtDeskripsi);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(descBukuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(descBukuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        bacaRingkasanBtn.setBackground(new java.awt.Color(51, 0, 204));
        bacaRingkasanBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bacaRingkasanBtn.setForeground(new java.awt.Color(255, 255, 255));
        bacaRingkasanBtn.setText("Baca Ringkasan");
        bacaRingkasanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bacaRingkasanBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentsLayout = new javax.swing.GroupLayout(contents);
        contents.setLayout(contentsLayout);
        contentsLayout.setHorizontalGroup(
            contentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentsLayout.createSequentialGroup()
                .addGroup(contentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bacaRingkasanBtn))
                    .addGroup(contentsLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentsLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
        );
        contentsLayout.setVerticalGroup(
            contentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(bacaRingkasanBtn)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(441, 441, 441)
                .addComponent(contents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(458, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(contents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 375, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bacaRingkasanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bacaRingkasanBtnActionPerformed
        try {
            int ringkasanId = APP.getCurrentRingkasan(bookId, peringkasId).get(0).getIdRingkasan();
            int userId = APP.getCurrentPengguna().get(0).getUserId();
            APP.isVisited(ringkasanId, userId);
            APP.goToBacaBuku(this, txtJudulBuku.getText(), sumContent);
        } catch (SQLException ex) {
            System.out.println("Eksepsi Baca Ringkasan: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Exception: "
                    + ex.getMessage());
        }
    }//GEN-LAST:event_bacaRingkasanBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DetailBuku.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailBuku.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailBuku.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailBuku.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            DetailBuku app1 = new DetailBuku(current_user, bookId, peringkasId);
            app1.setTitle("Detail Buku");
            app1.setSize(1920, 1080);
            app1.setVisible(true);
            APP.isLoggedIn(app1);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ringkasin;
    private javax.swing.JButton bacaRingkasanBtn;
    private javax.swing.JMenu btnBeranda;
    private javax.swing.JMenu btnLogout;
    private javax.swing.JMenu btnPerpustakaan;
    private javax.swing.JMenu btnProfile;
    private javax.swing.JMenu btnTulis;
    private javax.swing.JPanel contents;
    private javax.swing.JLabel coverImage;
    private javax.swing.JLabel descBukuLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar navBar;
    private javax.swing.JMenu ringkasinLogo;
    private javax.swing.JTextArea txtDeskripsi;
    private javax.swing.JLabel txtIsbn;
    private javax.swing.JLabel txtJudulBuku;
    private javax.swing.JLabel txtKategori;
    private javax.swing.JLabel txtPenulis;
    private javax.swing.JLabel txtPeringkas;
    private javax.swing.JLabel txtPubYear;
    // End of variables declaration//GEN-END:variables
}
