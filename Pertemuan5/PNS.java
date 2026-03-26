// Nama File : PNS.java
//NIM : 24060124120017
// Deskripsi : Abstract class yang merepresentasikan manusia secara umum
// Pembuat   : Lintang Aulia (dimodifikasi)
// Tanggal   : 2026
// Deskripsi : Subclass Manusia untuk PNS

import java.util.Date;

public class PNS extends Manusia implements Pajak {

    private String nip;
    private static int counterPNS = 0;

    // konstruktor lengkap
    public PNS(String nama, Date tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // konstruktor tanpa alamat (overloading)
    public PNS(String nama, Date tglMulaiKerja, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, "", pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    // override method abstract
    @Override
    public int hitungMasaKerja() {
        int selisih = new Date().getYear() - tglMulaiKerja.getYear();
        return selisih + 0; // A = 0
    }

    // menghitung pajak
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP             : " + nip);
    }
}