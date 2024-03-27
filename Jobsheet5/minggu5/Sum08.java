package Jobsheet5.minggu5;

import java.util.Scanner;

public class Sum08 {
    int nomor;
    int jumlahBulan;
    double[] keuntungan;
    double totalKeuntungan;

    Sum08() {
    }

    void input(Scanner sc) {
        // Input jumlah bulan
        System.out.print("Masukkan jumlah bulan untuk perusahaan " + (this.nomor) + ": ");
        this.jumlahBulan = sc.nextInt();

        // Deklarasi array untuk keuntungan
        this.keuntungan = new double[jumlahBulan];

        // Input keuntungan untuk setiap bulan
        for (int i = 0; i < jumlahBulan; i++) {
            System.out.print("Masukkan keuntungan bulan ke-" + (i + 1) + ": ");
            this.keuntungan[i] = sc.nextDouble();
        }
    }

    void hitungKeuntungan() {
        totalKeuntungan = 0;
        for (int i = 0; i < jumlahBulan; i++) {
            totalKeuntungan += keuntungan[i];
        }
    }
}

class mainSum08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah perusahaan: ");
        int nPerusahaan = sc.nextInt();

        Sum08[] perusahaan = new Sum08[nPerusahaan];

        for (int i = 0; i < nPerusahaan; i++) {
            perusahaan[i] = new Sum08();
            perusahaan[i].nomor = i +1;
            perusahaan[i].input(sc);
        }

        for (int i = 0; i < nPerusahaan; i++) {
            perusahaan[i].hitungKeuntungan();
            System.out.println(
                "Total keuntungan perusahaan " + 
                (i + 1) + " selama " +
                perusahaan[i].jumlahBulan + 
                " bulan adalah " + perusahaan[i].totalKeuntungan);
        }
    }
}