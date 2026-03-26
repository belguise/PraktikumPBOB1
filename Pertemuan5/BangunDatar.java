//Nama : Lintang Aulia Nuraini
//NIM  : 24060124120017
//Kelas : PBO B2
//Tanggal : 18 Maret 2026

public abstract class BangunDatar {
    protected String warna;
    protected String border;

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}