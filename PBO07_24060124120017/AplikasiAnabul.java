// Nama File: AplikasiAnabul.java
// Pembuat: Lintang Aulia Nuraini - 24060124120017
// Tanggal:     23 April 2026
// Deskripsi: Program utama untuk menguji polimorfisme Anabul

public class AplikasiAnabul {
    public static void main(String[] args) {

        // deklarasi variabel referensi bertipe Anabul
        Anabul A;

        // anjing
        A = new Anjing(); 
        // objek Anjing ditampung dalam referensi Anabul (polimorfisme)

        A.setNama("Heli"); 
        // mengisi nama hewan

        A.gerak(); 
        // memanggil method gerak → versi Anjing (override)

        A.bersuara(); 
        // memanggil method bersuara → versi Anjing
        System.out.println();

        // objek langsung bertipe Anjing
        Anjing anjing = new Anjing("Dog");

        anjing.gerak();
        anjing.bersuara();
        System.out.println();


        // kucing
        A = new Kucing();
        A.setNama("Keli");

        A.gerak(); 
        // akan menjalankan gerak milik Kucing

        A.bersuara(); 
        // suara khas kucing
        System.out.println();

        Kucing kucing = new Kucing("Catty");

        kucing.gerak();
        kucing.bersuara();
        System.out.println();


        //burung 
        A = new Burung();
        A.setNama("Beo");

        A.gerak(); 
        // gerak burung (terbang)

        A.bersuara(); 
        // suara burung
        System.out.println();

        Burung burung = new Burung("Walet");

        burung.gerak();
        burung.bersuara();
        System.out.println();


        // Anabul tanpa spesifikasi jenis hewan
        A = new Anabul("Atan");

        A.gerak(); 
        // akan menjalankan method default dari Anabul

        A.bersuara(); 
        // tidak dioverride → output default
    }
}