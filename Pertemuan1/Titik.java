/* Nama File  : Titik.java
 * Deskripsi  : berisi atribut dan method dalam class Titik
 * Pembuat    : Lintang Aulia Nuraini/24060124120017
 * Tanggal    : Kamis, 19 Februari 2026
 */
//source code class titik ini diambil dari buku "Pemrograman Berbasis Objek dengan Java" edisi 2 karya I.K. Sutedja, dengan beberapa modifikasi untuk memenuhi kebutuhan praktikum.


public class Titik {
   double absis = (double)0.0F;
   double ordinat = (double)0.0F;
   static int counterTitik = 0;

   Titik() {
      ++counterTitik;
   }

   static int getCounterTitik() {
      return counterTitik;
   }

   double getAbsis() {
      return this.absis;
   }

   double getOrdinat() {
      return this.ordinat;
   }

   void setAbsis(double var1) {
      this.absis = var1;
   }

   void setOrdinat(double var1) {
      this.ordinat = var1;
   }

   void geser(double var1, double var3) {
      this.absis += var1;
      this.ordinat += var3;
   }

   void printTitik() {
      System.out.println("Titik (" + this.absis + "," + this.ordinat + ")");
   }

   int getKuadran() {
      if (this.absis > (double)0.0F && this.ordinat > (double)0.0F) {
         return 1;
      } else if (this.absis < (double)0.0F && this.ordinat > (double)0.0F) {
         return 2;
      } else if (this.absis < (double)0.0F && this.ordinat < (double)0.0F) {
         return 3;
      } else {
         return this.absis > (double)0.0F && this.ordinat < (double)0.0F ? 4 : 0;
      }
   }

   double getJarakPusat() {
      double var1 = Math.sqrt(Math.pow(this.absis, (double)2.0F) + Math.pow(this.ordinat, (double)2.0F));
      return var1;
   }

   double getJarak(Titik var1) {
      double var2 = Math.sqrt(Math.pow(this.absis - var1.absis, (double)2.0F) + Math.pow(this.ordinat - var1.ordinat, (double)2.0F));
      return var2;
   }

   void setRefleksiX() {
      this.ordinat = -this.ordinat;
   }

   void setRefleksiY() {
      this.absis = -this.absis;
   }

   Titik getRefleksiX() {
      Titik var1 = new Titik();
      var1.absis = this.absis;
      var1.ordinat = -this.ordinat;
      return var1;
   }

   Titik getRefleksiY() {
      Titik var1 = new Titik();
      var1.absis = -this.absis;
      var1.ordinat = this.ordinat;
      return var1;
   }
}
