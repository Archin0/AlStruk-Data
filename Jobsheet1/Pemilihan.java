package Jobsheet1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nilai UAS   : ");
        int uas = input.nextInt();

        System.out.print("Nilai UTS   : ");
        int uts = input.nextInt();

        System.out.print("Nilai Kuis  : ");
        int kuis = input.nextInt();

        System.out.print("Nilai Tugas : ");
        int tugas = input.nextInt();


        double total = (int)((uas * 0.4) + (uts * 0.3) + (kuis * 0.2) + (tugas * 0.1));

        System.out.println("--------------------------------------------------------------");

        if(uas<0|uas>100){
            System.out.println("Nilai tidak valid. Mohon masukkan nilai ulang.");
        } else if(uts<0|uts>100){
            System.out.println("Nilai tidak valid. Mohon masukkan nilai ulang.");
        } else if(kuis<0|kuis>100){
            System.out.println("Nilai tidak valid. Mohon masukkan nilai ulang.");
        } else if(tugas<0|tugas>100){
            System.out.println("Nilai tidak valid. Mohon masukkan nilai ulang.");
        } else if (total > 80) {
            System.out.println("Nilai akhir: " + total);
            System.out.println("Nilai huruf: A, setara 4 dengan kualifikasi Sangat Baik, sehingga LULUS");
        } else if (total > 73) {
            System.out.println("Nilai akhir: " + total);
            System.out.println("Nilai huruf: B+, setara 3,5 dengan kualifikasi Lebih dari Baik, sehingga LULUS");
        } else if (total > 65) {
            System.out.println("Nilai akhir: " + total);
            System.out.println("Nilai huruf: B, setara 3 dengan kualifikasi Baik, sehingga LULUS");
        } else if (total > 60) {
            System.out.println("Nilai akhir: " + total);
            System.out.println("Nilai huruf: C+, setara 2,5 dengan kualifikasi Lebih dari Cukup, sehingga LULUS");
        } else if (total > 50) {
            System.out.println("Nilai akhir: " + total);
            System.out.println("Nilai huruf: C, setara 2 dengan kualifikasi Cukup, sehingga LULUS");
        } else if (total > 39) {
            System.out.println("Nilai akhir: " + total);
            System.out.println("Nilai huruf: D, setara 1 dengan kualifikasi Kurang, sehingga TIDAK LULUS");
        } else {
            System.out.println("Nilai akhir: " + total);
            System.out.println("Nilai huruf: E, setara 0 dengan kualifikasi Gagal, sehingga TIDAK LULUS");
        }
        input.close();

        
    }
}
