//Nama : Lintang Aulia Nuraini
//NIM  : 24060124120017
//Kelas : PBO B2
//Tanggal : 18 Maret 2026


public class Persegi extends BangunDatar implements IResize {
    // extends = pewarisan dari BangunDatar
    // implements = wajib implement method dari interface

    private double sisi; // atribut khusus persegi

    public Persegi(double sisi){
        this.sisi = sisi; // this.sisi = atribut class
    }
    public double getSisi() {
        return sisi;
    } // getter untuk sisi

    @Override
    public double getLuas(){
        return sisi * sisi; // rumus luas persegi
    }

    @Override
    public double getKeliling(){
        return 4 * sisi; // rumus keliling
    }

    @Override
    public void zoomIn(){
        sisi *= 1.1; 
        // dikali 1.1 = tambah 10%
    }

    @Override
    public void zoomOut(){
        sisi *= 0.9;
        // dikali 0.9 = kurang 10%
    }

    @Override
    public void zoom(int percent){
        sisi *= (percent / 100.0);
        // contoh:
        // 200 → 2x
        // 50 → setengah
    }
}