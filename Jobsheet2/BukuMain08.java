package Jobsheet2;

public class BukuMain08 {
    public static void main(String[] args) {
        Buku08 bk1 = new Buku08();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        System.out.println("Harga yang terjual: Rp"+bk1.hitungHargaTotal(5));
        System.out.println("Diskon: Rp"+bk1.hitungDiskon(5));
        System.out.println("Harga Bayar: Rp"+bk1.hitungHargaBayar(5));
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku08 bk2 = new Buku08("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        System.out.println("Harga yang terjual: Rp"+bk1.hitungHargaTotal(11));
        System.out.println("Diskon: Rp"+bk1.hitungDiskon(11));
        System.out.println("Harga Bayar: Rp"+bk1.hitungHargaBayar(11));
        bk2.tampilInformasi();

        Buku08 bukuDwik = new Buku08("Negeri Para Bedebah", "TereLiye", 247, 56, 125000);
        bukuDwik.gantiHarga(90000);
        bukuDwik.terjual(9);
        System.out.println("Harga yang terjual: Rp"+bk1.hitungHargaTotal(9));
        System.out.println("Diskon: Rp"+bk1.hitungDiskon(9));
        System.out.println("Harga Bayar: Rp"+bk1.hitungHargaBayar(9));
        bukuDwik.tampilInformasi();

    }
}
