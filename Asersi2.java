// Nama File = Asersi2.java
// Pembuat = Lintang Aulia Nuraini
// NIM = 24060124120017
// Tanggal = 26 Maret 2026
// Deskripsi = Perbaikan penggunaan assert dan validasi input

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        if (jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari harus lebih dari nol");
        }
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 7;

        // assert untuk memastikan kondisi internal (opsional)
        assert (jariJari > 0) : "Nilai jari-jari tidak valid";

        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();

        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

/*
Jawab Pertanyaan

Apa yang kurang tepat pada program Asersi2?

Jawab:
Penggunaan assert pada program kurang tepat karena digunakan untuk memvalidasi nilai input (jari-jari). 
Seharusnya assert dipakai untuk mengecek kondisi internal program, bukan untuk menangani kesalahan dari input pengguna.

Selain itu, kondisi assert yang digunakan adalah (jariJari > 0), yang berarti nilai negatif juga tidak diperbolehkan, 
sedangkan pesan yang ditampilkan hanya menyebutkan tidak boleh nol, sehingga kurang konsisten.

Di sisi lain, assert tidak selalu dijalankan karena harus diaktifkan dengan opsi -ea (enable assertions). 
Oleh karena itu, validasi input yang lebih tepat adalah menggunakan pengecekan if dan melempar exception.
*/