
/* Nama File  : MTitik.java
 * Deskripsi  : berisi main class dalam class Titik
 * Pembuat    : Lintang Aulia Nuraini/24060124120017
 * Tanggal    : Kamis, 19 Februari 2026
 */
public class MainTitik {
    public static void main(String[] args) {

        // Titik pertama
        Titik A = new Titik();
        A.setAbsis(3);
        A.setOrdinat(5);

        System.out.println("== DATA TITIK A ==");
        A.printTitik();

        // Geser titik
        A.geser(3, 4);
        System.out.println("Setelah digeser:");
        A.printTitik();

        // Kuadran
        System.out.println("Posisi kuadran A: " + A.getKuadran());

        // Refleksi langsung (modify objek)
        A.setRefleksiX();
        System.out.println("Refleksi X (langsung):");
        A.printTitik();

        A.setRefleksiY();
        System.out.println("Refleksi Y (langsung):");
        A.printTitik();

        // Refleksi sebagai objek baru
        System.out.println("Refleksi X (objek baru):");
        Titik refX_A = A.getRefleksiX();
        refX_A.printTitik();

        System.out.println("Refleksi Y (objek baru):");
        Titik refY_A = A.getRefleksiY();
        refY_A.printTitik();

        // Hitung jarak ke titik lain
        Titik Bantu1 = new Titik(5, 6);
        double d1 = A.getJarak(Bantu1);
        System.out.println("Jarak A ke (5,6): " + d1);

        System.out.println("Jarak A ke pusat: " + A.getJarakPusat());

        // Titik kedua
        System.out.println("\n== DATA TITIK B ==");
        Titik B = new Titik(4, 4);
        B.printTitik();

        // Geser
        B.geser(3, 4);
        System.out.println("Setelah digeser:");
        B.printTitik();

        // Kuadran
        System.out.println("Kuadran B: " + B.getKuadran());

        // Refleksi
        B.setRefleksiX();
        System.out.println("Refleksi X:");
        B.printTitik();

        B.setRefleksiY();
        System.out.println("Refleksi Y:");
        B.printTitik();

        // Jarak
        Titik Bantu2 = new Titik();
        Bantu2.setAbsis(5);
        Bantu2.setOrdinat(6);

        double d2 = B.getJarak(Bantu2);
        System.out.println("Jarak B ke (5,6): " + d2);

        System.out.println("Jarak B ke pusat: " + B.getJarakPusat());

        // Refleksi objek baru
        System.out.println("Refleksi baru X dari B:");
        B.getRefleksiX().printTitik();

        System.out.println("Refleksi baru Y dari B:");
        B.getRefleksiY().printTitik();

        // Total objek
        System.out.println("\nTotal objek Titik: " + Titik.getCounterTitik());
    }
}
