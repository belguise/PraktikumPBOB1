// Nama File: AdHocCoersion.java
// Pembuat: Lintang Aulia Nuraini
// Tanggal: 23 April 2026
// Deskripsi: program ini merepresentasikan polimorfisme  Ad Hoc coercion (nomor 1)

public class AdHocCoersion {
    public static void main(String[] args) { //
        //a. Mengilustrasikan konsep polimorfisme coercion
        int nilaiInteger = 65; 
        char nilaiChar = (char) nilaiInteger;
        double nilaiReal = (double) nilaiInteger;
        System.out.println("Nilai Integer : " + nilaiInteger);
        System.out.println("Nilai Char : " + nilaiChar);
        System.out.println("Nilai Double : " + nilaiReal);
        System.out.println();

        //b. Nilai integer diubah menjadi real, selanjutnya dikembalikan ke format integer
        int angkaInt = 75;
        double angkaDouble = (double) angkaInt;
        Integer kembaliInt = (int) angkaDouble;
        System.out.println("Angka awal integer: " + angkaInt);
        System.out.println("Angka hasil setelah diubah ke real : " + angkaDouble);
        System.out.println("Kembali Ke Angka Integer awal : " + kembaliInt);
        System.out.println();

        //c. Objek string X dan Y, objek String S hasil konkat, objek Integer Z hasil penjumlahan
        String X = "1234";
        String Y = "5678";
        String S = X + Y; // konkatenasi X + Y
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y); // penjumlahan X + Y dengan ubah dulu ke integer
        System.out.println("String S (konkatenasi X & Y): " + S);
        System.out.println("Integer Z (penjumlahan X & Y): " + Z);
        System.out.println();

        //d. Objek string P dan Q, objek String R hasil konkat, objek Double D hasil penjumlahan
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q; // konkatenasi P + Q
        Double D = Double.parseDouble(P) + Double.parseDouble(Q); // // penjumlahan P + Q setelah dikonversi ke double
        System.out.println("String R (konkatenasi P & Q): " + R);
        System.out.println("Double D (penjumlahan P & Q): " + D);
        System.out.println();

        //e. Objek integer A diisi hasil konversi S, dan ditampilkan
        Integer A = Integer.parseInt(S);
        System.out.println("integer A adalahhasil konversi S: " + A);
        System.out.println();

        //f. Objek String T diisi hasil konversi nilai A, lalu baruuu ditampilkan
        String T = A.toString(); // konversi nilai A ke String
        System.out.println("String T adalah hasil konversi A: " + T); // menampilkan nilai T nyah
    }
}