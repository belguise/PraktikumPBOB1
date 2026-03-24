
/* Nama File  : MGaris.java
 * Deskripsi  : main class untuk menguji class Garis
 * Pembuat    : Lintang Aulia Nuraini / 24060124120017
 * Tanggal    : Kamis, 26 Februari 2026
 */
public class MainGaris {
    public static void main(String[] args) {

        // Membuat garis pertama dengan constructor berparameter
        Garis garisA = new Garis(-2, 0, 0, 4);

        // Membuat garis kedua dengan constructor kosong
        Garis garisB = new Garis();

        // Set titik awal dan akhir garisB
        Titik awal = new Titik(0, 0);
        Titik akhir = new Titik(1, 1);

        garisB.setTitik1(awal);
        garisB.setTitik2(akhir);

        // Menampilkan informasi garis
        System.out.println("=== DATA GARIS ===");
        System.out.print("Garis A -> ");
        garisA.printGaris();
        System.out.print("Garis B -> ");
        garisB.printGaris();

        // Jumlah objek garis
        System.out.println("\nTotal objek garis: " + Garis.getCountGaris());

        // Panjang masing-masing garis
        double panjangA = garisA.getPanjangGaris();
        double panjangB = garisB.getPanjangGaris();
        System.out.println("Panjang Garis A: " + panjangA);
        System.out.println("Panjang Garis B: " + panjangB);

        // Gradien
        System.out.println("Gradien A: " + garisA.getGradien());
        System.out.println("Gradien B: " + garisB.getGradien());

        // Titik tengah
        Titik tengahA = garisA.getTitikTengah();
        Titik tengahB = garisB.getTitikTengah();

        System.out.println("Titik tengah A: (" + tengahA.getAbsis() + ", " + tengahA.getOrdinat() + ")");
        System.out.println("Titik tengah B: (" + tengahB.getAbsis() + ", " + tengahB.getOrdinat() + ")");

        // Relasi antar garis
        if (garisA.isSejajar(garisB)) {
            System.out.println("Garis A dan B sejajar");
        } else {
            System.out.println("Garis A dan B tidak sejajar");
        }

        if (garisA.isTegakLurus(garisB)) {
            System.out.println("Garis A dan B tegak lurus");
        } else {
            System.out.println("Garis A dan B tidak tegak lurus");
        }

        // Persamaan garis
        System.out.println("\nPersamaan Garis A:");
        garisA.printPersamaanGaris();

        System.out.println("Persamaan Garis B:");
        garisB.printPersamaanGaris();
    }
}
