package Jobsheet1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        String[] matkul = {"Pancasila","Konsep Teknologi Informasi","Critical Thinking dan Problem Solving","Matematika Dasar","Bahasa Inggris","Dasar Pemrograman","Praktikum Dasar Pemrograman","Keselamatan dan Kesehatan Kerja"};
        String[] nilaiHuruf =  new String[8];
        int[] sks = {2,2,2,3,2,2,3,2};
        double[] nilai = new double[8];
        double[] setara = new double[8];
        int sumSKS = 18;
        double sumAtas=0;
        double kali, ip=0;
        

        for(int i=0; i<8; i++) {
            System.out.print("Nilai Matkul "+matkul[i]+": ");
            nilai[i] = sc.nextDouble();

            if (nilai[i]>80) {
                nilaiHuruf[i] = "A";
                setara[i] = 4;
            } else if (nilai[i]>73) {
                nilaiHuruf[i] = "B+";
                setara[i] = 3.5;
            } else if (nilai[i]>65) {
                nilaiHuruf[i] = "B";
                setara[i] = 3;
            } else if (nilai[i]>60) {
                nilaiHuruf[i] = "C+";
                setara[i] = 2.5;
            } else if (nilai[i]>50) {
                nilaiHuruf[i] = "C";
                setara[i] = 2;
            } else if (nilai[i]>39) {
                nilaiHuruf[i] = "D";
                setara[i] = 1;
            } else {
                nilaiHuruf[i] = "E";
                setara[i] = 0;
            } 

            kali = setara[i]*sks[i];
            sumAtas += kali;
        }

        ip = sumAtas/sumSKS;

        System.out.println("=======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=======================");
        System.out.println("Matkul                                  Nilai Angka     Nilai Huruf      Nilai Setara");
        System.out.println("Pancasila                                   "+nilai[0]+"            "+nilaiHuruf[0]+"               "+setara[0]);
        System.out.println("Konsep Teknologi Informasi                  "+nilai[1]+"            "+nilaiHuruf[1]+"               "+setara[1]);
        System.out.println("Critical Thinking dan Problem Solving       "+nilai[2]+"            "+nilaiHuruf[2]+"               "+setara[2]);
        System.out.println("Matematika Dasar                            "+nilai[3]+"            "+nilaiHuruf[3]+"               "+setara[3]);
        System.out.println("Bahasa Inggris                              "+nilai[4]+"            "+nilaiHuruf[4]+"               "+setara[4]);
        System.out.println("Dasar Pemrograman                           "+nilai[5]+"            "+nilaiHuruf[5]+"               "+setara[5]);
        System.out.println("Praktikum Dasar Pemrograman                 "+nilai[6]+"            "+nilaiHuruf[6]+"               "+setara[6]);
        System.out.println("Keselamatan dan Kesehatan Kerja             "+nilai[7]+"            "+nilaiHuruf[7]+"               "+setara[7]);
        System.out.println("======================================================================================");
        System.out.printf("IP Semester: "+"%.2f\n", ip);

        sc.close();
    }
}
