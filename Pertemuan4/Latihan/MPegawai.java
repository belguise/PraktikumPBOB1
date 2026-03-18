package Latihan;

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        // membuat objek dosen tetap dan menampilkan infonya
        DosenTetap dt = new DosenTetap("9545647548", "Andi", LocalDate.of(1990, 5,5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika", "78647324");
        dt.printInfo();
        System.out.println();

        // membuat objek dosen tamu dan menampilkan infonya
        DosenTamu dta = new DosenTamu("9545647549", "Budi", LocalDate.of(1992, 3, 10), LocalDate.of(2020, 6, 1), 4000000, "Fakultas Teknik", "88647324", LocalDate.of(2026, 12, 31));
        dta.printInfo();
        System.out.println();

        // membuat objek tendik dan menampilkan infonya
        Tendik tk = new Tendik("9545647555", "Lala", LocalDate.of(1985, 7,5), LocalDate.of(2017, 3, 1), 3500000, "Akademik");
        tk.printInfo();
    }
}