//Nama : Lintang Aulia Nuraini
//NIM  : 24060124120017
//Kelas : PBO B2
//Tanggal : 01 Maret 2026
public class Persegi extends BangunDatar {
    // Atribut
    private double sisi;
    private static int counterPersegi = 0;

    //Konstruktor tanpa parameter
    public Persegi() {
        super();
        setJmlSisi(4);
        counterPersegi++;
    }

    //Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
        counterPersegi++;
    }

    //menampilkan objek persegi yang dibuat
    public static void printCounterPersegi() {
    System.out.println("Jumlah Objek Persegi: " + counterPersegi);
    }

    //mengembalikan nilai sisi dari persegi
    public double getSisi() {
        return sisi;
    }

    //mengeset sisi persegi dengan suatu nilai
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    //mengembalikan nilai luas persegi
    public double getLuas() {
        return sisi * sisi;
    }

    //mengembalikan nilai keliling persegi
    public double getKeliling() {
        return 4 * sisi;
    }

    //mengembalikan nilai diagonal persegi
    public double getDiagonal() {
        // Menggunakan rumus Pythagoras: s * akar(2)
        return sisi * Math.sqrt(2);
    }

    //menampilkan sisi, luas, keliling dan diagonal dari suatu persegi
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Diagonal: " + getDiagonal());
    }
}