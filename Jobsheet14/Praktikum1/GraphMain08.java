package Jobsheet14.Praktikum1;

import java.util.Scanner;

public class GraphMain08 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Graph08 gedung = new Graph08(6);

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        System.out.println("--------------------------------");
        gedung.updateJarak(0, 1, 80);
        gedung.printGraph();
        System.out.println("--------------------------------");
        
        // pemanggilan removeEdge method
        gedung.removeEdge(1, 3);
        gedung.printGraph();
        System.out.println("--------------------------------");

        boolean a = true;
        while (a) {
            System.out.print("Masukkan gedung asal: ");
            int asal = scanner.nextInt();
            System.out.print("Masukkan gedung tujuan: ");
            int tujuan = scanner.nextInt();

            if (gedung.isAdjacent(asal, tujuan)) {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
            } else {
                System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
            }

            System.out.println("Apakah anda ingin bertanya lagi?(y/n) ");
            String check = scanner.next();
            if (check.equalsIgnoreCase("n")) {
                a = false;
            }
        }
    }
    
}
