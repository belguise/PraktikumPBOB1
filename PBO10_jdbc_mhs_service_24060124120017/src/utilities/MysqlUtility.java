// Nama  : Lintang Aulia Nuraini
// NIM   : 24060124120017
 // Deskripsi : Kelas utility untuk mengelola koneksi
//            ke database MySQL.
 //
package utilities;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlUtility {

    private static Connection koneksi;

    public static Connection getConnection() {

        if (koneksi == null) {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");

                koneksi = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/jdbc_mhs_service",
                        "root",
                        "");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return koneksi;
    }
}