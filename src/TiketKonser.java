abstract class TiketKonser implements HargaTiket {
 private String namaTiket; // Nama tiket konser
 private double harga; // Harga tiket konser

 /**
  * Konstruktor untuk membuat objek TiketKonser dengan nama dan harga tertentu.
  * namaTiket adalah Nama tiket konser
  * harga adalah Harga tiket konser
  */
 public TiketKonser(String namaTiket, double harga) {
  this.namaTiket = namaTiket;
  this.harga = harga;
 }

 /**
  * Metode untuk mendapatkan nama tiket konser.
  * @return Nama tiket konser
  */
 public String getNamaTiket() {
  return namaTiket;
 }

 /**
  * Metode untuk mendapatkan harga tiket konser.
  * @return Harga tiket konser
  */
 public double getHarga() {
  return harga;
 }
}