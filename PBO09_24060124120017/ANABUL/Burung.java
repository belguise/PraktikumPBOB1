package ANABUL;

// Nama File : Burung.java
// Nama      : Lintang Aulia Nuraini
// NIM       : 24060124120017
// Tanggal   : 09 Mei 2026
// Deskripsi : Kelas Burung merupakan subclass
//              dari kelas abstrak Anabul

public class Burung extends Anabul {

    // Konstruktor Burung dengan parameter nama
    public Burung(String nama) {

        // Memanggil konstruktor superclass
        super(nama);
    }

    // Method gerak pada Burung
    @Override
    public void gerak() {
        System.out.println("Terbang");
    }

    // Method suara pada Burung
    @Override
    public void bersuara() {
        System.out.println("Cuit...");
    }

    // Method untuk menentukan jenis hewan
    @Override
    public String getJenis() {
        return "Burung";
    }
}