package Jobsheet11.Tugas1;

public class Mahasiswa {
    String nama, nim;

    // public Mahasiswa() {}

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void print() {
        System.out.println("NIM  : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println();
    }
}

