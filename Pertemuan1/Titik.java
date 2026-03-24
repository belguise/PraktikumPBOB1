/* Nama File  : Titik.java
 * Deskripsi  : berisi atribut dan method dalam class Titik
 * Pembuat    : Lintang Aulia Nuraini/24060124120017
 * Tanggal    : Kamis, 19 Februari 2026
 */
//source code class titik ini diambil dari buku "Pemrograman Berbasis Objek dengan Java" edisi 2 karya I.K. Sutedja, dengan beberapa modifikasi untuk memenuhi kebutuhan praktikum.

public class Titik {
    /************************ ATRIBUT ************************/
    double absis;
    double ordinat;
    static int counterTitik = 0; // atribut untuk menghitung jumlah objek Titik yang dibuat

    /************************* METHOD *************************/
    
    // konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++; // setiap kali objek Titik dibuat, counterTitik akan bertambah 1
    }
    static int getCounterTitik() {
        return counterTitik;
    }

    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
    
    // mengembalikan kuadran tempat titik berada
    int getKuadran(){
        if (absis > 0 && ordinat > 0) {
        return 1;
        } else if (absis < 0 && ordinat > 0) {
        return 2;
        } else if (absis < 0 && ordinat < 0) {
        return 3;
        } else if (absis > 0 && ordinat < 0) {
        return 4;
        } else {
        return 0;
        }
    }

    // menghitung jarak titik ke titik pusat (0,0)
    double getJarakPusat() {
        double jarak = Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
        return jarak;
    }

    // menghitung jarak titik ke titik lain t
    double getJarak(Titik t) {
        double jarak = Math.sqrt(Math.pow(absis - t.absis, 2) + Math.pow(ordinat - t.ordinat, 2));
        return jarak;
    }

    // merefleksikan titik terhadap sumbu X
    void setRefleksiX() {
        ordinat = -ordinat;
    }

    // merefleksikan titik terhadap sumbu Y
    void setRefleksiY() {
        absis = -absis;
    }

    // mengembalikan objek Titik baru yang merupakan hasil refleksi terhadap sumbu X
    Titik getRefleksiX() {
        Titik t = new Titik();
        t.absis = absis;
        t.ordinat = -ordinat;
        return t;
    }

    // mengembalikan objek Titik baru yang merupakan hasil refleksi terhadap sumbu Y
    Titik getRefleksiY() {
        Titik t = new Titik();
        t.absis = -absis;
        t.ordinat = ordinat;
        return t;
    }

} // end class Titik