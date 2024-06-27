package Jobsheet16;

public class Mahasiswa {
    String nim,nama,notelp;

    Mahasiswa(){

    }
    Mahasiswa(String nim, String nama, String notelp){
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
    public String getNim() {
        return nim;
    }
}
