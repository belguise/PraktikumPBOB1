// Nama File : IResize.java
// Deskripsi : Interface untuk fitur resize

public interface IResize {

    void zoomIn(); 
    // memperbesar ukuran (default 10%)

    void zoomOut(); 
    // memperkecil ukuran (default 10%)

    void zoom(int percent); 
    // fleksibel: resize sesuai persen (contoh: 200 = 2x)
}