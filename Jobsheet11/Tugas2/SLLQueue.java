package Jobsheet11.Tugas2;

public class SLLQueue {
    Node front, rear;
    int size;

    public SLLQueue() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void Enqueue(String nim, String nama) {
        Mahasiswa data = new Mahasiswa(nim, nama);
        Node newNd = new Node(data);
        if (isEmpty()) {
            front = rear = newNd;
        } else {
            rear.next = newNd;
            rear = newNd;
        }
        size++;
        System.out.println("Berhasil ditambahkan.");
    }

    public void Dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            // Mahasiswa data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan dalam antrian: ");
            front.data.print();
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian: ");
            Node temp = front;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
        }
    }
}
