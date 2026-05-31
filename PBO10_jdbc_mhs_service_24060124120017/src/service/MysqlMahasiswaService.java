//
 // Nama  : Lintang Aulia Nuraini
 // NIM   : 24060124120017
 // Deskripsi : Kelas service yang menyediakan operasi
 //             CRUD pada tabel mahasiswa menggunakan JDBC.
 //
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Mahasiswa;
import utilities.MysqlUtility;

public class MysqlMahasiswaService {

    private Connection koneksi;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    public void add(Mahasiswa m) {

        try {

            String sql =
                    "INSERT INTO mahasiswa(id,nama) VALUES(?,?)";

            PreparedStatement ps =
                    koneksi.prepareStatement(sql);

            ps.setInt(1, m.getId());
            ps.setString(2, m.getNama());

            ps.executeUpdate();

            System.out.println("Data berhasil ditambah");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void tampilkanSemua() {

        try {

            String sql = "SELECT * FROM mahasiswa";

            PreparedStatement ps =
                    koneksi.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                        rs.getInt("id")
                        + " "
                        + rs.getString("nama")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}