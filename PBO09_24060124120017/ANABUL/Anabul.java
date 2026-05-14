package ANABUL;

// Nama File : Anabul.java
// Nama      : Lintang Aulia Nuraini
// NIM       : 24060124120017
// Tanggal   : 9 Mei 2026
// Deskripsi : Kelas abstrak Anabul sebagai superclass
//              untuk merepresentasikan hewan peliharaan

public abstract class Anabul {

    // Atribut nama asli hewan
    private String nama;

    // Atribut nama panggilan hewan
    private String panggilan;

    // Konstruktor tanpa parameter
    public Anabul() {
    }

    // Konstruktor dengan parameter nama
    public Anabul(String nama) {
        this.nama = nama;

        // Secara default panggilan mengikuti nama
        this.panggilan = nama;
    }

    // Selektor untuk mengambil nama hewan
    public String getNama() {
        return nama;
    }

    // Mutator untuk mengubah nama hewan
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Selektor untuk mengambil nama panggilan
    public String getPanggilan() {
        return panggilan;
    }

    // Mutator untuk mengubah nama panggilan
    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

    // Method gerak yang akan dioverride pada subclass
    public void gerak1() {
    }

    // Method suara yang akan dioverride pada subclass
    public void bersuara1() {
    }

    // Method untuk mengambil bobot hewan
    public double getBobot() {
        return 0.0;
    }

    // Method abstrak untuk menentukan jenis hewan
    public abstract String getJenis();


public abstract void gerak();
public abstract void bersuara();
}