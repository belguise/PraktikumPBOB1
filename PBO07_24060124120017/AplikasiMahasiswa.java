// Nama File: AplikasiMahasiswa.java
// Pembuat: Lintang Aulia Nuraini
// Tanggal:         23 April 2026
// Deskripsi: Program utama untuk menguji polimorfisme Ad Hoc Overloading

public class AplikasiMahasiswa {
    public static void main(String[] args) {

        // KONTRUKTOR
        System.out.println(" Konstruktor tanpa parameter ");
        Mahasiswaa mhs1 = new Mahasiswaa();
        mhs1.tampilData();
        System.out.println();

        System.out.println(" Konstruktor dengan 3 parameter");
        Mahasiswaa mhs2 = new Mahasiswaa(24120017, "Lintang Auliaaa", "Informatika");
        mhs2.tampilData();
        System.out.println();

        System.out.println(" Konstruktor cloning ");
        Mahasiswaa mhs3 = new Mahasiswaa(mhs2);
        mhs3.tampilData();
        System.out.println();


        // SETTER
        System.out.println(" Uji Setter ");
        mhs1.setNama("Biyy");
        mhs1.setNIM(24120002);
        mhs1.setProgramstudi("Teknik Ancaman");
        mhs1.tampilData();
        System.out.println();


        // GETTER
        System.out.println(" Uji Getter (data mhs3) ");
        System.out.println("Nama : " + mhs3.getNama());
        System.out.println("NIM  : " + mhs3.getNIM());
        System.out.println("Prodi: " + mhs3.getProgramstudi());
        System.out.println();


        // OVERLOADING
        System.out.println("Overloading: tanpa parameter ");
        mhs1.setProgramstudi(); 
        // akan mengisi "Kosong"
        mhs1.tampilData();
        System.out.println();

        System.out.println(" Overloading: parameter String ");
        mhs1.setProgramstudi("Biologi"); 
        // isi sesuai parameter
        mhs1.tampilData();
        System.out.println();

        System.out.println(" Overloading: parameter objek Mahasiswa");
        mhs1.setProgramstudi(mhs2); 
        // mengambil prodi dari mhs2
        mhs1.tampilData();
    }
}