/* Nama File  : Titik.java
 * Deskripsi  : berisi atribut dan method dalam class Titik (enkapsulasi)
 * Pembuat    : Lintang Aulia Nuraini / 24060124120017
 * Tanggal    : Kamis, 19 Februari 2026
 */

public class Titik {

    /*************** ATRIBUT ***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /*************** METHOD ***************/

    // konstruktor untuk membuat titik (0,0)
    public Titik() {
        this(0, 0);
    }

    // konstruktor berparameter
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // getter
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    // setter
    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    // geser titik
    public void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // cetak titik
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    // kuadran
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) return 1;
        else if (absis < 0 && ordinat > 0) return 2;
        else if (absis < 0 && ordinat < 0) return 3;
        else if (absis > 0 && ordinat < 0) return 4;
        else return 0;
    }

    // jarak ke pusat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // jarak ke titik lain
    public double getJarak(Titik T) {
        double dx = absis - T.getAbsis();
        double dy = ordinat - T.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // refleksi sumbu X (ubah objek)
    public void refleksiX() {
        ordinat = -ordinat;
    }

    // refleksi sumbu Y (ubah objek)
    public void refleksiY() {
        absis = -absis;
    }

    // refleksi X (buat objek baru)
    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // refleksi Y (buat objek baru)
    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }
}