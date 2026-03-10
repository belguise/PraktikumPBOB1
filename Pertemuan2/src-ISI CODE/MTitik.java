
/* Nama File  : MTitik.java
 * Deskripsi  : berisi main class dalam class Titik
 * Pembuat    : Lintang Aulia Nuraini/24060124120017
 * Tanggal    : Kamis, 19 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {

        Titik T1 = new Titik();   // membuat objek titik T1 (0,0)
        
        T1.setAbsis(3);           // mengubah absis jadi 3
        T1.setOrdinat(4);         // mengubah ordinat jadi 4
        T1.printTitik();          // tampilkan koordinat
        T1.geser(3, 4);           // geser sejauh (3,4)
        T1.printTitik();          // tampilkan setelah digeser
    
        Titik T2 =T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();
    
        T1 = new Titik(); //membuat objek titik T1 (0,0)
        T2 = new Titik(3,5); // membuat objek titik T2 (3,5)

        System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah objek titik = " + T2.getCounterTitik());
    
}
}

