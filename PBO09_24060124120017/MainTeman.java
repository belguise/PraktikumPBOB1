

// Nama File : MainTeman.java
// Nama      : Lintang Aulia Nuraini
// NIM       : 24060124120017
// Tanggal   : 06 Mei 2026
// Deskripsi : Main untuk run program teman (driver main)
public class MainTeman {

    public static void main(String[] args) {

        Teman t = new Teman();

        t.addNama("Lintang CANTIK BGT BAIK CERDAS JENIUS MAUCHHHHH");
        t.addNama("TIWI TOLONG DIINIIIN ITUNYA APASIH");
        t.addNama("Hana HEHEHHEH ITUNYA HAN ANUU");
        t.addNama("SELA NAKAL BANGET YAALLAH TOLONG");

        // Menampilkan daftar teman
        t.showTeman();

        // Menghitung jumlah nama tertentu
        System.out.println(
            "Jumlah Lintang: " +
            t.countNama("Lintang CANTIK BGT BAIK CERDAS JENIUS MAUCHHHHH")
        );

        // Mengganti nama Hana menjadi Aulia
        t.gantiNama(
            "Hana HEHEHHEH ITUNYA HAN ANUU",
            "Aulia SI PALING BAIK DAN TIDAK ANEH"
        );

        // Menampilkan hasil setelah diganti
        System.out.println("\nSetelah ganti nama:");
        t.showTeman();
    }
}