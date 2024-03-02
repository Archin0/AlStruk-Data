package Jobsheet3;

public class Mahasiswa {
    String nim, nama, jenisKelamin;
    double IPK, tambah;

    public Mahasiswa() {

    }

    public Mahasiswa(String na, String ni, String jk, double ipk) {
        nama = na;
        nim = ni;
        jenisKelamin = jk;
        IPK = ipk;
    }

    void print() {
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("Jenis Kelamin: "+jenisKelamin);
        System.out.println("IPK: "+IPK);
    }
}