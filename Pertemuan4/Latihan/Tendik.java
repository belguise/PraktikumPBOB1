package Latihan;

import java.time.LocalDate;

public class Tendik extends Pegawai {
    // Atribut
    private String bidang;
    private static final int BUP = 55;

    // Konstruktor Tendik
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    // Mengembalikan tunjangan tendik
    @Override
    public double getTunjangan() {
        return 0.01 * getMasaKerja().getYears() * gajiPokok;
    }

    // Menampilkan informasi tendik
    @Override
    public void printInfo() {
        int tahun = getMasaKerja().getYears();
        System.out.println("NIP             : " + nip);  
        System.out.println("Nama            : " + nama);        
        System.out.println("Tanggal lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Tenaga Kependidikan");  
        System.out.println("Bidang          : " + bidang);
        System.out.println("Masa Kerja      : " + formatMasaKerja());
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun(BUP)));
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));             
        System.out.printf("Tunjangan        : 1%% x %d x %s = %s%n", tahun,formatRupiah(gajiPokok), formatRupiah(getTunjangan()));
    }
}