package Jobsheet12.Tugas1;

public class DLLQueue {
    Node front, rear;
    int size;

    public DLLQueue() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(String no, String nama) {
        Pengantri data = new Pengantri(no, nama);
        if (isEmpty()) {
            front = rear = new Node(null, data, null);
        } else {
            Node current = front;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, data, null);
            current.next = newNode;
        }
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else if (size == 1) {
            front = null;
            size--;
            return;
        } else {
            front = front.next;
            front.prev =  null;
            size--;
        }
        System.out.println("Sisa Antrian: "+size);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("|No.\t|Nama\t|");
            Node tmp = front;
            while (tmp != null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian Kosong.");
        }
        System.out.println("Sisa Antrian: "+size);
    }
}
