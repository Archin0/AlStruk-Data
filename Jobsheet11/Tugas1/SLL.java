package Jobsheet11.Tugas1;

public class SLL {
    Node head;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
        } else {
            Node temp = head;
            while (temp!= null) {
                temp.data.print();
                temp = temp.next;
            }
        }
    }

    public void addFirst(Mahasiswa mhs) {
        Node newNd = new Node(mhs);
        if (isEmpty()) {
            head = newNd;
        } else {
            newNd.next = head;
            head = newNd;
        }
        size++;
    }

    public void addLast(Mahasiswa mhs) {
        Node newNd = new Node(mhs);
        if (isEmpty()) {
            head = newNd;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNd;
        }
        size++;
    }

    public void insertAfter(String key, Mahasiswa mhs) {
        if (isEmpty()) {
            addFirst(mhs);
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data.nim.equalsIgnoreCase(key)) {
                    Node newNd = new Node(mhs);
                    newNd.next = temp.next;
                    temp.next = newNd;
                    size++;
                    break;
                } else {
                    temp = temp.next;
                }
            }
            
        }
    }

    public void insertAt(int index, Mahasiswa mhs) {
        if (isEmpty()||index==0) {
            addFirst(mhs);
        } else if(index==size) {
            addLast(mhs);
        } else {
            Node temp = head;
            for(int i=0; i<index-1; i++) {
                if (temp == null) {
                    System.out.println("Indeks di luar batas.");
                    return;
                }
                temp = temp.next;
            }
            Node newNd = new Node(mhs);
            newNd.next = temp.next;
            temp.next = newNd;
            size++;
        }
    }
}