package Jobsheet8;

import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tentukan berapa kapasitas dari Gudang: ");
        int kapasitas = scanner.nextInt();
        Gudang08 gudang = new Gudang08(kapasitas);


        boolean a = true;

        while (a) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Barang Teratas");
            System.out.println("4. Tampilkan Tumpukan Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();

                    Barang08 barangBaru = new Barang08(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.lihatBarangTeratas();
                    break;

                case 4:
                    gudang.tampilkanBarang();
                    break;
                case 5:
                    a = false;
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
