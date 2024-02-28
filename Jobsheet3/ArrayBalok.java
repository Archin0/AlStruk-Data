package Jobsheet3;

class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int hitungLuas() {
        return alas*tinggi/2;
    }

    public int hitungKeliling() {
        return ((int)(Math.sqrt(alas*alas + tinggi*tinggi))) + alas + tinggi;
    }
}


public class ArrayBalok {
    public static void main(String[] args) {
        Balok[] blArray = new Balok[3];
        
        blArray[0] = new Balok(100, 30, 12);
        blArray[1] = new Balok(120, 40, 15);
        blArray[2] = new Balok(210, 50, 25);

        for(int i = 0; i < 3; i++) {
            System.out.println("-----------------------------------------------");
            System.out.println("Volume balok ke-"+i+": "+ blArray[i].hitungVolume());
        }

        Segitiga[] sgArray = new Segitiga[4];

        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for(int i = 0; i < 4; i++) {
            System.out.println("-----------------------------------------------");
            System.out.println("Luas segitiga ke-"+i+": "+sgArray[i].hitungLuas());
            System.out.println("Keliling segitiga ke-"+i+": "+sgArray[i].hitungKeliling());
        }
        
    }
}