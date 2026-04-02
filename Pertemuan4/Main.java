//Nama : Lintang Aulia Nuraini
//NIM  : 24060124120017
//Kelas : PBO B2
//Tanggal : 01 Maret 2026

import Pertemuan6.Lingkaran;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi2 = new Persegi();
        System.out.println("Informasi Persegi:");
        persegi2.printInfo();
        System.out.println();

        Persegi persegi = new Persegi(5.0, "Merah", "Solid");
        System.out.println("Informasi Persegi:");
        persegi.printInfo();
        System.out.println();

        System.out.println("================================");

        // Menguji kelas Lingkaran
        Lingkaran lingkaran1 = new Lingkaran();
        System.out.println("Informasi Lingkaran:");
        lingkaran1.printInfo();
        System.out.println();

        Lingkaran lingkaran2 = new Lingkaran(4.5, "Biru", "Putih");
        System.out.println("Informasi Lingkaran:");
        lingkaran2.printInfo();
        System.out.println();

        // menghitung bangun 2 dimensi
        BangunDatar.printCounterBangunDatar();
        Persegi.printCounterPersegi();
        Lingkaran.printCounterLingkaran();
    }
}