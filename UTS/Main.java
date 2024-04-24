package UTS;

import java.util.Scanner;

public class Main {
    public static int size = 9;
    public static Barang[] daftarBarang = new Barang[size];
    public static int jumlahBarang = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean a = true;

        while (a) {
            // Menampilkan menu
            System.out.println("- MENU MANAJEMEN STOK BARANG -");
            System.out.println("1. Masukkan/tambahkan data barang");
            System.out.println("2. Tampilkan semua data barang");
            System.out.println("3. Urutkan data barang berdasarkan nilai stok dalam mode menaik");
            System.out.println("4. Menampilkan data Barang yang tergolong makanan yang tidak memiliki stok");
            System.out.println("5. Cari data barang berdasarkan kata kunci nama");
            System.out.println("6. Tambahkan stok untuk barang tertentu");
            System.out.println("7. Kurangi stok untuk barang tertentu");
            System.out.println("8. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahData(scanner);
                    break;
                case 2:
                    tampilSemuaData();
                    break;
                case 3:
                    urutNilaiStok();;
                    break;
                case 4:
                    tampilMakananTanpaStok();;
                    break;
                case 5:
                    cariDataBarang(scanner);
                    break;
                case 6:
                    tambahStok(scanner);
                    break;
                case 7:
                    kurangiStok(scanner);
                    break;
                case 8:
                    a = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    // Method untuk menambahkan data barang.
    public static void tambahData(Scanner scanner) {
        if (jumlahBarang >= size) {
            System.out.println("Stok penuh."); //untuk menjelaskan ketika kondisi daftar barang sudah penuh dan tak bisa menambah barang lagi.
            return;
        }

        // menambahkan barang.
        System.out.print("Masukkan kode barang: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan nama barang: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan kategori barang: ");
        String kategori = scanner.nextLine();
        System.out.print("Masukkan harga satuan barang: ");
        int harga = scanner.nextInt();
        System.out.print("Masukkan stok barang: ");
        int stok = scanner.nextInt();

        // instansiasi Barang.
        Barang barang = new Barang(kode, nama, kategori, harga, stok);
        daftarBarang[jumlahBarang++] = barang;
        System.out.println("Data barang "+nama+" berhasil ditambahkan."); // barang berhasil ditambahkan.
    }

    // Method untuk menampilkan semua data barang.
    public static void tampilSemuaData() {
        if (jumlahBarang == 0) {
            System.out.println("Stok kosong."); //untuk menjelaskan kondisi ketika belum ada barang ditambahkan.
        } else {
            for (int i = 0; i < jumlahBarang; i++) {
                // System.out.println(daftarBarang[i]); //untuk menampilkan semua daftar barang yang sudah ditambahkan.
                daftarBarang[i].print();
            }
        }
    }

    // Method untuk mengurutkan data barang berdasarkan nilai stok dalam mode menaik.
    public static void urutNilaiStok() {
        if (jumlahBarang == 0) {
            System.out.println("Stok kosong."); //untuk menjelaskan kondisi ketika belum ada barang ditambahkan.
        } else {
            // BubbleSort Ascending
            for (int i = 0; i < jumlahBarang - 1; i++) {
                for (int j = i + 1; j < jumlahBarang; j++) {
                    if (daftarBarang[i].stok > daftarBarang[j].stok) {
                        Barang temp = daftarBarang[i];
                        daftarBarang[i] = daftarBarang[j];
                        daftarBarang[j] = temp;
                    }
                }
            }

            System.out.println("Data barang berhasil diurutkan berdasarkan stok (menaik/ascending):");
            for (int i = 0; i < jumlahBarang; i++) {
                // System.out.println(daftarBarang[i]);
                daftarBarang[i].print(); // untuk menampilkan data barang yang sudah diurutkan.
            }
        }
    }

    // Method untuk menampilkan data barang yang mempunyai kategori makanan dan tidak memiliki stok.
    public static void tampilMakananTanpaStok() {
        // untuk menetapkan kondisi ada atau tidaknya kategori makanan yang tidak memiliki stok.
        boolean ketemu = false;

        // Loop for
        for (int i = 0; i < jumlahBarang; i++) {
            if (daftarBarang[i].cekMakanan() && daftarBarang[i].cekKosong()) {
                daftarBarang[i].print(); // untuk menampilkan data barang kategori makanan yang tidak memiliki stok. 
                ketemu = true; // menetapkan kondisi if setelahnya.
            }
        }

        // Jika tidak ada makanan yang tak memiliki stok.
        if (!ketemu) {
            System.out.println("Tidak ada makanan yang tidak memiliki stok.");
        }
    }

    // Method untuk mencari data barang berdasarkan kata kunci nama.
    public static void cariDataBarang(Scanner scanner) {
        if (jumlahBarang == 0) {
            System.out.println("Stok kosong.");
            return;
        }

        System.out.print("Masukkan kata kunci nama barang: ");
        String kataKunci = scanner.nextLine().toLowerCase();


        // Binary Search by nama
        for (int i = 0; i < jumlahBarang - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < jumlahBarang; j++) {
                if (daftarBarang[j].nama.compareToIgnoreCase(daftarBarang[minIndex].nama) < 0) {
                    minIndex = j;
                }
            }
            Barang temp = daftarBarang[minIndex];
            daftarBarang[minIndex] = daftarBarang[i];
            daftarBarang[i] = temp;
        }

        int left = 0;
        int right = jumlahBarang - 1;
        boolean ketemu = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (daftarBarang[mid].nama.toLowerCase().contains(kataKunci)) {
                // System.out.println(daftarBarang[mid]);
                daftarBarang[mid].print();
                ketemu = true;
            }
            if (daftarBarang[mid].nama.compareToIgnoreCase(kataKunci) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!ketemu) {
            System.out.println("Barang tidak ditemukan.");
        }
    }
    
    public static Barang cariBarangByKode(String kodeBarang) {
        for (int i = 0; i < jumlahBarang; i++) {
            if (daftarBarang[i].kode.equals(kodeBarang)) {
                return daftarBarang[i];
            }
        }
        return null;
    }

    public static void tambahStok(Scanner scanner) {
        System.out.print("Masukkan kode barang: ");
        String kodeBarang = scanner.nextLine();

        Barang barang = cariBarangByKode(kodeBarang);

        if (barang != null) {
            System.out.print("Masukkan jumlah stok yang ditambahkan: ");
            int jumlah = scanner.nextInt();
            barang.tambahStok(jumlah);
            System.out.println("Stok barang berhasil ditambahkan.");
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    public static void kurangiStok(Scanner scanner) {
        System.out.print("Masukkan kode barang: ");
        String kodeBarang = scanner.nextLine();

        Barang barang = cariBarangByKode(kodeBarang);

        if (barang != null) {
            System.out.print("Masukkan jumlah stok yang dikurangi: ");
            int jumlah = scanner.nextInt();
            barang.kurangiStok(jumlah);
            System.out.println("Stok barang berhasil dikurangi.");
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }

}