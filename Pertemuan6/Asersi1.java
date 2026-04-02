package Pertemuan6;
// Nama File = Asersi1.java
// Pembuat = Lintang Aulia Nuraini
// NIM = 24060124120017
// Tanggal = 26 Maret 2026
// Deskripsi = Program untuk menunjukkan asersi.

public class Asersi1 {
    public static void main(String[] args) {
        int x = 2;
        if (x > 0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}