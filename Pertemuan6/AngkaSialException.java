package Pertemuan6;

// File      : AngkaSialException.java
 // Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
// Pembuat = Lintang Aulia Nuraini
// NIM = 24060124120017\
public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan masukkan angka 13 karena angka sial !!!");
    }
}