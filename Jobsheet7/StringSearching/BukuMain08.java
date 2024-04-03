package Jobsheet7;

import java.util.Scanner;

public class BukuMain08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku08 data = new PencarianBuku08();
        int jumBuku = 5;

        System.out.println("---------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari Kode Buku Terkecil : ");
        for(int i=0; i<jumBuku; i++) {
            System.out.println("-----------------------------------");
            System.out.print("Kode buku \t : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stok      \t : ");
            int stok = s.nextInt();

            Buku08 m = new Buku08(kodeBuku, judulBuku, tahunTerbit, pengarang, stok);
            data.tambah(m);
        }
        System.out.println("--------------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("_________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("-Masukkan kode buku yang dicari-");
        System.out.print("Kode Buku : ");
        String cari = s1.nextLine();
        System.out.println("==================================");
        System.out.println("menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        s.close();
        s1.close();

        Buku08 dataBuku = data.findBuku(cari);
        dataBuku.tampilDataBuku();

        System.out.println("=================================");
        System.out.println("menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku-1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
    
}
