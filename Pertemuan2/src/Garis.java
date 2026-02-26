/* Nama File  : Garis.java
 * Deskripsi  : berisi atribut dan method class Garis
 * Pembuat    : Lintang Aulia Nuraini / 24060124120017
 * Tanggal    : Kamis, 26 Februari 2026
 */

public class Garis {

    /*************** ATRIBUT ***************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /*************** KONSTRUKTOR ***************/
    // konstruktor tanpa parameter
    public Garis() {
        titikAwal = new Titik(0, 0);
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // konstruktor dengan parameter
    public Garis(Titik t1, Titik t2) {
        titikAwal = t1;
        titikAkhir = t2;
        counterGaris++;
    }

    /*************** SELEKTOR & MUTATOR ***************/
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAwal(Titik t) {
        titikAwal = t;
    }

    public void setTitikAkhir(Titik t) {
        titikAkhir = t;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    /*************** METHOD ***************/
    // panjang garis
    public double getPanjang() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // gradien garis
    public double getGradien() {
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) /
               (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    // titik tengah
    public Titik getTitikTengah() {
        double x = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double y = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(x, y);
    }

    // cek sejajar
    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // cek tegak lurus
    public boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    // tampilkan titik awal & akhir
    public void printGaris() {
        System.out.print("Titik Awal: ");
        titikAwal.printTitik();
        System.out.print("Titik Akhir: ");
        titikAkhir.printTitik();
    }

    // persamaan garis
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}