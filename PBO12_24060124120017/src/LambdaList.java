import java.util.ArrayList;

/**
 * File: LambdaList.java
 * Nama: LINTANG AULIA NURAINI - 24060124120017
 * Deskripsi: Implementasi lambda pada List, digunakan sebagai parameter
 *            pada method forEach() untuk mencetak nama-nama mahasiswa dalam ArrayList.
 */
public class LambdaList { // lambda digunakan untuk mencetak nama-nama mahasiswa dalam ArrayList

    public static void main(String[] args) { // lambda digunakan untuk mencetak nama-nama mahasiswa dalam ArrayList

        ArrayList<String> mahasiswaList = new ArrayList<>();

        mahasiswaList.add("lintang");
        mahasiswaList.add("sela");
        mahasiswaList.add("hanskuy");
        mahasiswaList.add("tiwai");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}