/*
Nama File    : Garis.java
Deskripsi    : sebuah class untuk membuat garis
Pembuat      : Lintang Aulia Nuraini
NIM         : 24060124120017
Tanggal      : 26 Februari 2026
*/

public class Garis {
    /****************** Atributes *******************/
    Titik titik1;
    Titik titik2;
    static int CountGaris = 0;
    /****************** Constructor *******************/
    // konstruktor untuk membuat garis dengan titik awal (0,0) dan titik akhir (0,0)
    Garis(){
        titik1 = new Titik();
        titik2 = new Titik();
        CountGaris++;
    }
    // konstruktor untuk membuat garis dengan titik awal (x1,y1) dan titik akhir (x2,y2)
    Garis(double x1, double y1, double x2, double y2){
        titik1 = new Titik();
        titik2 = new Titik();
        titik1.setAbsis(x1);
        titik1.setOrdinat(y1);
        titik2.setAbsis(x2);
        titik2.setOrdinat(y2);
        CountGaris++;
    }
    /****************** Method ********************/
    // selektor untuk titik1
    Titik getTitik1() {
        return titik1;
    }
    // selektor untuk titik2
    Titik getTitik2() {
        return titik2;
    }
    //selektor untuk count garis
    static int getCountGaris() {
        return CountGaris;
    }
    // mutator untuk titik1
    void setTitik1(Titik t) {
        titik1 = t;
    }
    // mutator untuk titik2
    void setTitik2(Titik t) {
        titik2 = t;
    }
    // mendapatkan panjang garis
    double getPanjangGaris() {
        return titik1.getJarak(titik2);
    }

    // mendapatkan gradien garis
    double getGradien() {
        return (titik2.getOrdinat() - titik1.getOrdinat()) / (titik2.getAbsis() - titik1.getAbsis());
    }

    // mendapatkan titik tengah dari sebuah garis
    Titik getTitikTengah() {
        Titik titikTengah = new Titik();
        titikTengah.setAbsis((titik1.getAbsis() + titik2.getAbsis()) / 2);
        titikTengah.setOrdinat((titik1.getOrdinat() + titik2.getOrdinat()) / 2);
        return titikTengah;
    }

    // mengecek apakah dua garis sejajar
    boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // mengecek apakah dua garis tegak lurus
    boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    // mencetak garis
    void printGaris() {
        System.out.println("Titik awal: (" + titik1.getAbsis() + "," + titik1.getOrdinat() + ")");
        System.out.println("Titik akhir: (" + titik2.getAbsis() + "," + titik2.getOrdinat() + ")");
    }

    // menampilkan persamaan garis dalam bentuk y = mx + c
    void printPersamaanGaris() {
        double m = getGradien();
        double c = titik1.getOrdinat() - m * titik1.getAbsis();
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
}
