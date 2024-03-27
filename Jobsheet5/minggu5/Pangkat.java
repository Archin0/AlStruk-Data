package Jobsheet5.minggu5;

import java.util.Scanner;

public class Pangkat {
    public int nilai, pangkat;

    public Pangkat() {

    }

    public Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF(int m, int n) {
        int pangkat = 1;
        for(int i=1; i<=n; i++) {
            pangkat *= m;
        }
        return pangkat;
    }

    int pangkatDC(int m, int n) {
        if(n==1) {
            return m;
        } else {
            if (n%2==0) {
                return (pangkatDC(m, n/2)*pangkatDC(m, n/2));
            } else {
                return (pangkatDC(m, n/2)*pangkatDC(m, n/2)*m);
            }
        }
    }
}

class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i=0; i<elemen; i++) {
            png[i] = new Pangkat();
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat: ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("Pilih metode perpangkatan:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.println("Pilihan: ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for(int i=0; i<elemen; i++) {
                    System.out.println(
                        "Hasil dari "
                        + png[i].nilai + " pangkat " 
                        + png[i].pangkat + " adalah "
                        + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;

            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for(int i=0; i<elemen; i++) {
                    System.out.println(
                        "Hasil dari "
                        + png[i].nilai + " pangkat " 
                        + png[i].pangkat + " adalah "
                        + png[i].pangkatDC(png[i].nilai, png[i].pangkat));   
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        sc.close();
    }
}
