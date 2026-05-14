import java.util.LinkedList;

// Nama File : Piaraan.java
// Nama      : Lintang Aulia Nuraini
// NIM       : 24060124120017
// Tanggal   : 09 Mei 2026
// Deskripsi : Kelas untuk mengelola antrean objek Anabul

public class Piaraan {

    // Menyimpan jumlah elemen antrean
    private int nbelm;

    // Koleksi antrean Anabul menggunakan LinkedList
    private LinkedList<Anabul> Lanabul;

    // Konstruktor
    public Piaraan() {

        // Inisialisasi linked list
        Lanabul = new LinkedList<>();

        // Jumlah elemen awal = 0
        nbelm = 0;
    }

    // Mengembalikan jumlah elemen antrean
    public int getNbelm() {
        return nbelm;
    }

    // Menambahkan Anabul ke akhir antrean
    public void enqueueAnabul(Anabul a) {
        Lanabul.addLast(a);
        nbelm++;
    }

    // Mengecek apakah Anabul ada dalam antrean
    public boolean isMember(Anabul a) {
        return Lanabul.contains(a);
    }

    // Mengambil elemen pertama antrean
    public Anabul getAnabul() {
        return Lanabul.peekFirst();
    }

    // Mengambil dan menghapus elemen pertama antrean
    public Anabul dequeueAnabul() {

        if (!Lanabul.isEmpty()) {
            nbelm--;
            return Lanabul.pollFirst();
        }

        return null;
    }

    // Menampilkan nama panggilan seluruh Anabul
    public void showAnabul() {

        for (Anabul a : Lanabul) {
            System.out.println(a.getPanggilan());
        }
    }

    // Menghitung jumlah keluarga kucing
    public int countKucing() {

        int count = 0;

        for (Anabul a : Lanabul) {

            if (a instanceof Kucing) {
                count++;
            }
        }

        return count;
    }

    // Menghitung total bobot keluarga kucing
    public double bobotKucing() {

        double total = 0;

        for (Anabul a : Lanabul) {

            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }

        return total;
    }

    // Menampilkan nama panggilan dan jenis class Anabul
    public void showJenisAnabul() {

        for (Anabul a : Lanabul) {

            System.out.println(
                a.getPanggilan() + " - " +
                a.getClass().getSimpleName()
            );
        }
    }
}