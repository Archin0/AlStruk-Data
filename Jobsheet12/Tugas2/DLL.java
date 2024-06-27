package Jobsheet12.Tugas2;

public class DLL {
    Node head;
    int size;

    public DLL() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String id, String judul, double rating) {
        Film data = new Film(id, judul, rating);
        if(isEmpty()) {
            head = new Node(null, data, null);
        } else {
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String id, String judul, double rating) {
        Film data = new Film(id, judul, rating);
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, data, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(String id, String judul, double rating, int index) {
        Film data = new Film(id, judul, rating);
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else if(index < 0 || index > size) {
            System.out.println("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
            size++;
        }
        
    }

    public int size() {
        return size;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Cetak Data Film");
            while (tmp!= null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong.");
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked Lists masih kosong.");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev =  null;
            size--;
            System.out.println("Berhasil dihapus.");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked Lists masih kosong.");
        } else if (head.next == null) {
            head = null;
            size--;
            System.out.println("Berhasil dihapus.");
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
            System.out.println("Berhasil dihapus.");
        }
    }

    public void remove(int index) {
        if (isEmpty() || index >= size) {
            System.out.println("Nilai indeks di luar batas.");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
            System.out.println("Berhasil dihapus.");
        }
    }

    public void cariByID(String idCari) {
        if (isEmpty()) {
            System.out.println("Data masih kosong.");
        } else {
            Node tmp = head;
            int i = 0;
            while(!tmp.data.id.equals(idCari)){
                tmp = tmp.next;
                i++;
            }
            System.out.println("Data ID Film berada di node ke-"+i);
            System.out.println("-IDENTITAS-");
            System.out.println("ID Film\t: "+tmp.data.id);
            System.out.println("Judul\t: "+tmp.data.judul);
            System.out.println("Rating\t: "+tmp.data.rating);
        }
    }

    public void sortByRatingDESC() {
        if (isEmpty()) {
            System.out.println("Data masih kosong.");
            return;
        } 
        boolean swapped;
        do {
            Node current = head;
            Node next = head.next;
            swapped = false;

            while (next != null) {
                if (current.data.rating < next.data.rating) {
                    Film temp = current.data;
                    current.data = next.data;
                    next.data = temp;
                    swapped = true;
                }
                current = next;
                next = next.next;
            }
        } while (swapped);
        print();
    }
}
