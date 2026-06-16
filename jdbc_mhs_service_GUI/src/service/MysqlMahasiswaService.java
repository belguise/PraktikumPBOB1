//
 // Nama  : Lintang Aulia Nuraini
 // NIM   : 24060124120017
 // Deskripsi : Kelas service yang menyediakan operasi
 //             CRUD pada tabel mahasiswa menggunakan JDBC.
 //package service;
package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Mahasiswa;
import utilities.MysqlUtility;

public class MysqlMahasiswaService {

    // Koneksi utama memanfaatkan utility yang sudah kamu buat
    private Connection koneksi = MysqlUtility.getConnection();

    // 1. READ: Mengambil semua data mahasiswa [cite: 45]
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        
        try {
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                listMhs.add(mhs);
            }
        } catch (Exception e) {
            System.out.println("Gagal getAll: " + e.getMessage());
        }
        return listMhs;
    }
    
    // 2. CREATE: Menambahkan data mahasiswa baru ke database 
    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa (nama) VALUES ('" + mhs.getNama() + "')";
        try {
            Statement st = koneksi.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Gagal add: " + e.getMessage());
        }
    }

    // 3. UPDATE: Mengubah data nama mahasiswa berdasarkan ID [cite: 41]
    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama = '" + mhs.getNama() + "' WHERE id = " + mhs.getId();
        try {
            Statement st = koneksi.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }

    // 4. DELETE: Menghapus data mahasiswa berdasarkan ID [cite: 43]
    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = " + id;
        try {
            Statement st = koneksi.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Gagal delete: " + e.getMessage());
        }
    }
    
    // 5. RESET: Mengembalikan autoincrement tabel ke awal [cite: 46]
    public void indexReset() {
        String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try {
            Statement st = koneksi.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Gagal reset indeks: " + e.getMessage());
        }
    }
}