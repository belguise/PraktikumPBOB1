// Nama File: Burung.java
// Pembuat: Lintang Aulia Nuraini-24060124120017
// Tanggal: 23 April 2026
// Deskripsi: Kelas Burung sebagai turunan dari Anabul (polimorfisme inclusion)

public class Burung extends Anabul {

    // konstruktor tanpa parameter
    public Burung() {
        super(); 
        // memanggil konstruktor default dari Anabul
    }
    
    // konstruktor dengan parameter nama    
    public Burung(String nama) {
        super(nama); 
        // mengirim nilai nama ke class induk
    }

    // override method gerak
    @Override
    public void gerak() {
        System.out.println("Burung bergerak dengan cara terbang");
        // sesuai soal: burung bergerak dengan terbang
    }
    
    // override method bersuara
    @Override
    public void bersuara() {
        System.out.println("Burung bersuara: cuit");
        // sesuai soal: suara burung adalah cuit
    }
}