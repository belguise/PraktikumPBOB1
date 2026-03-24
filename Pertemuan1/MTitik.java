
/* Nama File  : MTitik.java
 * Deskripsi  : berisi main class dalam class Titik
 * Pembuat    : Lintang Aulia Nuraini/24060124120017
 * Tanggal    : Kamis, 19 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        // Membuat objek titik T1 (0,0)
        Titik T1 = new Titik(); 
        
        // Mengubah absis T1 dengan nilai 3
        T1.setAbsis(3); 
        
        // Mengubah ordinat T1 dengan nilai 5
        T1.setOrdinat(5); 
        
        // Mencetak koordinat T1 ke layar
        System.out.println("Koordinat T1: ");
        T1.printTitik(); 
        
        // Menggeser T1 sejauh (3,4)
        System.out.println("Menggeser T1 sejauh (3,4)");
        T1.geser(3, 4); 
        
        // Menampilkan koordinat T1 setelah digeser
        T1.printTitik();

        // Menampilkan kuadran T1 setelah digeser
        System.out.println("Kuadran T1: " + T1.getKuadran());


        // setRefleksiX untuk T1
        System.out.println("Refleksi terhadap sumbu X untuk T1: ");
        T1.setRefleksiX();

        // Menampilkan koordinat T1 setelah direfleksikan terhadap sumbu X
        T1.printTitik();

        // setRefleksiY untuk T1
        System.out.println("Refleksi terhadap sumbu Y untuk T1: ");
        T1.setRefleksiY();

        // Menampilkan koordinat T1 setelah direfleksikan terhadap sumbu Y
        T1.printTitik();

        // menampilkan getsRefleksiX untuk T1
        System.out.println("Refleksi objek baru sumbu X T1:");
        T1.getRefleksiX().printTitik();

        // menampilkan getsRefleksiY untuk T1
        System.out.println("Refleksi objek baru sumbu Y T1:");
        T1.getRefleksiY().printTitik();

        // Jarak untuk T1 ke titik lain (5,6)
        Titik T_lain = new Titik();
        T_lain.setAbsis(5);
        T_lain.setOrdinat(6);
        double jarak = T1.getJarak(T_lain);
        System.out.println("Jarak antara T1 dan T_lain(5,6): " + jarak);
        
        // Menampilkan jarakpusat T1 ke titik pusat (0,0)
        double jarakPusat = T1.getJarakPusat();
        System.out.println("Jarak T1 ke titik pusat (0,0): " + jarakPusat);

        // Menampilkan jumlah objek Titik yang telah dibuat
        System.out.println("Jumlah objek Titik yang telah dibuat: " + Titik.getCounterTitik());

        // Membuat objek titik T1 (0,0)
        Titik T2 = new Titik(); 
        
        // Mengubah absis T2 dengan nilai 4
        T2.setAbsis(4); 
        
        // Mengubah ordinat T2 dengan nilai 4
        T2.setOrdinat(4); 
        
        // Mencetak koordinat T2 ke layar
        System.out.println("Koordinat T2: ");
        T2.printTitik(); 
        
        // Menggeser T2 sejauh (3,4)
        System.out.println("Menggeser T2 sejauh (3,4)");
        T2.geser(3, 4); 
        
        // Menampilkan koordinat T2 setelah digeser
        T2.printTitik();

        // Menampilkan kuadran T2 setelah digeser
        System.out.println("Kuadran T2: " + T2.getKuadran());

        // setRefleksiX untuk T2
        System.out.println("Refleksi terhadap sumbu X untuk T2: ");
        T2.setRefleksiX();

        // Menampilkan koordinat T2 setelah direfleksikan terhadap sumbu X
        T2.printTitik();

        // setRefleksiY untuk T2
        System.out.println("Refleksi terhadap sumbu Y untuk T2: ");
        T2.setRefleksiY();

        // Menampilkan koordinat T2 setelah direfleksikan terhadap sumbu Y
        T2.printTitik();

        // Jarak untuk T2 ke titik lain (5,6)
        Titik T3 = new Titik();
        T3.setAbsis(5);
        T3.setOrdinat(6);
        double jarak2 = T2.getJarak(T3);
        System.out.println("Jarak antara T2 dan T3(5,6): " + jarak2);
        
        // Menampilkan jarakpusat T2 ke titik pusat (0,0)
        double jarakPusat2 = T2.getJarakPusat();
        System.out.println("Jarak T2 ke titik pusat (0,0): " + jarakPusat2);

        // mengembalikan getsRefleksiX untuk T2
        System.out.println("Refleksi objek baru sumbu X T2:");
        T2.getRefleksiX().printTitik();

        // mengembalikan getsRefleksiY untuk T2
        System.out.println("Refleksi objek baru sumbu Y T2:");
        T2.getRefleksiY().printTitik();

    
        // menghitung jumlah objek Titik yang telah dibuat
        System.out.println("Jumlah objek Titik yang telah dibuat: " + Titik.getCounterTitik());
    }
}