package Jobsheet12.Tugas2;

public class Film {
    String id, judul;
    double rating;

    public Film(String id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
    }

    public void print() {
        System.out.println("ID: "+id);
        System.out.println(" Judul Film: "+judul);
        System.out.println(" Rating: "+rating);
    }
}
