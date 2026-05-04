// Nama File: Anabul.java
// Pembuat: Lintang Aulia Nuraini-24060124120017
// Tanggal: 23 April 2026
// Deskripsi: Kelas induk (superclass) untuk hewan peliharaan (polimorfisme inclusion)

public class Anabul { 
    // deklarasi class Anabul sebagai superclass

    private String nama; 
    // atribut private untuk menyimpan nama hewan (encapsulation)

    public Anabul() {} 
    // konstruktor tanpa parameter (default constructor)
    // tidak melakukan apa-apa, hanya memungkinkan pembuatan objek kosong

    public Anabul(String nama) {
        this.nama = nama;
        // konstruktor dengan parameter
        // "this.nama" mengacu ke atribut, "nama" adalah parameter
        // digunakan untuk mengisi nama saat objek dibuat
    }

    public String getNama() {
        return nama;
        // getter untuk mengambil nilai atribut nama
    }

    public void setNama(String nama) {
        this.nama = nama;
        // setter untuk mengubah nilai atribut nama
    }

    public void gerak() {
        System.out.println("Hewan bergerak");
        // method gerak default
        // akan dioverride di subclass (kucing, anjing, burung)
    }

    public void bersuara() {
        System.out.println("Hewan bersuara");
        // method suara default
        // juga akan dioverride di subclass
    }
}