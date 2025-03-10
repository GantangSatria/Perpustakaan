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
public class ReviewProvider {
 private ArrayList<Review> daftarReview;
 
 public ReviewProvider(){
     daftarReview = new ArrayList<>();
     daftarReview.add(new Review("Sherlock Holmes", "Review: Cerita dektektif yang sangat menarik."));
 }
 
 public Review getReviewByTitle(String judul){
     for (Review review : daftarReview){
         if (review.getJudulBuku().equalsIgnoreCase(judul)){
             return review;
         }
     }
     return null;
 }
}

