package view.pembaca;

import controller.Application;
import java.awt.Color;
import java.awt.Cursor;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author HP PAVILION
 */
public class Dashboard extends javax.swing.JFrame {

    private static final Application APP = new Application();
    private final Color darkRed = new Color(153, 0, 51);
    private final Color darkBlue = new Color(25, 4, 130);
    private static String current_user;
    private final DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form Main
     *
     * @param username
     */
    public Dashboard(String username) {
        initComponents();
        Dashboard.current_user = username;
        sVGImage1.setSvgImage("view/images/Carousel4.svg", 1535, 100);
        btnSearch.setSvgImage("view/images/btnCari.svg", 25, 25);
        model.addColumn("Judul");
        model.addColumn("Penulis");
        model.addColumn("Genre");
        model.addColumn("Tahun Publikasi");
        model.addColumn("Peringkas");
        tableBook.setModel(model);
        populateTable();
        sVGImage1.requestFocusInWindow();
        this.setLocationRelativeTo(null);
//        }
    }

    private void populateTable() {
        model.setRowCount(0);
        ArrayList<Ringkasan> daftarBuku;
        try {
            daftarBuku = APP.getAllRingkasan(2);
            for (Ringkasan r : daftarBuku) {
                Object[] isiData = {r.getTitle(), r.getAuthor(), r.getGenre(), r.getPub_year(), r.getPeringkas()};
                model.addRow(isiData);
            }

        } catch (SQLException ex) {
            System.out.println("Eksepsi: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Exception: "
                    + ex.getMessage());
        }

    }

    private void populateTable(String keyword) {
        model.setRowCount(0);
        ArrayList<Ringkasan> hasilCari;

        try {
            hasilCari = APP.cariBuku(keyword);
            for (Ringkasan r : hasilCari) {
                Object[] isiData = {r.getTitle(), r.getAuthor(), r.getGenre(), r.getPub_year(), r.getPeringkas()};
                model.addRow(isiData);
            }
        } catch (SQLException ex) {
            System.out.println("Eksepsi: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Exception: "
                    + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableBook = new javax.swing.JTable();
        sVGImage1 = new view.images.SVGImage();
        searchBar = new javax.swing.JPanel();
        tfKeyword = new javax.swing.JTextField();
        btnSearch = new view.images.SVGImage();
        navBar = new javax.swing.JMenuBar();
        ringkasinLogo = new javax.swing.JMenu();
        Ringkasin = new javax.swing.JMenu();
        btnBeranda = new javax.swing.JMenu();
        btnPerpustakaan = new javax.swing.JMenu();
        btnTulis = new javax.swing.JMenu();
        btnProfile = new javax.swing.JMenu();
        btnLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        tableBook.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tableBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Judul", "Penulis", "Genre", "Tahun Publikasi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBook);

        tfKeyword.setText("Cari...");
        tfKeyword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfKeywordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfKeywordFocusLost(evt);
            }
        });
        tfKeyword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKeywordActionPerformed(evt);
            }
        });

        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });

        javax.swing.GroupLayout searchBarLayout = new javax.swing.GroupLayout(searchBar);
        searchBar.setLayout(searchBarLayout);
        searchBarLayout.setHorizontalGroup(
            searchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        searchBarLayout.setVerticalGroup(
            searchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(searchBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 1319, Short.MAX_VALUE)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(368, 368, 368))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sVGImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sVGImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBerandaMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_btnBerandaMenuSelected
        APP.goToDashboard(this);
    }//GEN-LAST:event_btnBerandaMenuSelected

    private void btnTulisMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_btnTulisMenuSelected
        APP.goToChooseBook(this);
    }//GEN-LAST:event_btnTulisMenuSelected

    private void btnbtnLogoutMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_btnbtnLogoutMenuSelected
        APP.logoutAccount(this, this);
    }//GEN-LAST:event_btnbtnLogoutMenuSelected

    private void tableBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBookMouseClicked
        int row = tableBook.getSelectedRow();

        try {
            int bookId = APP.getAllRingkasan(2).get(row).getBookId();
            int userId = APP.getAllRingkasan(2).get(row).getUserId();
            APP.goToBookDetails(this, bookId, userId);
        } catch (SQLException ex) {
            System.out.println("Eksepsi: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Exception: "
                    + ex.getMessage());
        }
    }//GEN-LAST:event_tableBookMouseClicked

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

    private void tfKeywordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKeywordActionPerformed

    }//GEN-LAST:event_tfKeywordActionPerformed

    private void tfKeywordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfKeywordFocusGained
        tfKeyword.setText("");
    }//GEN-LAST:event_tfKeywordFocusGained

    private void tfKeywordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfKeywordFocusLost
        tfKeyword.setText("Cari...");
    }//GEN-LAST:event_tfKeywordFocusLost

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        populateTable(tfKeyword.getText());
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnPerpustakaanMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_btnPerpustakaanMenuSelected
        APP.goToLibrary(this);
    }//GEN-LAST:event_btnPerpustakaanMenuSelected

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

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        this.setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnSearchMouseExited

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
            java.util.logging.Logger.getLogger(Dashboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            Dashboard app1 = new Dashboard(current_user);
            app1.setSize(1920, 1080);
            app1.setTitle("Beranda");
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
    private view.images.SVGImage btnSearch;
    private javax.swing.JMenu btnTulis;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar navBar;
    private javax.swing.JMenu ringkasinLogo;
    private view.images.SVGImage sVGImage1;
    private javax.swing.JPanel searchBar;
    private javax.swing.JTable tableBook;
    private javax.swing.JTextField tfKeyword;
    // End of variables declaration//GEN-END:variables
}
