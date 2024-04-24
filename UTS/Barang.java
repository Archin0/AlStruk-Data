package UTS;

public class Barang {
    int harga, stok;
    String kode, nama, kategori;

    public Barang(String kode, String nama, String kategori, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }

    public void print() {
        System.out.println("---------------------------");
        System.out.println("Kode barang : "+kode);
        System.out.println("Nama : "+nama);
        System.out.println("Kategori :"+kategori);
        System.out.println("Harga satuan :"+harga);
        System.out.println("Stok : "+stok);
    }

    public boolean cekMakanan() {
        return kategori.equalsIgnoreCase("food");
    }

    public boolean cekKosong() {
        return stok == 0;
    }

    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        stok -= jumlah;
        if (stok < 0) {
            stok = 0;
        }
    }
}