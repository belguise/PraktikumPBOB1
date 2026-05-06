package PBO08_24060124120017;

// Nama File: Data.java
// Pembuat: Lintang Aulia Nuraini - 24060124120017
// Tanggal: 3 Mei 2026
// Deskripsi: Kelas generik untuk menyimpan data dalam larik

public class Data<T> {

    // atribut untuk menyimpan elemen generik
    private T[] ruang;
    private int banyak;

    // konstruktor untuk menginisialisasi larik berukuran 100
    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    // prosedur untuk mengisi elemen pada posisi tertentu (1..100)
    public void setIsi(int pos, T objek) {
        if (pos >= 1 && pos <= 100) {
            ruang[pos - 1] = objek;
            if (pos > banyak) {
                banyak = pos;
            }
        }
    }

    // fungsi untuk mengambil elemen pada posisi tertentu (1..100)
    public T getIsi(int pos) {
        if (pos >= 1 && pos <= 100) {
            return ruang[pos - 1];
        }
        return null;
    }

    // fungsi untuk mendapatkan jumlah elemen yang terisi
    public int getSize() {
        return banyak;
    }
}