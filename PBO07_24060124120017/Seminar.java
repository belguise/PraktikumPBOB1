// Nama File: Seminar.java
// Pembuat: Lintang Aulia Nuraini - 24060124120017
// Tanggal: 23 April 2026
// Deskripsi: Kelas Seminar untuk mengelola peserta (polimorfisme inclusion)

public class Seminar {

    // atribut
    private Civitasakademika[] peserta = new Civitasakademika[100];
    private int banyakpeserta;

    // konstruktor
    public Seminar() {
        this.banyakpeserta = 0;
    }

    // menghitung jumlah peserta
    public int countPeserta() {
        return banyakpeserta;
    }

    // registrasi peserta (HARUS polymorphism)
    public void registrasi(Civitasakademika c) {
        if (banyakpeserta < 100) {
            peserta[banyakpeserta] = c;
            banyakpeserta++;
            System.out.println(c.getNama() + " sudah berhasil terdaftar.");
        } else {
            System.out.println("WARNING: Kapasitas seminar sudah penuh.");
        }
    }

    // menampilkan daftar peserta
    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar:");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i + 1) + ". Nomor: "
                + peserta[i].getNomor()
                + ", Nama: "
                + peserta[i].getNama());
        }
    }

    // menghitung jumlah mahasiswa
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (peserta[i] instanceof MahasiswaNo4) {
                count++;
            }
        }
        return count;
    }
}