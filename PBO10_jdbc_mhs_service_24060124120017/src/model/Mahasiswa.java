// nama : lintang aulia nuraini
// nim : 24060124120017
// deskripsi : Deskripsi : Persistent Object (POJO) yang merepresentasikan tabel mahasiswa pada database.
package model;
public class Mahasiswa {

    private int id;
    private String nama;

    public Mahasiswa() {
    }

    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}