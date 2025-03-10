/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author Dimas Rezananda
 */
public class Review {
private String judulBuku;
private String isiReview;

public Review(String judulBuku, String isiReview) {
    this.judulBuku = judulBuku;
    this.isiReview = isiReview;
}

public String getJudulBuku() {
    return judulBuku;
}

public String getIsiReview() {
    return isiReview;
}
}
