package Jobsheet8;

public class Gudang08 {
    Barang08[] tumpukan;
    int size, top;

    public Gudang08(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang08[size];
        top = -1;
    }

    public boolean cekKosong() {
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if(top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang08 brg) {
        if(!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang "+brg.nama+" berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang08 ambilBarang() {
        if(!cekKosong()) {
            Barang08 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+delete.nama+" diambil dari Gudang.");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang08 lihatBarangTeratas() {
        if(!cekKosong()) {
            Barang08 barangTeratas = tumpukan[top];
            System.out.println("Barang Teratas: "+barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        // if(!cekKosong()) {
        //     System.out.println("Rincian tumpukan barang di Gudang: ");
        //     for (int i=0; i<=top; i++) {
        //         System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
        //     }
        // } else {
        //     System.out.println("Tumpukan barang kosong.");
        // }
        System.out.println("Rincian tumpukan barang di Gudang: ");
        for (int i=0; i<=top; i++) {
            System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
        }
    }
}
