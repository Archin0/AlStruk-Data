package Jobsheet3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int length = input.nextInt();
        // Harus ditambahkan agar program tidak melangkahi Scanner selanjutnya
        input.nextLine();
        System.out.println("===============================");

        Mahasiswa mhs[] = new Mahasiswa[length];

        for(int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa();

            System.out.println("Masukkan data mahasiswa ke-"+(i+1));
            System.out.print("Masukkan nama: ");
            mhs[i].nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            mhs[i].nim = input.nextLine();
            System.out.print("Masukkan jenis kelamin: ");
            mhs[i].jenisKelamin = input.next().toUpperCase();
            System.out.print("Masukkan IPK: ");
            mhs[i].IPK = input.nextDouble();
            input.nextLine();
            
            System.out.println("=================================");
        }

        for(int i = 0; i < mhs.length; i++) {
            System.out.println("Data Mahasiswa ke-"+(i+1));
            mhs[i].print();
        }

        System.out.println("==========================");
        
        // Mengambil hanya 2 angka dibelakang koma
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("IPK rata-rata: "+df.format(hitungRataIPK(mhs)));
        System.out.println("Dengan perolehan IPK tertinggi yaitu oleh: ");
        cariIPKTerbesar(mhs).print();

        input.close();
    }

    public static double hitungRataIPK(Mahasiswa[] mhs) {
        double sum = 0;
        for(int i = 0; i < mhs.length; i++) {
            sum += mhs[i].IPK;
        }
        return (double)(sum/mhs.length);
    }

    public static Mahasiswa cariIPKTerbesar(Mahasiswa[] mhs) {
        Mahasiswa IPKTerbesar = mhs[0];
        for(int j = 1; j < mhs.length; j++) {
            if(mhs[j].IPK > IPKTerbesar.IPK) {
                IPKTerbesar = mhs[j];
            }
        }
        return IPKTerbesar;
    }
}