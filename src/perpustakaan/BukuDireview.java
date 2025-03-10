package perpustakaan;

import java.util.ArrayList;

public class BukuDireview extends Buku {
    private ArrayList<Review> daftarReview;

    public BukuDireview(String judul) {
        super(judul);
        daftarReview = new ArrayList<>();
    }

    public void tambahReview(String isiReview) {
        daftarReview.add(new Review(getJudul(), isiReview));
    }

    public ArrayList<Review> getReviewList() {
        return daftarReview;
    }

    public boolean memilikiReview() {
        return !daftarReview.isEmpty();
    }

    
}
