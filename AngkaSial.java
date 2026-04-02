import Pertemuan6.AngkaSialException;

/**
 * File      : AngkaSial.java
 * NIM       : 24060124120017
 * Nama      : Lintang Aulia Nuraini
 * Deskripsi : Program penggunaan exception buatan sendiri
 * Pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial {
 
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
 
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
/*      
Jawaban Pertanyaan1. Ketika terjadi eksepsi, apakah baris 12 tetap dieksekusi?
Jawab:
Baris tersebut tetap dijalankan selama tidak terjadi exception, 
misalnya saat input angka 10. 
Namun ketika input 13, exception akan langsung dilempar sehingga baris tersebut tidak dieksekusi.
 Program kemudian berpindah ke blok catch, dan perintah setelah pemanggilan yang menyebabkan exception (termasuk angka 12) tidak dijalankan.

2. Apakah baris 21 pada AngkaSial.java dieksekusi?
Jawab:
Baris tersebut hanya akan dijalankan jika exception benar-benar terjadi, yaitu saat angka 13 dimasukkan.
 Jika tidak ada input yang memicu exception, maka bagian catch tersebut tidak akan dieksekusi sama sekali.

*/