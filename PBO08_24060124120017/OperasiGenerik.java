package PBO08_24060124120017;

// Nama File: OperasiGenerik.java
// Pembuat: Lintang Aulia Nuraini - 24060124120017
// Tanggal: 3 Mei 2026
// Deskripsi: Kelas untuk operasi generik (tukar dan perhitungan bobot)

public class OperasiGenerik {

    // prosedur generik untuk menukar isi dua objek Datum
    public static <T> void tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    // fungsi generik untuk menjumlahkan bobot dua objek Kucing
    public static <T extends Kucing> double bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}