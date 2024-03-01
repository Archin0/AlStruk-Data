package Jobsheet2;

public class Buku08 {

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("-------------------------------");
        System.out.println("Informasi Buku");
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp" + harga);
    } 

    void terjual(int jml) {
        if(stok > 0 && stok >= jml) {
            stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    // Latihan 1
    int hitungHargaTotal(int jml) {
        return harga*jml;
    }

    // Latihan 1
    int hitungDiskon(int jml) {
        int diskon = 0;
        int hargaTotal = hitungHargaTotal(jml);
        if(hargaTotal > 150000) {
            diskon = (int)(0.12*hargaTotal);
        } else if(hargaTotal >= 75000 && hargaTotal < 150000) {
            diskon = (int)(0.05*hargaTotal);
        }
        return diskon;
    }

    // Latihan 1
    int hitungHargaBayar(int jml) {
        int hargaBayar = hitungHargaTotal(jml) - hitungDiskon(jml);
        return hargaBayar;
    }

    public Buku08() {

    }

    public Buku08(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }


}