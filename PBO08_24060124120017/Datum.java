package PBO08_24060124120017;

// Nama File: Datum.java
// Pembuat: Lintang Aulia Nuraini - 24060124120017
// Tanggal: 6 Mei 2026
// Deskripsi: Kelas generik untuk menyimpan satu data bertipe bebas

public class Datum<T> {

    // atribut untuk menyimpan nilai generik
    private T isi;

    // konstruktor tanpa parameter
    public Datum() {
        this.isi = null;
    }

    // konstruktor dengan parameter
    public Datum(T isi) {
        this.isi = isi;
    }

    // fungsi untuk mengambil isi
    public T getIsi() {
        return isi;
    }

    // prosedur untuk mengubah isi
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}