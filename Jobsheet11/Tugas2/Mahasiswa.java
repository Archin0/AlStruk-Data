package Jobsheet11.Tugas2;

public class Mahasiswa {
    String nama, nim;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void print() {
        System.out.println(nama+" ("+nim+")");
    }
}
