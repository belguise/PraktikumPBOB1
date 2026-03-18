package Latihan;
import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    // Atribut
    protected String fakultas;

    // Konstruktor Dosen
    public Dosen (String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

}