package perpustakaan;

import java.util.ArrayList;

public class ReviewController {

    public void showFormReview() {
        Perpustakaan.FormLihatReview = new FormLihatReview();
        Perpustakaan.FormLihatReview.tampilkan(); 
    }

    public void cariBuku(String judul) {
        BukuProvider bukuProvider = new BukuProvider();

 try {
        ArrayList<Buku> listBuku = bukuProvider.selectBuku(judul);

        if (listBuku.isEmpty()) {
            new DialogUI("Buku tidak ditemukan").setVisible(true);
        } else {
            Perpustakaan.formReview.display(listBuku);
            Perpustakaan.formReview.displayReview(judul, Perpustakaan.reviewProvider.getReviewListByTitle(judul));
            
            System.out.println("Buku ditemukan: " + listBuku.size());
            for (Buku b : listBuku) {
                System.out.println(b.judul);
            }
        }
    } catch (Exception ex) {
        new DialogUI("Connection Error").setVisible(true);
    }
    }

}
