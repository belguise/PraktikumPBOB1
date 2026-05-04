// Nama File: Kucing.java
// Pembuat: Lintang Aulia Nuraini   - 24060124120017
// Tanggal: 23 April 2026
// Deskripsi: Kelas Kucing sebagai turunan dari Anabul (polimorfisme inclusion)

public class Kucing extends Anabul {

    // konstruktor tanpa parameter
    public Kucing() {
        super(); 
        // memanggil konstruktor default dari Anabul
    }
    
    // konstruktor dengan parameter nama
    public Kucing(String nama) {
        super(nama); 
        // mengirim nilai nama ke class induk
    }

    // override method gerak
    @Override
    public void gerak() {
        System.out.println("Kucing bergerak dengan cara melataaaa");
        // sesuai soal: kucing bergerak melata???, katanya tidak perlu diubah
    }

    // override method bersuara
    @Override
    public void bersuara() {
        System.out.println("Kucing bersuara: meong");
        // sesuai soal: suara kucing adalah meong
    }
}