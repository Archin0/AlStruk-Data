package Jobsheet12.Tugas1;

public class Pengantri {
    String no, nama;

    public Pengantri(String no, String nama) {
        this.no = no;
        this.nama = nama;
    }

    public void print() {
        System.out.println("|"+no+"\t|"+nama+"\t|");
    }
}

