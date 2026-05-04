// Nama File: Dosen.java
// Pembuat: Lintang Aulia Nuraini-24060124120017
// Tanggal: 23 April 2026
// Deskripsi: Kelas Dosen sebagai turunan dari Civitasakademika

public class Dosenn extends Civitasakademika {

    // atribut untuk menyimpan NIP
    private String nip;

    // konstruktor tanpa parameter (opsional)
    public Dosenn() {
        super();
    }
    
    // konstruktor dengan parameter nama dan nip
    public Dosenn(String nama, String nip) {
        super(nama);      // inisialisasi nama di parent
        this.nip = nip;   // inisialisasi nip di class ini
    }

    // getter untuk NIP
    public String getNip() {
        return nip;
    }

    // override method abstract dari parent
    @Override
    public String getNomor() {
        return nip;       // untuk dosen, nomor = NIP
    }

    // setter untuk NIP
    public void setNip(String nip) {
        this.nip = nip;
    }
}