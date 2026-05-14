// Nama File: Teman.java
// Pembuat: Lintang Aulia Nuraini - 24060124120017
// Tanggal: 6 Mei 2026
// Deskripsi: Kelas untuk mengelola koleksi nama teman menggunakan List


import java.util.ArrayList; //ini library untuk menggunakan ArrayList dari java 

public class Teman {

    private int nbelm; //nbelm untuk menyimpan jumlah teman yang ada
    private ArrayList<String> Lnama; //Lnama untuk menyimpan nama teman dalam bentuk ArrayList

    // konstruktor
    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return Lnama.size();
    }

    public String getNama(int i) {
        return Lnama.get(i);
    }

    public void setNama(int i, String nama) {
        Lnama.set(i, nama);
    }

    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String lama, String baru) {
        int idx = Lnama.indexOf(lama);
        if (idx != -1) {
            Lnama.set(idx, baru);
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) { //iterasi untuk menghitung berapa kali nama tertentu muncul dalam daftar teman
            if (n.equals(nama)) count++; //equeals untuk membandingkan isi string, bukan alamat memori seperti ==  
        }
        return count;
    }

    public void showTeman() {
        for (String n : Lnama) { //iterasi untuk menampilkan semua nama teman yang ada dalam daftar
            System.out.println(n);
        }
    }
}

/// RENUNGAN
//
// Berdasarkan praktikum yang telah dilakukan, dapat disimpulkan bahwa
// konsep koleksi pada Java digunakan untuk menyimpan dan mengelola
// sekumpulan data secara lebih fleksibel dan efisien dibandingkan
// array biasa. Dengan menggunakan ArrayList dan LinkedList, proses
// penambahan, penghapusan, pencarian, dan penampilan data menjadi
// lebih mudah dilakukan.
//
// Praktikum ini juga membantu memahami penerapan konsep Object
// Oriented Programming seperti inheritance, polymorphism, dan
// encapsulation pada Collection Framework Java. Selain itu,
// pemilihan struktur data yang sesuai sangat berpengaruh terhadap
// kebutuhan dan efisiensi program yang dibuat.