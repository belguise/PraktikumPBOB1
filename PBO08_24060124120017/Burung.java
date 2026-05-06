package PBO08_24060124120017;

// Nama File: Burung.java
// Pembuat: Lintang Aulia Nuraini - 24060124120017
// Tanggal: 3 Mei 2026
// Deskripsi: Kelas Burung sebagai turunan dari Anabul

public class Burung extends Anabul {

    // konstruktor untuk mengisi nama burung
    public Burung(String nama) {
        super(nama);
    }

    // override method gerak dari superclass
    @Override
    public void gerak() {
        System.out.println("Burung terbang");
    }

    // override method bersuara dari superclass
    @Override
    public void bersuara() {
        System.out.println("Cuit");
    }
}