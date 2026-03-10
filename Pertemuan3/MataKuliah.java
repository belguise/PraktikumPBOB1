public class MataKuliah {
    /*************Atribut*****************/
    private String idMatkul;
    private String nama;
    private int sks;

    /*************Method******************/
    //konstruktor tanpa parameter
    public MataKuliah() {
        idMatkul = "";
        nama = "";
        sks = 0;
    }
    //konstruktor dengan parameter
    public MataKuliah (String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    //selektor untuk idMatkul
    public String getIdMatkul() {
        return idMatkul;
    }
    //selektor untuk nama
    public String getNama() {
        return nama;
    }
    //selektor untuk sks
    public int getSks() {
        return sks;
    }

    //mutator untuk idMatkul
    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }
    //mutator untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    //mutator untuk sks
    public void setSks(int sks) {
        this.sks = sks;
    }
}