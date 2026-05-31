//
// Nama  : Lintang Aulia Nuraini
// NIM   : 24060124120017
// Deskripsi : Program utama untuk menguji operasi CRUD
//             pada tabel mahasiswa.


package program;

import model.Mahasiswa;
import service.MysqlMahasiswaService;

public class Program {

    public static void main(String[] args) {

        MysqlMahasiswaService service =
                new MysqlMahasiswaService();

        Mahasiswa m1 =
                new Mahasiswa(1, "Lintang");

        service.add(m1);

        System.out.println("Data Mahasiswa:");

        service.tampilkanSemua();
    }
}