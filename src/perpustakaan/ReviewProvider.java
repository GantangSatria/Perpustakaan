package perpustakaan;

import java.util.ArrayList;

public class ReviewProvider {
    private ArrayList<Buku> daftarBuku;
    private ArrayList<Review> daftarReview;

    public ReviewProvider() {
        daftarBuku = new ArrayList<>();
        daftarReview = new ArrayList<>();
        
        // Data awal untuk contoh
        daftarBuku.add(new Buku("Sherlock Holmes"));
        daftarBuku.add(new Buku("Harry Potter"));
        daftarReview.add(new Review("Sherlock Holmes", "Cerita detektif yang sangat menarik."));
    }

    public void tambahReview(String judul, String isiReview) {
        daftarReview.add(new Review(judul, isiReview));
    }

    public ArrayList<Review> getReviewListByTitle(String judul) {
        ArrayList<Review> hasil = new ArrayList<>();
        for (Review review : daftarReview) {
            if (review.getJudulBuku().equalsIgnoreCase(judul)) {
                hasil.add(review);
            }
        }
        return hasil;
    }

    public ArrayList<Buku> getAllBuku() {
        return new ArrayList<>(daftarBuku);
    }

    public ArrayList<Buku> cariBuku(String keyword) {
        ArrayList<Buku> hasil = new ArrayList<>();
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().toLowerCase().contains(keyword.toLowerCase())) {
                hasil.add(buku);
            }
        }
        return hasil;
    }
}
