
//Nama : Lintang Aulia Nuraini
//NIM  : 24060124120017
// Deskripsi : Class Lingkaran dengan fitur resize lengkap
// Pembuat   : Lintang Aulia
// Tanggal   : 18 Maret 2026

public class Lingkaran extends BangunDatar implements IResize {
    
    // Atribut
    private double jari;

    // Konstruktor
    public Lingkaran(double jari) {
        this.jari = jari;
    }

    // Getter
    public double getJari() {
        return jari;
    }

    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void zoomIn() {
        jari *= 1.1;
    }

    @Override
    public void zoomOut() {
        jari *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari *= (percent / 100.0);
    }
}