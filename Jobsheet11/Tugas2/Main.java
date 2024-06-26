package Jobsheet11.Tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        SLLQueue mhs = new SLLQueue();
        
        boolean a = true;
        while (a) {
            System.out.println("-Layanan Unit Kemahasiswaan-");
            System.out.println("1..Tambahkan ke Antrian");
            System.out.println("2..Keluarkan dari Antrian");
            System.out.println("3..Lihat Antrian Terdepan");
            System.out.println("4..Lihat Seluruh Antrian");
            System.out.println("5..Keluar");
            System.out.println("Pilihan: ");
            int pilihan = sc.nextInt();
            // sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.next();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    mhs.Enqueue(nim, nama);
                    System.out.println();
                    break;
                case 2:
                    if (!mhs.isEmpty()) {
                        System.out.println(mhs.front.data.nama+" ("+mhs.front.data.nim+") berhasil keluar dari antrian.");
                    }
                    mhs.Dequeue();
                    System.out.println();
                    break;
                case 3:
                    mhs.peek();
                    System.out.println();
                    break;
                case 4:
                    mhs.print();
                    System.out.println();
                    break;
                case 5:
                    a = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
