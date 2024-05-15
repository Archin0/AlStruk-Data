package quiz2DwiAhmadKhairy;

public class Main {
    public static void main(String[] args){
        DoubleLinkedList dll1 = new DoubleLinkedList();
        dll1.addFirst(45);
        dll1.addFirst(10);
        dll1.addFirst(10);
        dll1.addFirst(15);
        dll1.addFirst(150);
        dll1.print();
        dll1.deleteFirst();
        dll1.print();
        dll1.printFromTail();
        //lanjutkan dengan memanggil method addLast, deleteLast, printFromTail
        dll1.addLast(60);
        dll1.print();
        dll1.printFromTail();

        DoubleLinkedList dll2 = new DoubleLinkedList();
        dll2.addFirst(30); dll2.addFirst(25);
        dll2.addLast(70); dll2.addFirst(65);
        dll2.print();
        dll2.printFromTail();

        //lanjutkan dengan memanggil method merge, split
        merge(dll1, dll2);
        dll1.print();
        dll1.printFromTail();
    }

    //No. 3 Kode Ganjil
    public static void merge(DoubleLinkedList dll1,
            DoubleLinkedList dll2){ // method untuk menggabungkan 2 lists menjadi satu
        //complete this method
        if (dll1.isEmpty()) { // untuk memberi statement dimana jika list1 kosong,
                              // maka head dan tail dari list gabungan akan diambil dari list2
            dll1.head = dll2.head;
            dll1.tail = dll2.tail;
        } else if (!dll2.isEmpty()) { // jika list2 tidak kosong, maka akan mengeksekusi program dibawah.
            dll1.tail.n = dll2.head;
            dll2.head.p = dll1.tail;
            dll1.tail = dll2.tail;
        }
        dll1.size += dll2.size; // size list gabungan sama dengan size list1 + size list2
        dll2.head = dll2.tail = null; // head dan tail list2 akan dijadikan null
        dll2.size = 0; // size list 2 akan dijadikan 0, sehingga nama list gabungan akan menggunakan nama dari list1.
    }

    //No. 3 Kode Genap
    // public static void split(DoubleLinkedList dll1){
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //list 1-> 2,3,4,34
        //list 2-> 2,3,45,4
    // }
}