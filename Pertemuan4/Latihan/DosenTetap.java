package Latihan;

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    // Atribut
    private String nidn;
    private static final int BUP = 65;

    // Konstruktor DosenTetap
    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    // mengembalikan Tunjangan dosen tetap
    @Override
    public double getTunjangan() {
        return 0.02 * getMasaKerja().getYears() * gajiPokok;
    }

    // menampilkan informasi dosen tetap
    @Override
    public void printInfo() {
        int tahun = getMasaKerja().getYears();
        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);       
        System.out.println("Nama            : " + nama);        
        System.out.println("Tanggal lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tetap");  
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + formatMasaKerja());
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun(BUP)));
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));             
        System.out.printf("Tunjangan       : 2%% x %d x %s = %s%n", tahun, formatRupiah(gajiPokok), formatRupiah(getTunjangan()));
    }
}