// Nama File : Pengusaha.java
// Deskripsi : Subclass Manusia untuk Pengusaha
//NIM : 24060124120017
// Pembuat   : Lintang Aulia (dimodifikasi)
// Tanggal   : 18 Maret 2026


import java.util.Date;

public class Pengusaha extends Manusia implements Pajak {

    // atribut khusus
    private String npwp; // nomor pajak pengusaha
    private static int counterPengusaha = 0; 
    // menghitung jumlah objek Pengusaha

    // konstruktor lengkap
    public Pengusaha(String nama, Date tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan); 
        // memanggil konstruktor parent (Manusia)

        this.npwp = npwp; // inisialisasi atribut khusus
        counterPengusaha++; // increment jumlah objek
    }

    // METHhod STATIC
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // OVERRIDE METHOD ABSTRACT
    @Override
    public int hitungMasaKerja() {
        // hitung selisih tahun sekarang dengan tahun mulai kerja
        int selisih = new Date().getYear() - tglMulaiKerja.getYear();

        return selisih + 0; 
        // B = 0 (diambil dari digit NIM)
    }

    // METHOD KHUSUS PENGUSAHA
    public double hitungPajak() {
        return 0.15 * pendapatan; 
        // pajak pengusaha = 15% dari pendapatan
    }

    // CETAKK
    @Override
    public void cetakInfo() {
        super.cetakInfo(); 
        // memanggil method cetakInfo() dari class Manusia

        System.out.println("NPWP            : " + npwp);
        // menampilkan atribut tambahan milik Pengusaha
    }
}