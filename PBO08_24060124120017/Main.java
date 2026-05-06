package PBO08_24060124120017;

// Nama File: Main.java
// Pembuat: Lintang Aulia Nuraini - 24060124120017
// Tanggal: 6 Mei 2026
// Deskripsi: Program utama untuk menguji generik

public class Main {
    public static void main(String[] args) {

        System.out.println(" Datum ");

        Datum<Integer> I = new Datum<>(42);
        System.out.println(I.getIsi());
        I.setIsi(100);
        System.out.println(I.getIsi());

        Datum<Kucing> A = new Datum<>();
        A.setIsi(new Kucing("Cimi", 5.0));
        System.out.println("Nama: " + A.getIsi().getNama() + " Bobot: " + A.getIsi().getBobot());

        System.out.println("\n Operasi Generik ");

        Datum<Integer> a = new Datum<>(3);
        Datum<Integer> b = new Datum<>(6);

        System.out.println("Sebelum: " + a.getIsi() + ", " + b.getIsi());
        OperasiGenerik.tukar(a, b);
        System.out.println("Sesudah: " + a.getIsi() + ", " + b.getIsi());

        Anggora k1 = new Anggora("Cimol", 4.0);
        Kembangtelon k2 = new Kembangtelon("Cilor", 3.5);

        System.out.println("Total bobot: " + OperasiGenerik.bobot2(k1, k2));

        System.out.println("\n Larik Generik ");

        Data<Anabul> data = new Data<>();
        data.setIsi(1, new Anjing("Tirex"));
        data.setIsi(2, new Kucing("Cimi"));
        data.setIsi(3, new Burung("Copet"));

        for (int i = 1; i <= data.getSize(); i++) {
            System.out.println(i + ". " + data.getIsi(i).getNama());
            data.getIsi(i).gerak();
            data.getIsi(i).bersuara();
        }
    }
}

// Kesimpulan:
// Generik memungkinkan pembuatan class dan method yang dapat digunakan untuk berbagai tipe data.
// Dengan generik, program menjadi lebih fleksibel dan dapat digunakan kembali.
// Selain itu, kesalahan tipe data dapat dideteksi saat compile time sehingga lebih aman.
// Penggunaan generik juga membantu membuat kode lebih umum dan efisien.