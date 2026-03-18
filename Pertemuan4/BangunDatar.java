//Nama : Lintang Aulia Nuraini
//NIM  : 24060124120017
//Kelas : PBO B2
//Tanggal : 01 Maret 2026

public class BangunDatar {
    //Atribut
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    //konstruktor tanpa parameter
    public BangunDatar() {
        counterBangunDatar++;
    }

    //konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    //menampilkan jumlah objek bangun datar yang telah dibuat
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar); 
    }

    //mengembalikan jumlah sisi dari bangun datar
    public int getJmlSisi() {
        return jmlSisi;
    }

    //mengeset jumlah sisi bangun datar
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    //mengembalikan warna suatu bangun
    public String getWarna() {
        return warna;
    }

    //mengeset warna suatu bangun
    public void setWarna(String warna) {
        this.warna = warna;
    }

    //mengembalikan border dari suatu bangun
    public String getBorder() {
        return border;
    }

    //mengeset border dari suatu bangun
    public void setBorder(String border) {
        this.border = border;
    }

    //menampilkan jumlah sisi, warna dan border dari suatu bangun
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}