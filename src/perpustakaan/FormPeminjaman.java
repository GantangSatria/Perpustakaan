/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package perpustakaan;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class FormPeminjaman extends javax.swing.JFrame {

    private ArrayList<Buku> bukuDipilih = new ArrayList<>();
    private ArrayList<Buku> bukuTersedia = new ArrayList<>();
    private int lamaPeminjaman;
    

    /**
     * Creates new customizer FormPeminjaman
     */
    public FormPeminjaman() {
        initComponents();
    }
    
    public void tampilkan() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldJudul = new javax.swing.JTextField();
        jButtonPinjam = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
        jButtonKonfirmasi = new javax.swing.JButton();
        jButtonCari = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtBuku = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTextFieldJudul.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldJudul.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldJudulActionPerformed(evt);
            }
        });

        jButtonPinjam.setText("Pinjam");
        jButtonPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPinjamActionPerformed(evt);
            }
        });

        jButtonBatal.setText("Batal");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });

        jButtonKonfirmasi.setText("Konfirmasi");
        jButtonKonfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKonfirmasiActionPerformed(evt);
            }
        });

        jButtonCari.setText("Cari");
        jButtonCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCariMouseClicked(evt);
            }
        });

        jScrollPane3.setColumnHeaderView(null);
        jScrollPane3.setHorizontalScrollBar(null);
        jScrollPane3.setRowHeaderView(null);

        jtBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        jtBuku.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtBuku.setMinimumSize(new java.awt.Dimension(160, 80));
        jScrollPane3.setViewportView(jtBuku);

        jScrollPane1.setColumnHeaderView(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jButtonCari))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldJudul, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonKonfirmasi)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButtonCari)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButtonPinjam)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBatal))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addComponent(jButtonKonfirmasi))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void jTextFieldJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldJudulActionPerformed

    private void jButtonKonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKonfirmasiActionPerformed
        konfirmasiPeminjaman();
    }//GEN-LAST:event_jButtonKonfirmasiActionPerformed

    private void konfirmasiPeminjaman() {
    if (bukuDipilih.isEmpty()) {
        DialogUI dialogUI = new DialogUI("Tidak ada buku yang dipilih");
        dialogUI.pack();
        dialogUI.setLocationRelativeTo(null);
        dialogUI.setVisible(true);
        return;
    }

    BukuDipinjam[] daftarBuku = new BukuDipinjam[bukuDipilih.size()];
    for (int i = 0; i < bukuDipilih.size(); i++) {
        daftarBuku[i] = new BukuDipinjam(bukuDipilih.get(i).judul, lamaPeminjaman);
    }

    Perpustakaan.controllerPeminjaman.pinjam(daftarBuku);
    }
    
    private void jButtonCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCariMouseClicked
        String judul = jTextFieldJudul.getText();
        Perpustakaan.controllerPeminjaman.cariBuku(judul);
    }//GEN-LAST:event_jButtonCariMouseClicked

    private void jButtonPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPinjamActionPerformed
        pinjamBuku();
    }//GEN-LAST:event_jButtonPinjamActionPerformed

    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalActionPerformed
        batalPinjam();
    }//GEN-LAST:event_jButtonBatalActionPerformed

private static final int MAKSIMAL_BUKU = 10; 

private void pinjamBuku() {
    if (bukuDipilih.size() >= MAKSIMAL_BUKU) { 
        DialogUI dialog = new DialogUI("Jumlah buku yang dipinjam melebihi batas maksimal 10 buku.");
        dialog.setVisible(true);
        return;
    }

    int selectedRow = jtBuku.getSelectedRow();
    if (selectedRow != -1) {
        String judulBuku = (String) jtBuku.getValueAt(selectedRow, 0);

        // Tanya user berapa lama ingin meminjam
        String input = JOptionPane.showInputDialog(this, 
            "Berapa lama ingin meminjam buku (max 3 hari)?", 
            "Input Lama Peminjaman", 
            JOptionPane.QUESTION_MESSAGE);

        if (input != null) {
            try {
                int lamaPeminjaman = Integer.parseInt(input);

                if (lamaPeminjaman > 3) {
                    DialogUI dialog = new DialogUI("Maaf, Anda tidak boleh meminjam lebih dari 3 hari.");
                    dialog.setVisible(true);
                } else {
                    // Cari buku di daftar tersedia
                    Buku buku = null;
                    for (Buku b : bukuTersedia) {
                        if (b.judul.equals(judulBuku)) {
                            buku = b;
                            break;
                        }
                    }

                    if (buku != null) {
                        bukuTersedia.remove(buku);
                        bukuDipilih.add(buku);

                        // Perbarui tampilan tabel
                        tampilkanBukuTersedia();
                        tampilkanBukuDipilih();
                    }
                    BukuDipinjam bukuTerpinjam = new BukuDipinjam(judulBuku, lamaPeminjaman);

                    PeminjamanManager manager = new PeminjamanManager();
                    manager.save(new BukuDipinjam[]{bukuTerpinjam});
                }
            } catch (NumberFormatException e) {
                 DialogUI dialog = new DialogUI("Masukkan angka yang valid!");
                 dialog.setVisible(true);
            }
        }
    }
}


    
    private void tampilkanBukuDipilih() {
    Object[] kolom = { "Judul" };
    DefaultTableModel model = new DefaultTableModel(kolom, 0);

    for (Buku buku : bukuDipilih) {
        model.addRow(new Object[] { buku.judul });
    }

    jTable2.setModel(model);
    }
    
    public void display(ArrayList<Buku> bukuList) {
    bukuTersedia.clear(); // Reset daftar buku yang tersedia
    bukuTersedia.addAll(bukuList);

    tampilkanBukuTersedia();
}

private void tampilkanBukuTersedia() {
    Object[] kolom = { "Judul" };
    DefaultTableModel model = new DefaultTableModel(kolom, 0);

    for (Buku buku : bukuTersedia) {
        model.addRow(new Object[] { buku.judul });
    }

    jtBuku.setModel(model);
}

private void batalPinjam() {
    int selectedRow = jTable2.getSelectedRow();
    if (selectedRow != -1) {
        String judulBuku = (String) jTable2.getValueAt(selectedRow, 0);

        // Cari buku di daftar yang sudah dipilih
        Buku buku = null;
        for (Buku b : bukuDipilih) {
            if (b.judul.equals(judulBuku)) {
                buku = b;
                break;
            }
        }

        if (buku != null) {
            bukuDipilih.remove(buku);
            bukuTersedia.add(buku);

            // Perbarui tampilan tabel
            tampilkanBukuTersedia();
            tampilkanBukuDipilih();
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonCari;
    private javax.swing.JButton jButtonKonfirmasi;
    private javax.swing.JButton jButtonPinjam;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldJudul;
    private javax.swing.JTable jtBuku;
    // End of variables declaration//GEN-END:variables
}
