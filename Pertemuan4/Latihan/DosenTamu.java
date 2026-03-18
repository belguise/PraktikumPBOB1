package Latihan;

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    // Atribut
    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    // Konstruktor Dosen Tamu
    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidk, LocalDate tanggalAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    // Mengembalikan tunjangan dosen tamu
    @Override
    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    // Menampilkan informasi dosen tamu
    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("NIDK            : " + nidk);       
        System.out.println("Nama            : " + nama);        
        System.out.println("Tanggal lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tamu");  
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + formatMasaKerja());
        System.out.println("Akhir Kontrak   : " + formatTanggal(tanggalAkhirKontrak));
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));             
        System.out.printf("Tunjangan        : 2,5%% x %s = %s%n", formatRupiah(gajiPokok), formatRupiah(getTunjangan()));
    }
}