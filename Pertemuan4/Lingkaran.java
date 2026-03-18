
//Nama : Lintang Aulia Nuraini
//NIM  : 24060124120017
//Kelas : PBO B2
//Tanggal : 01 Maret 2026
public class Lingkaran extends BangunDatar {
    //Atribut
    private double jari;
    private static int counterLingkaran = 0;

    //Konstruktor lingkaran tanpa parameter
    public Lingkaran() {
        super();
        setJmlSisi(0);
        counterLingkaran++;
    }

    //Konstruktor lingkaran dengan parameter
    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
        counterLingkaran++;
    }
    
    //menampilkan jumlah objek lingkaran yang telah dibuat
    public static void printCounterLingkaran() {
    System.out.println("Jumlah Objek Lingkaran: " + counterLingkaran);
    }

    //Mengembalikan nilai jari jari suatu lingkaran
    public double getJari() {
        return jari;
    }

    //mengeset jari jari lingkaran dengan suatu nilai
    public void setJari(double jari) {
        this.jari = jari;
    }

    //mengembalikan nilai Luas lingkaran
    public double getLuas() {
        // Rumus: π * r^2
        return Math.PI * Math.pow(jari, 2);
    }

    //mengembalikan nilai keliling lingkaran
    public double getKeliling() {
        // Rumus: 2 * π * r
        return 2 * Math.PI * jari;
    }

    //menampilkan jari jari, luas dan keliling dari lingkaran
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}