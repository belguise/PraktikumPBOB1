// Nama File: MahasiswaNo4.java
// Pembuat: Lintang Aulia Nuraini-24060124120017
// Tanggal: 23 April 2026
// Deskripsi: Kelas Mahasiswa sebagai turunan dari Civitasakademika

public class MahasiswaNo4 extends Civitasakademika {

    // atribut
    private String nim;
    private Dosenn dosenWali;

    // konstruktor tanpa parameter
    public MahasiswaNo4() {
        super();
    }
    // konstruktor dengan parameter
    public MahasiswaNo4(String nama, String nim) {
        super(nama);
        this.nim = nim;
        this.dosenWali = null; // belum ada wali
    }

    // getter nim
    public String getNim() {
        return nim;
    }

    // override method abstract
    @Override
    public String getNomor() {
        return nim;
    }

    // getter dosen wali
    public Dosenn getDosenWali() {
        return dosenWali;
    }

    // setter nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    // set dosen wali (sesuai soal: objek Dosen)
    public void setWali(Dosenn d) {
        this.dosenWali = d;
    }

    // menampilkan data mahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + getNama());

        if (dosenWali != null) {
            System.out.println("Dosen Wali : " + dosenWali.getNama());
        } else {
            System.out.println("Dosen Wali : belum ditentukan");
        }
    }
}