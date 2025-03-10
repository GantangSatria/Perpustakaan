package perpustakaan;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormLihatReview extends javax.swing.JFrame {
    private DefaultTableModel modelBuku;
    private DefaultTableModel modelReview;
    private String judulTerpilih;

    public FormLihatReview() {
        initComponents();
        setupTables();
        loadData();
    }
    
    private void setupTables() {
        // Setup tabel buku
        modelBuku = new DefaultTableModel(new Object[]{"Judul"}, 0);
        jtBuku.setModel(modelBuku);

        // Setup tabel review
        modelReview = new DefaultTableModel(new Object[]{"Review"}, 0);
        jtReview.setModel(modelReview);
    }

    public void tampilkan() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    // Menampilkan semua buku yang tersedia
    private void loadData() {
        ArrayList<Buku> bukuList = Perpustakaan.bukuProvider.getAllBuku();
        display(bukuList);
    }

    // Menampilkan buku dalam tabel
    public void display(ArrayList<Buku> bukuList) {
        modelBuku.setRowCount(0); // Hapus data lama
        for (Buku buku : bukuList) {
            modelBuku.addRow(new Object[]{buku.judul}); // Langsung akses judul
        }
    }
    
    // Menampilkan review berdasarkan judul buku
    public void displayReview(String judul, ArrayList<Review> reviewList) {
        this.judulTerpilih = judul;
        modelReview.setRowCount(0);
        for (Review review : reviewList) {
            modelReview.addRow(new Object[]{review.getIsiReview()});
        }
    }

    /**
     * Event Handler untuk tombol "Tambah Review"
     */
    private void jButtonTambahReviewActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = jtBuku.getSelectedRow();
        if (selectedRow != -1) {
            judulTerpilih = (String) modelBuku.getValueAt(selectedRow, 0);

            // Input review dari user
            String isiReview = JOptionPane.showInputDialog(this, "Masukkan Review untuk buku '" + judulTerpilih + "':");
            if (isiReview != null && !isiReview.trim().isEmpty()) {
                // Simpan review ke dalam daftar
                Perpustakaan.reviewProvider.tambahReview(judulTerpilih, isiReview);
                displayReview(judulTerpilih, Perpustakaan.reviewProvider.getReviewListByTitle(judulTerpilih));
                
                JOptionPane.showMessageDialog(this, "Review berhasil ditambahkan.");
            } else {
                JOptionPane.showMessageDialog(this, "Review tidak boleh kosong.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih buku terlebih dahulu!");
        }
    }

    // Variables declaration
    private javax.swing.JButton jButtonTambahReview;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtBuku;
    private javax.swing.JTable jtReview;
    private javax.swing.JButton jButtonCariBuku;
    private javax.swing.JTextField jTextFieldJudul;

    // End of variables declaration

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jTextFieldJudul = new javax.swing.JTextField();
        jButtonCariBuku = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBuku = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtReview = new javax.swing.JTable();
        jButtonTambahReview = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] { "Judul" }
        ));
        jScrollPane1.setViewportView(jtBuku);

        jtReview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] { "Review" }
        ));
        jScrollPane2.setViewportView(jtReview);

        jButtonTambahReview.setText("Tambah Review");
        jButtonTambahReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahReviewActionPerformed(evt);
            }
        });
        jButtonCariBuku.setText("Cari Buku");
        jButtonCariBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariBukuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCariBuku)
                .addGap(18, 18, 18)
                .addComponent(jButtonTambahReview)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCariBuku)
                    .addComponent(jButtonTambahReview))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        
        pack();
    }

    private void jButtonCariBukuActionPerformed(java.awt.event.ActionEvent evt) {
        String keyword = jTextFieldJudul.getText().trim();
        if (!keyword.isEmpty()) {
            ArrayList<Buku> hasilPencarian = Perpustakaan.bukuProvider.cariBuku(keyword);
            display(hasilPencarian);
        } else {
            JOptionPane.showMessageDialog(this, "Masukkan judul untuk mencari!");
        }
    }
}
