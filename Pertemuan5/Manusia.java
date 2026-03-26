// Nama File : Manusia.java
//NIM : 24060124120017
// Deskripsi : Abstract class yang merepresentasikan manusia secara umum
// Pembuat   : Lintang Aulia (dimodifikasi)
// Tanggal   : 2026

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Manusia {

    // ATRIBUT
    protected String nama;
    protected String alamat;
    protected Date tglMulaiKerja;
    protected double pendapatan;

    protected static int counterMns = 0; 
    // menyimpan jumlah objek Manusia yang dibuat

    // KONSTRUKTOR
    public Manusia(String nama, Date tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;

        counterMns++; // setiap objek dibuat, counter bertambah
    }

    // GETTER N SETTER
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    public void setTglMulaiKerja(Date tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // METHOD STATIC
    public static int getCounterMns() {
        return counterMns;
    }

    //CETAK INFO
    public void cetakInfo() {
        
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Kerja   : " + format.format(tglMulaiKerja));
        System.out.println("Alamat          : " + alamat);
        System.out.println("Pendapatan      : " + pendapatan);
    }

    // METHOD ABSTRACT
    public abstract int hitungMasaKerja(); 
    // wajib diimplementasikan di subclass
}