/**
 * Nama File    : MTitik.java
 * Deskripsi    : main class untuk mencoba class Titik
 * Pembuat      : [Nama Anda]
 * Tanggal      : 19 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        // Membuat objek titik T1 (0,0)
        Titik T1 = new Titik(); 
        
        // Mengubah absis T1 dengan nilai 3
        T1.setAbsis(3); 
        
        // Mengubah ordinat T1 dengan nilai 4
        T1.setOrdinat(4); 
        
        // Mencetak koordinat T1 ke layar
        T1.printTitik(); 
        
        // Menggeser T1 sejauh (3,4)
        T1.geser(3, 4); 
        
        // Menampilkan koordinat T1 setelah digeser
        T1.printTitik(); 
    }
}
