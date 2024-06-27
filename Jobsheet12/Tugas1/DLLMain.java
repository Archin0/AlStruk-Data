package Jobsheet12.Tugas1;

import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        DLLQueue antr = new DLLQueue();
        
        boolean a = true;
        while (a) {
            System.out.println("-PENGANTRI VAKSIN ABAL2-");
            System.out.println("1..Tambahkan ke Antrian");
            System.out.println("2..Keluarkan dari Antrian");
            System.out.println("3..Lihat Seluruh Antrian");
            System.out.println("4..Keluar");
            System.out.println("Pilihan: ");
            int pilihan = sc.nextInt();
            // sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nomor Antrian: ");
                    String no = sc.next();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    antr.enqueue(no, nama);
                    System.out.println();
                    break;
                case 2:
                    if (!antr.isEmpty()) {
                        System.out.println(antr.front.data.nama+" telah selesai divaksinasi");
                    }
                    antr.dequeue();
                    antr.print();
                    System.out.println();
                    break;
                case 3:
                    antr.print();
                    System.out.println();
                    break;
                case 4:
                    a = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
