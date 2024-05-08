class PemesananTiket {
 private TiketKonser tiket; // Objek tiket yang dipesan
 private String namaPemesan; // Nama pemesan tiket

 /**
  * Konstruktor untuk membuat objek PemesananTiket.
  * namaPemesan adalah Nama pemesan tiket
  * tiket adalah Objek tiket yang dipesan
  */
 public PemesananTiket(String namaPemesan, TiketKonser tiket) {
  this.tiket = tiket;
  this.namaPemesan = namaPemesan;
 }

 /**
  * Metode untuk menampilkan detail pemesanan tiket.
  */
 public void displayNota() {
  System.out.println("\n----- Detail Pemesanan -----");
  System.out.println("Nama Pemesan: " + namaPemesan);
  System.out.println("Kode Booking: " + Main.generateKodeBooking());
  System.out.println("Tanggal Pesanan: " + Main.getCurrentDate());
  System.out.println("Tiket yang dipesan: " + tiket.getNamaTiket());
  System.out.println("Total Harga: " + tiket.getHarga() + " USD");
 }
}