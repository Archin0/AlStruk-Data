package Jobsheet3;

import java.util.Scanner;

// -- Class untuk contoh percobaan 2
// class Orang {
//     public String nama;
//     public int umur;   
    
//     public Orang(String nama, int umur) {
//         this.nama = nama;
//         this.umur = umur;
//     }

//     public String getName() {
//         return nama;
//     }

//     public int getAge() {
//         return umur;
//     }
// }

class PersegiPanjang {
    public int panjang;
    public int lebar;
}

class Persegi {
    public int sisi;
}

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Contoh untuk Pertanyaan 2 Percobaan 2
        // Orang[][] Arraymd = new Orang[2][2];

        // Arraymd[0][0] = new Orang("Dwik", 18);
        // Arraymd[0][1] = new Orang("Ujik", 19);
        // Arraymd[1][0] = new Orang("Dwik", 18);
        // Arraymd[1][1] = new Orang("Ujik", 19);

        // for (int i = 0; i < Arraymd.length; i++) {
        //     for (int j = 0; j < Arraymd[i].length; j++) {
        //         Orang person = Arraymd[i][j];
        //         System.out.println("Nama: " + person.getName() + ", Umur: " + person.getAge());
        //     }
        // }
        //-----------------------------------------------

        Persegi[] pgArray = new Persegi[100];
        pgArray[5] = new Persegi();
        pgArray[5].sisi = 20;

        System.out.println("Persegi ke-5, sisi: "+pgArray[5].sisi);
        System.out.println("---------------------------------------------");

        System.out.print("Berapa length array yang diinginkan: ");
        int length = sc.nextInt();

        PersegiPanjang[] ppArray = new PersegiPanjang[length];

        for(int i = 0; i < length; i++) {
            ppArray[i] = new PersegiPanjang();
            ppArray[0] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-"+i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for(int i = 0; i < length; i++) {
            System.out.println("------------------------------------------");
            System.out.println("Persegi panjang ke-"+i);
            System.out.println("Panjang: "+ppArray[i].panjang + ", lebar: "+ppArray[i].lebar);
        }
        sc.close();
    }

}
