package Jobsheet6.Praktikum;

public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Shameel Blitar", "Blitar", 1000, (byte)4.2);
        Hotel h2 = new Hotel("Nathan el Kediri", "Kediri", 800, (byte)4);
        Hotel h3 = new Hotel("Satria Maha", "Batu", 500, (byte)3);
        Hotel h4 = new Hotel("Jaya Agong", "Probolinggo", 1500, (byte)5);
        Hotel h5 = new Hotel("Naseh Gareng", "Probolinggo", 1100, (byte)3.8);
        
        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Daftar Penginapan sebelum Sorting");
        list.tampilAll();

        System.out.println("Daftar Penginapan setelah Sorting Harga dari yang Termurah ke Tertinggi");
        System.out.println("Metode Bubble Sort");
        list.bubbleHarga();
        list.tampilAll();
        System.out.println("Metode Selection Sort");
        list.selectionHarga();
        list.tampilAll();

        System.out.println("Daftar Penginapan setelah Sorting Rating BIntang dari yang Tertinggi ke Terendah");
        System.out.println("Metode Bubble Sort");
        list.bubbleRating();
        list.tampilAll();
        System.out.println("Metode Selection Sort");
        list.selectionRating();
        list.tampilAll();
    }
}
