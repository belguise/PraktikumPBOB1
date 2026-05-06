package PBO08_24060124120017;


// Nama File: Anjing.java
// Pembuat: Lintang Aulia Nuraini - 24060124120017
// Tanggal: 3 Mei 2026
// Deskripsi: Kelas Anjing sebagai turunan dari Anabul

public class Anjing extends Anabul {

    // konstruktor untuk mengisi nama anjing
    public Anjing(String nama) {
        super(nama);
    }

    // override method gerak dari superclass
    @Override
    public void gerak() {
        System.out.println("Anjing bergerak dengan berlari");
    }

    // override method bersuara dari superclass
    @Override
    public void bersuara() {
        System.out.println("Guk-guk");
    }
}