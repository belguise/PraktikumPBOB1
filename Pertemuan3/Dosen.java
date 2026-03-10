//Nama : Lintang Aulia Nuraini
//NIM  : 24060124120017
//Kelas : PBO B2
//Tanggal : 04Maret 2026
//Deskripsi : Class Dosen




public class Dosen {
    //ATRIBUT 
    private String nip;
    private String nama;
    private String prodi;


// METHOD
//konstruktor untuk membuat mahasiswa tanpa paramater
public Dosen(){
    this.nip = " ";
    this.nama = " ";    
    this.prodi = " ";
}

//konstruktor dengan parameter nip, nama dan prodi
public Dosen (String nip, String nama, String prodi){
    this.nip=nip;
    this.nama=nama;
    this.prodi=prodi;
}

//selektor dan mutator berupa getter dan setter untuk atribut nip, nama dan prodi
public String getnip(){
    return nip;
}
public String getnama(){
    return nama;
}
public String getprodi(){
    return prodi;
}

public void setnip(String nip){
    this.nip=nip;

}
public void setnama(String nama){
    this.nama=nama;
}
public void setprodi(String prodi){
    this.prodi=prodi;    
} }
