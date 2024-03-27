// “BruteForceDivideConquer”.
package Jobsheet5.minggu5;

import java.util.Scanner;

public class Faktorial {
    public int nilai;

    public Faktorial() {

    }

    int faktorialBF(int n) {
        int fakto = 1;

        // For LOOP
        // for(int i=1; i<=n; i++) {
        //     fakto = fakto*i;
        // }
        
        // While LOOP
        int i = 1;
        while (i <= n) {
        fakto = fakto * i;
        i++;
        }
        return fakto;
    }

    int faktorialDC(int n) {
        if(n==1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}

class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial[] fk = new Faktorial[10];
        for(int i=0; i<iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-"+(i+1)+": ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("HASIL - BRUTE FORCE");
        for(int i=0; i<iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah "+ fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("HASIL - DIVIDE AND CONQUER");
        for(int i=0; i<iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Divide and Conquer adalah "+ fk[i].faktorialDC(fk[i].nilai));
        }

        sc.close();
    }
}
