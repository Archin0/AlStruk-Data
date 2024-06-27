package Jobsheet12.Tugas2;

import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner scCari = new Scanner(System.in);
        DLL pilem = new DLL();
        
        boolean a = true;
        while (a) {
            System.out.println("-DATA FILM LAYAR LEBAR-");
            System.out.println("1..Tambah Data Awal");
            System.out.println("2..Tambah Data Akhir");
            System.out.println("3..Tambah Data Index Tertentu");
            System.out.println("4..Hapus Data Pertama");
            System.out.println("5..Hapus Data Terakhir");
            System.out.println("6..Hapus Data Index Tertentu");
            System.out.println("7..Cetak");
            System.out.println("8..Cari Film berdasarkan ID");
            System.out.println("9..Urut Data Film berdasarkan Rating DESC");
            System.out.println("10..Keluar");
            System.out.println("Pilihan: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Data Posisi Awal");
                    System.out.print("ID Film: ");
                    String id = sc.next();
                    System.out.print("Judul Film: ");
                    String judul = scanner.nextLine();
                    System.out.print("Rating: ");
                    double rating = sc.nextDouble();
                    pilem.addFirst(id, judul, rating);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Masukkan Data Posisi Akhir");
                    System.out.print("ID Film: ");
                    String id2 = sc.next();
                    System.out.print("Judul Film: ");
                    String judul2 = scanner.nextLine();
                    System.out.print("Rating: ");
                    double rating2 = sc.nextDouble();
                    pilem.addLast(id2, judul2, rating2);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Masukkan Data Posisi Tertentu");
                    System.out.print("ID Film: ");
                    String id3 = sc.next();
                    System.out.print("Judul Film: ");
                    String judul3 = scanner.nextLine();
                    System.out.print("Rating: ");
                    double rating3 = sc.nextDouble();
                    System.out.print("Ditambahkan ke urutan: ");
                    int index = scanner.nextInt();
                    pilem.add(id3, judul3, rating3, index);
                    System.out.println();
                    break;
                case 4:
                    pilem.removeFirst();
                    System.out.println();
                    break;
                case 5:
                    pilem.removeLast();System.out.println();
                    break;
                case 6:
                    System.out.println("Hapus Data Posisi Tertentu");
                    System.out.print("Data pada indeks ke: ");
                    int index2 = sc.nextInt();
                    pilem.remove(index2);
                    System.out.println();
                    break;
                case 7:
                    pilem.print();
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Cari Data");
                    System.out.print("Masukkan ID Film yang dicari: ");
                    String idCari = scCari.next();
                    pilem.cariByID(idCari);
                    System.out.println();
                    break;
                case 9:
                    System.out.println("Urut Data berdasarkan Rating DESC");
                    pilem.sortByRatingDESC();
                    System.out.println();
                    break;
                case 10:
                    a = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
