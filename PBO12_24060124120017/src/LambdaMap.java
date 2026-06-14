import java.util.HashMap;
import java.util.Map;

/**
 * File: LambdaMap.java
 * Nama: LINTANG AULIA NURAINI - 24060124120017
 * Deskripsi: Implementasi lambda pada Map untuk menampilkan
 *            NIM dan nama mahasiswa.
 */
public class LambdaMap { // Lambda digunakan untuk menampilkan key dan value pada Map

    public static void main(String[] args) { // Lambda digunakan untuk menampilkan key dan value pada Map

        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("230001001", "lintang");
        mahasiswaMap.put("230001002", "sela");
        mahasiswaMap.put("230001003", "hanskuy");
        mahasiswaMap.put("230001004", "tiwai");

        // Lambda digunakan untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) ->
                System.out.println("NIM : " + nim +
                                   ", Nama : " + nama));
    }
}