// Nama File: AplikasiSeminar.java
// Pembuat: Lintang Aulia Nuraini - 24060124120017
// Tanggal: 23 April 2026
// Deskripsi: Program utama untuk menguji sistem Seminar (polimorfisme inclusion)

public class AplikasiSeminar {
    public static void main(String[] args) {

        // membuat 2 objek dosen
        Dosenn dosen1 = new Dosenn("Pak Arif", "NIP001");
        Dosenn dosen2 = new Dosenn("Bu Lintang", "NIP002");

        // membuat 5 objek mahasiswa
        MahasiswaNo4 mahasiswa1 = new MahasiswaNo4("Aulia", "NIM001");
        MahasiswaNo4 mahasiswa2 = new MahasiswaNo4("Biyyyy", "NIM002");
        MahasiswaNo4 mahasiswa3 = new MahasiswaNo4("Rafi", "NIM003");
        MahasiswaNo4 mahasiswa4 = new MahasiswaNo4("Alya", "NIM004");
        MahasiswaNo4 mahasiswa5 = new MahasiswaNo4("Bagas", "NIM005");

        // membuat objek seminar
        Seminar seminar1 = new Seminar();

        System.out.println("Registrasi peserta");

        // registrasi peserta (harus kontigu)
        seminar1.registrasi(dosen1);
        seminar1.registrasi(dosen2);
        seminar1.registrasi(mahasiswa1);
        seminar1.registrasi(mahasiswa2);
        seminar1.registrasi(mahasiswa3);
        seminar1.registrasi(mahasiswa4);
        seminar1.registrasi(mahasiswa5);

        // menampilkan jumlah peserta
        System.out.println("Jumlah peserta yang datang seminar: " + seminar1.countPeserta());

        // menampilkan daftar peserta
        System.out.println("Daftar peserta pada seminar:");
        seminar1.tampilPeserta();

        // menghitung jumlah mahasiswa
        System.out.println("Jumlah peserta khusus mahasiswa: " + seminar1.countMahasiswa());

        // set dosen wali (sesuai diktat: objek Dosen)
        mahasiswa1.setWali(dosen1);
        mahasiswa2.setWali(dosen1);
        mahasiswa3.setWali(dosen2);
        mahasiswa4.setWali(dosen2);
        mahasiswa5.setWali(dosen1);

        System.out.println("Data mahasiswa dan dosen wali:");

        // tampilkan data mahasiswa
        mahasiswa1.tampilDataMahasiswa();
        mahasiswa2.tampilDataMahasiswa();
        mahasiswa3.tampilDataMahasiswa();
        mahasiswa4.tampilDataMahasiswa();
        mahasiswa5.tampilDataMahasiswa();
    }
}