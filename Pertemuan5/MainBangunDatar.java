//Nama : Lintang Aulia Nuraini
//NIM  : 24060124120017
//Kelas : PBO B2
//Tanggal : 18 Maret 2026
//

import Pertemuan6.Lingkaran;

public class MainBangunDatar {
    public static void main(String[] args) {

        BangunDatar P1 = new Persegi(10); 
        // polymorphism : tipe BangunDatar, objek Persegi

        Persegi P2 = new Persegi(5);

        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);

      
        System.out.println("=== AWAL ===");
        System.out.println("Luas P1: " + P1.getLuas());
        System.out.println("Keliling L1: " + L1.getKeliling());

   
        // perbandingan
        System.out.println("\n=== PERBANDINGAN ===");
        System.out.println("Luas sama? " + P1.isEqualLuas(P2));
        System.out.println("Keliling sama? " + L1.isEqualKeliling(L2));

       
        // resize biasa
        P2.zoomIn();   // +10%
        L2.zoomOut();  // -10%

        System.out.println("\n=== SETELAH ZOOM IN/OUT ===");
        System.out.println("Luas P2: " + P2.getLuas());
        System.out.println("Keliling L2: " + L2.getKeliling());

       
        // resize custom
        P2.zoom(200); // jadi 2x
        L2.zoom(50);  // jadi setengah

        System.out.println("\n=== SETELAH ZOOM CUSTOM ===");
        System.out.println("Luas P2: " + P2.getLuas());
        System.out.println("Keliling L2: " + L2.getKeliling());
    }
}

