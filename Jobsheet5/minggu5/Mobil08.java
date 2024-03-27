package Jobsheet5.minggu5;

public class Mobil08 {
    String merk;
    String tipe;
    int tahun;
    int topAcceleration;
    int topPower;

    public Mobil08(String merk, String tipe, int tahun, int topAcceleration, int topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

    public String toString(){
        return "Merk: " + merk + ", Tipe: " + tipe + ", Tahun: " + tahun + ", Top Acceleration: " + topAcceleration + ", Top Power: " + topPower;
    }
}

class mainMobil08 {
    public static int maxAcceleration(Mobil08[] cars, int left, int right) {
        if (left == right)
            return cars[left].topAcceleration;

        int mid = (left + right) / 2;

        int maxLeft = maxAcceleration(cars, left, mid);
        int maxRight = maxAcceleration(cars, mid + 1, right);

        return Math.max(maxLeft, maxRight);
    }

    public static int minAcceleration(Mobil08[] cars, int left, int right) {
        if (left == right)
            return cars[left].topAcceleration;

        int mid = (left + right) / 2;

        int minLeft = minAcceleration(cars, left, mid);
        int minRight = minAcceleration(cars, mid + 1, right);

        return Math.min(minLeft, minRight);
    }

    public static double averageTopPower(Mobil08[] cars) {
        int sum = 0;
        for (Mobil08 car : cars) {
            sum += car.topPower;
        }
        return (double) sum / cars.length;
    }


   public static void main(String[] args) {
    Mobil08[] cars = {
        new Mobil08("BMW", "M2 Coupe", 2016, 6816, 728),
        new Mobil08("Ford", "Fiesta ST", 2014, 3921, 575),
        new Mobil08("Nissan", "370Z", 2009, 4360, 657),
        new Mobil08("Subaru", "BRZ", 2014, 4058, 609),
        new Mobil08("Subaru", "Impreza WRX STI", 2013, 6255, 703),
        new Mobil08("Toyota", "AE86 Trueno", 1986, 3700, 553),
        new Mobil08("Toyota", "86/GT86", 2014, 4180, 609),
        new Mobil08("Volkswagen", "Golf GTI", 2014, 4180, 631)
    };

    System.out.println("Data Mobil Showroom:");
    System.out.println("================================");
    for(Mobil08 car : cars){
        System.out.println(car);
    }
    System.out.println("================================");

    int maxAcc = maxAcceleration(cars, 0, cars.length - 1);
    int minAcc = minAcceleration(cars, 0, cars.length - 1);
    double avgTopPower = averageTopPower(cars);

    System.out.println("Top Acceleration Tertinggi: " + maxAcc);
    System.out.println("Top Acceleration Terendah: " + minAcc);
    System.out.println("Rata - rata Top Power: " + avgTopPower);
   }
}
