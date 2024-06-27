package Jobsheet12;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size: "+dll.size);
        System.out.println("================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: "+dll.size);
        System.out.println("=================================");
        try {
            dll.add(40, 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dll.print();
        System.out.println("Size: "+dll.size);
        System.out.println("=================================");
        // dll.clear();
        // dll.print();
        // System.out.println("Size: "+dll.size);

        // dll.addLast(50);dll.addLast(40);
        // dll.addLast(10);dll.addLast(20);
        // dll.print();
        // System.out.println("Size: "+dll.size);
        // System.out.println("=================================");
        // try {
        //     dll.removeFirst();
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        // dll.print();
        // System.out.println("Size: "+dll.size);
        // System.out.println("=================================");
        // try {
        //     dll.removeLast();
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        // dll.print();
        // System.out.println("Size: "+dll.size);
        // System.out.println("=================================");
        // try {
        //     dll.remove(1);
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        // dll.print();
        // System.out.println("Size: "+dll.size());

        try {
            System.out.println("Data awal pada Linked Lists adalah: "+dll.getFirst());
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        try {
            System.out.println("Data akhir pada Linked Lists adalah: "+dll.getLast());
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        try {
            System.out.println("Data indeks ke-1 pada Linked Lists adalah: "+dll.get(1));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
