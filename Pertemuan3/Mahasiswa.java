//Nama : Lintang Aulia Nuraini
//NIM  : 24060124120017
//Kelas : PBO B2
//Tanggal : 04Maret 2026


import java.util.ArrayList;

public class Mahasiswa {
    /***********************Atribut*********************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /***********************Method*********************/
    
    //konstruktor untuk membuat objek mahasiswa tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
    }
    //konstruktor untuk membuat objek mahasiswa dengan parameter nim, nama, prodi, dan dosen wali
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }



    //selektor untuk nim
    public String getNim() {
        return nim;
    }

    //selektor untuk Nama
    public String getNama() {
        return nama;
    }

    //selektor untuk Prodi
    public String getProdi() {
        return prodi;
    }
    //selektor untuk kendaraan
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    //selektor untuk list mata kuliah    public ArrayList<MataKuliah> getListMatkul() {
    public ArrayList<MataKuliah> getListMatkul() {
        return listMatkul;
    }

    //selektor untuk dosen wali
    public Dosen getDosenWali() {
        return dosenWali;
    }

    // Mutator untuk nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Mutator untuk Nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mutator untuk Prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Mutatoruntuk dosen wali
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }
    // Mutator untuk kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    //menambahkan mata kuliah ke dalam list mata kuliah mahasiswa
    public void addMatkul(MataKuliah newMatkul) {
        this.listMatkul.add(newMatkul);
    }

    // mendapatkan jumlah SKS yang diambil mahasiswa
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < listMatkul.size(); i++) {
            totalSKS += listMatkul.get(i).getSks();
        }
        return totalSKS;
    }

    // mendapatkan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatkul() {
        return  listMatkul.size();
    }

    // menampilkan Mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("prodi: " + prodi);
    }

    //method untuk menampilkan detail mahasiswa
    public void printDetailMhs() {
        System.out.println("\nMahasiswa:");
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        System.out.println("\nDaftar Mata Kuliah:");
        for(i=0; i < listMatkul.size(); i++) {
            System.out.println((i+1) + ". " + listMatkul.get(i).getNama() + " (" + listMatkul.get(i).getSks() + " SKS)");
        }
        System.out.println("\nDosen Wali:");
        if (dosenWali != null){
            System.out.println("Nama: " + dosenWali.getNama());
            System.out.println("NIP: " + dosenWali.getNip());
            System.out.println("Prodi: " + dosenWali.getProdi());
        }
        else {
            System.out.println("belum punya dosen wali.");
        }
        System.out.println("\nKendaraan:");
        if (kendaraan != null) {
            System.out.println("jenis kendaraan: " + kendaraan.getJenis());
            System.out.println("No plat: " + kendaraan.getNoPlat());
        }
        else {
            System.out.println("tidak menggunakan motor atau mobil");
        }
    }
    

}