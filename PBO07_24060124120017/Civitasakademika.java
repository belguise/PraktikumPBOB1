// Nama File: Civitasakademika.java
// Pembuat: Lintang Aulia Nuraini-24060124120017
// Tanggal: 23 April 2026
// Deskripsi: Kelas abstrak sebagai induk dari Dosen dan Mahasiswa

public abstract class Civitasakademika {

    // atribut untuk menyimpan nama
    private String nama;

    // konstruktor tanpa parameter
    public Civitasakademika() {}

    // konstruktor dengan parameter nama
    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    // getter untuk nama
    public String getNama() {
        return nama;
    }

    // method abstract untuk mendapatkan nomor (NIM/NIP)
    public abstract String getNomor();

    // setter untuk mengubah nama
    public void setNama(String nama) {
        this.nama = nama;
    }
}