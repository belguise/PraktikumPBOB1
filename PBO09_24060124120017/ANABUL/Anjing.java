package ANABUL;

// Nama File : Anjing.java
// Nama      : Lintang Aulia Nuraini
// NIM       : 24060124120017
// Tanggal   : 09 Mei 2026
// Deskripsi : Kelas Anjing merupakan turunan
//              dari kelas abstrak Anabul

public class Anjing extends Anabul {

    // Konstruktor Anjing dengan parameter nama
    public Anjing(String nama) {

        // Memanggil konstruktor superclass
        super(nama);
    }

    // Method gerak untuk objek Anjing
    @Override
    public void gerak() {
        System.out.println("Melata");
    }

    // Method suara untuk objek Anjing
    @Override
    public void bersuara() {
        System.out.println("Guk-guk");
    }

    // Method untuk menentukan jenis hewan
    @Override
    public String getJenis() {
        return "Anjing";
    }
}