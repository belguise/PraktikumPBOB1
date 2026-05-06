package PBO08_24060124120017;

// Nama File: Kucing.java
// Pembuat: Lintang Aulia Nuraini - 24060124120017
// Tanggal: 3 Mei 2026
// Deskripsi: Kelas Kucing sebagai turunan dari Anabul dengan atribut bobot

public class Kucing extends Anabul {

    // atribut bobot (dalam kilogram)
    private double bobot;

    // konstruktor dengan parameter nama
    public Kucing(String nama) {
        super(nama);
        this.bobot = 0;
    }

    // konstruktor dengan parameter nama dan bobot
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    // getter bobot
    public double getBobot() {
        return bobot;
    }

    // setter bobot
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    // override method gerak dari Anabul
    @Override
    public void gerak() {
        System.out.println("Kucing berjalan");
    }

    // override method bersuara dari Anabul
    @Override
    public void bersuara() {
        System.out.println("Meong");
    }
}