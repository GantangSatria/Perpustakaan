/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author acer
 */
public class BukuDipinjam extends Buku {
    public int lama;
    
    public BukuDipinjam(String judul, int lama) {
        super(judul);
        this.lama = lama;
    }
    
}
