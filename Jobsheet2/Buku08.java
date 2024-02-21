package Jobsheet2;

/**
 * Buku08
 */
public class Buku08 {

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp" + harga);
    }

    void terjual(int jml) {
        if(stok > 0) {
            stok -= jml;
        }
        else{
            stok = 0;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
}