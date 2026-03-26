// Nama File : Petani.java
// Deskripsi : Kelas turunan dari Manusia yang merepresentasikan petani
// Pembuat   : Lintang Aulia (modifikasi)
// Tanggal   : 18 Maret 2026

import java.util.Date;

public class Petani extends Manusia implements Pajak {

    // ATRIBUT KHUSUS
    private String asalDaerah; // asal petani
    private static int counterPetani = 0; 
    // menghitung jumlah objek Petani

    // KONSTRUKTOR
    public Petani(String nama, Date tglMulaiKerja, String alamat, double pendapatan, String asalDaerah) {
        super(nama, tglMulaiKerja, alamat, pendapatan);

        this.asalDaerah = asalDaerah;
        counterPetani++; // increment jumlah objek
    }

    // METHOD STATIC
    public static int getCounterPetani() {
        return counterPetani;
    }

    // OVERRIDE METHOD ABSTRACT
    @Override
    public int hitungMasaKerja() {
        int selisih = new Date().getYear() - tglMulaiKerja.getYear();

        return selisih + 2; 
        // C = 2 (dari NIM kamu)
    }

    // METHOD KHUSUS PETANI
    public double hitungPajak() {
        return 0; 
        // petani tidak dikenakan pajak
    }

    // CETAK INFO
    @Override
    public void cetakInfo() {
        super.cetakInfo();

        System.out.println("Asal Daerah     : " + asalDaerah);
    }
}