/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

public class PeminjamanManager {
    
    public Boolean save(BukuDipinjam[] bukuDipinjam) {
        if (bukuDipinjam == null || bukuDipinjam.length == 0) {
            return false;
        }

        System.out.println("Menyimpan data peminjaman...");
        for (BukuDipinjam buku : bukuDipinjam) {
            System.out.println("Buku: " + buku.judul + " | Lama: " + buku.lama + " hari");
        }
        
        return true;
    }
}