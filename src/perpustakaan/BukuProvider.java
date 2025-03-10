/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;


public class BukuProvider {
    
    private ArrayList<Buku> bukuCollection;
    
    public BukuProvider() {
       bukuCollection = new ArrayList<>();
bukuCollection.add(new Buku("Sherlock Holmes"));
bukuCollection.add(new Buku("Topeng Kaca"));
bukuCollection.add(new Buku("Doraemon"));
bukuCollection.add(new Buku("Petualangan Doraemon"));
bukuCollection.add(new Buku("Thomas and Friends"));
bukuCollection.add(new Buku("The Return of Sherlock Holmes"));
bukuCollection.add(new Buku("The Adventure of Sherlock Holmes"));
bukuCollection.add(new Buku("Harry Potter and the Sorcerer's Stone"));
bukuCollection.add(new Buku("Lord of the Rings"));
bukuCollection.add(new Buku("The Chronicles of Narnia"));
bukuCollection.add(new Buku("Percy Jackson and the Olympians"));
bukuCollection.add(new Buku("A Game of Thrones"));
bukuCollection.add(new Buku("To Kill a Mockingbird"));
bukuCollection.add(new Buku("1984"));
bukuCollection.add(new Buku("Moby-Dick"));

    }
    
    
    public ArrayList<Buku> selectBuku(String judul) {
        
        ArrayList<Buku> foundBuku = new ArrayList<>();
        
        for(Buku buku : this.bukuCollection) {
            if(buku.judul.contains(judul))
                foundBuku.add(buku);
        }
        
        return foundBuku;
    }
    
}
