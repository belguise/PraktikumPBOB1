package ANABUL;

// Nama File : Kucing.java
// Nama      : Lintang Aulia Nuraini
// NIM       : 24060124120017
// Tanggal   : 09 Mei 2026
// Deskripsi : Kelas Kucing merupakan subclass
//              dari kelas abstrak Anabul
//              dengan tambahan atribut bobot

public class Kucing extends Anabul {

    // Atribut bobot kucing dalam kilogram
    private double bobot;

    // Konstruktor dengan parameter nama
    public Kucing(String nama) {

        // Memanggil konstruktor superclass
        super(nama);

        // Nilai awal bobot
        this.bobot = 0;
    }

    // Konstruktor dengan parameter nama dan bobot
    public Kucing(String nama, double bobot) {

        // Memanggil konstruktor superclass
        super(nama);

        // Mengisi atribut bobot
        this.bobot = bobot;
    }

    // Selektor untuk mengambil bobot kucing
    @Override
    public double getBobot() {
        return bobot;
    }

    // Mutator untuk mengubah bobot kucing
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    // Method gerak pada kucing
    @Override
    public void gerak() {
        System.out.println("Berjalan");
    }

    // Method suara pada kucing
    @Override
    public void bersuara() {
        System.out.println("Meong...");
    }

    // Method untuk menentukan jenis hewan
    @Override
    public String getJenis() {
        return "Kucing";
    }
}