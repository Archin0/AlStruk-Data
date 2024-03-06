package Kuis1;

import java.util.Scanner;

public class Mobil {
    String nama;
    int cc, hargaBeli, thnProduksi;

    public Mobil() {

    }

    public Mobil(String nama, int cc, int harga, int tahun) {
        this.nama = nama;
        this.cc = cc;
        hargaBeli = harga;
        thnProduksi = tahun;
    }

    void printData() {
        System.out.println("Nama: "+nama);
        System.out.println("CC: "+cc);
        System.out.println("Harga Beli: Rp"+hargaBeli);
        System.out.println("Tahun Produksi: "+thnProduksi);
    }

    double hitungPajak() {
        double pajak;
        if (cc > 1500) {
            pajak = (0.1*hargaBeli);
        } else {
            pajak = (0.075*hargaBeli);
        }
        return pajak;
    }

    double hitungBiayaPerawatan() {
        double biaya;
        if (thnProduksi < 2010) {
            biaya = (0.08*hargaBeli);
        } else {
            biaya = (0.05*hargaBeli);
        }
        return biaya;
    }

    double hitungBiayaTotal() {
        double biayaTotal = hitungPajak() + hitungBiayaPerawatan();
        return biayaTotal;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Mobil cars[] = new Mobil[10];
        
        cars[0] = new Mobil();
        cars[1] = new Mobil();
        cars[2] = new Mobil();
        cars[3] = new Mobil();
        cars[4] = new Mobil();
        cars[5] = new Mobil();
        cars[6] = new Mobil();
        cars[7] = new Mobil();
        cars[8] = new Mobil();
        cars[9] = new Mobil();
        
        cars[0].nama = "Daihatsu Ayla";
        cars[0].cc = 1000;
        cars[0].hargaBeli = 135000000;
        cars[0].thnProduksi = 2015;

        cars[1].nama = "Datsun Go";
        cars[1].cc = 1200;
        cars[1].hargaBeli = 82000000;
        cars[1].thnProduksi = 2009;

        cars[2].nama = "Honda Brio";
        cars[2].cc = 1520;
        cars[2].hargaBeli = 165000000;
        cars[2].thnProduksi = 2009;

        cars[3].nama = "Mitsubishi Mirage";
        cars[3].cc = 1193;
        cars[3].hargaBeli = 115000000;
        cars[3].thnProduksi = 2013;

        cars[4].nama = "Toyota Raize";
        cars[4].cc = 998;
        cars[4].hargaBeli = 235000000;
        cars[4].thnProduksi = 2020;

        cars[5].nama = "Toyota Rush";
        cars[5].cc = 1560;
        cars[5].hargaBeli = 257000000;
        cars[5].thnProduksi = 2009;

        cars[6].nama = "Suzuki Ignis";
        cars[6].cc = 1197;
        cars[6].hargaBeli = 117000000;
        cars[6].thnProduksi = 2008;

        cars[7].nama = "Wuling Almaz RS";
        cars[7].cc = 1561;
        cars[7].hargaBeli = 360000000;
        cars[7].thnProduksi = 2009;

        cars[8].nama = "Wuling Confero";
        cars[8].cc = 1485;
        cars[8].hargaBeli = 150800000;
        cars[8].thnProduksi = 2008;

        cars[9].nama = "Honda Civic";
        cars[9].cc = 1498;
        cars[9].hargaBeli = 533000000;
        cars[9].thnProduksi = 2019;

        int pilihan;
        do {
            System.out.println("1. Hitung Biaya Perawatan Rata-Rata dari Mobil Tahun Produksi >2010");
            System.out.println("2. Hitung Biaya Total Terbesar dari Mobil cc >1500 dan Tahun Produksi <2010");
            System.out.println("0. Keluar");
            System.out.println("==========================================================================");

            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    double sum = 0, biayaRata;
                    for(int i = 0; i < cars.length; i++) {
                        if (cars[i].thnProduksi > 2010) {
                            cars[i].hitungBiayaPerawatan();
                            sum += cars[i].hitungBiayaPerawatan();
                        }
                    }
                    biayaRata = sum/cars.length;
                    System.out.println("Biaya Perawatan Rata-Rata dari Mobil Tahun Produksi >2010: Rp"+biayaRata);
                    break;
                case 2:
                Mobil biayaTotalTerbesar = cars[0];
                for(int j = 1; j < cars.length; j++) {
                    if (cars[j].cc > 1500 && cars[j].thnProduksi < 2010) {
                        if(cars[j].hitungBiayaTotal() > biayaTotalTerbesar.hitungBiayaTotal()) {
                            biayaTotalTerbesar = cars[j];
                        }
                    }
                }
                System.out.println("Mobil cc >1500 dan Tahun Produksi <2010 dengan Biaya Total Terbesar: ");
                biayaTotalTerbesar.printData();
                System.out.println("Dengan biaya total sebesar: "+biayaTotalTerbesar.hitungBiayaTotal());
                    break;
            }
        } while (pilihan != 0 && pilihan>2);
        scanner.close();
    }
}
