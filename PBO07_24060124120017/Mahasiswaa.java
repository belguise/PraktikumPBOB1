// Nama File: Mahasiswa.java
// Pembuat: Lintang Aulia Nuraini-24060124120017
// Tanggal: 23 April 2026
// Deskripsi: Kelas Mahasiswa untuk implementasi polimorfisme Ad Hoc (Overloading)

public class Mahasiswaa {

    // atribut
    private int nim;
    private String nama;
    private String programStudi;

    // konstruktor default
    public Mahasiswaa() {
        this.nim = -999;
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    // konstruktor dengan parameter
    public Mahasiswaa(int nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // konstruktor cloning
    public Mahasiswaa(Mahasiswaa m) {
        this.nim = m.nim;
        this.nama = m.nama;
        this.programStudi = m.programStudi;
    }

    // getter
    public int getNIM() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProgramstudi() {
        return programStudi;
    }

    // setter
    public void setNIM(int nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // overloading tanpa parameter
    public void setProgramstudi() {
        this.programStudi = "Kosong";
    }

    // overloading dengan parameter string
    public void setProgramstudi(String programStudi) {
        this.programStudi = programStudi;
    }

    // overloading dengan parameter objek Mahasiswa
    public void setProgramstudi(Mahasiswaa m) {
        this.programStudi = m.programStudi;
    }

    // menampilkan data mahasiswa
    public void tampilData() {
        System.out.println("Data Mahasiswa");
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + programStudi);
    }
}