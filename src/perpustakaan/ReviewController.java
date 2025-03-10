/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author Dimas Rezananda
 */
public class ReviewController {
    public void showFormReview(String judul) {
        Perpustakaan.formReview = new FormLihatReview(); 
        Perpustakaan.formReview.tampilkan();
    }

    void cariBuku(String judul) {
        BukuProvider bukuProvider = new BukuProvider();
        ReviewProvider reviewProvider = new ReviewProvider(); // Tambahkan ini untuk mengambil review

        try {
            ArrayList<Buku> listBuku = bukuProvider.selectBuku(judul);

            if (listBuku.isEmpty()) {
                DialogUI dialogUI = new DialogUI("Buku tidak terdaftar");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
            } else {
                // Cek apakah ada review untuk buku ini
                Review review = reviewProvider.getReviewByTitle(judul);

//                if (review != null) {
//                    new FormLihatReview(judul, review.getIsiReview()).setVisible(true);
//                } else {
//                    new FormLihatReview(judul, "Belum tersedia review untuk buku ini.").setVisible(true);
//                }
            }
        } catch (Exception ex) {
            DialogUI dialogUI = new DialogUI("Connection Error");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        }
    }
}


