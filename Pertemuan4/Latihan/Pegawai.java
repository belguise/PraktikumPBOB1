package Latihan;

import java.time.LocalDate;
import java.time.Period;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Pegawai {
    // Atribut
    protected String nip, nama;
    protected LocalDate tanggalLahir, tmt;
    protected double gajiPokok;
    protected static final String[] BULAN = {
        "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli",
        "Agustus", "September", "Oktober", "November", "Desember"
    };

    // Konstruktor
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // Metode
    // Menghitung masa kerja dari TMT hingga tanggal sekarang
    public Period getMasaKerja() {
        return tmt.until(LocalDate.now());
    }

    // menformat masa kerja "x tahun y bulan"
    public String formatMasaKerja() {
        Period p = getMasaKerja();
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    // menghitung tanggal pensiun: tanggal 1 bulan setelah tanggal lahir hingga BUP
    public LocalDate getTanggalPensiun(int bup) {
        return tanggalLahir.plusYears(bup).withDayOfMonth(1).plusMonths(1);
    }

    // Memformat tanggal "dd bulan yyyy"
    public static String formatTanggal(LocalDate date) {
        return date.getDayOfMonth() + " " + BULAN[date.getMonthValue() - 1] + " " + date.getYear();
    }

    // Menformat nominal rupiah
    public static String formatRupiah(double nominal) {
        return NumberFormat.getCurrencyInstance(new Locale("id", "ID")).format(nominal);
    }

    // metode yang wajib diimplementasikan subclass
    public abstract double getTunjangan();
    public abstract void printInfo();
}