// Nama File : MManusia.java
// Deskripsi : Program utama untuk menjalankan dan menguji class Manusia
// Pembuat   : Lintang Aulia
// Tanggal   : 2026

import java.util.Date;

public class MManusia {
    public static void main(String[] args) {

        // pembuatan objek
        PNS p1 = new PNS(
            "Satriyo",
            new Date(2006-1900, 4-1, 1),
            "Jl. Seroja",
            15000000,
            "198302032006041002"
        );

        Pengusaha pe1 = new Pengusaha(
            "Adhy",
            new Date(2000-1900, 1-1, 1),
            "Jl. Air",
            55000000,
            "000-556-773"
        );

        Petani pt1 = new Petani(
            "Nugraha",
            new Date(1977-1900, 1-1, 9),
            "Jl. Bunga 9 Tembalang",
            5000000,
            "Wonogiri"
        );

        PNS p2 = new PNS(
            "Panji",
            new Date(2010-1900, 4-1, 1),
            10000000,
            "198004212010041002"
        );

        // set alamat
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        // jumlah objek
        System.out.println("Jumlah Manusia: " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS: " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha: " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani: " + Petani.getCounterPetani());

        // pajak
        Pajak a = p1;
        Pajak b = pe1;
        Pajak c = pt1;

        System.out.println("Pajak p1: " + a.hitungPajak());
        System.out.println("Pajak pe1: " + b.hitungPajak());
        System.out.println("Pajak pt1: " + c.hitungPajak());

        // masa kerja
        System.out.println("Masa kerja p1: " + p1.hitungMasaKerja());
        System.out.println("Masa kerja pe1: " + pe1.hitungMasaKerja());
        System.out.println("Masa kerja pt1: " + pt1.hitungMasaKerja());

        // cetak info
        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();

      
        Manusia[] data = {p1, pe1, pt1};

        for (Manusia m : data) {
            System.out.println("Nama: " + m.getNama());
            System.out.println("Masa kerja: " + m.hitungMasaKerja());

            if (m instanceof Pajak) {
                System.out.println("Pajak: " + ((Pajak) m).hitungPajak());
            }
        }
    }
}