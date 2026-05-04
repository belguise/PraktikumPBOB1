// Nama File: Anjing.java
// Pembuat: Lintang Aulia Nuraini - 24060124120017
// Tanggal: 23 April 2026
// Deskripsi: Kelas Anjing sebagai turunan dari Anabul (polimorfisme inclusion)

public class Anjing extends Anabul {

    // konstruktor default (tanpa parameter)
    public Anjing() {
        super(); 
        // memanggil konstruktor default dari class Anabul
    }

    // konstruktor dengan parameter nama
    public Anjing(String nama) {
        super(nama); 
        // mengirim nilai nama ke konstruktor parent (Anabul)
    }

    // method gerak khusus untuk Anjing (override dari Anabul)
    @Override
    public void gerak() {
        System.out.println("Anjing bergerak dengan cara melata");
        // sesuai pada soal: anjing bergerak melata
    }

    // method suara khusus untuk Anjing (override dari Anabul)
    @Override
    public void bersuara() {
        System.out.println("Anjing bersuara: guk-guk");
        // sesuai pada soal: suara anjing adalah guk-guk
    }
}