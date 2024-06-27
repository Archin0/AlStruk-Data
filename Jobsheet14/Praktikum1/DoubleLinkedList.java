package Jobsheet14.Praktikum1;

public class DoubleLinkedList {
    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if(isEmpty()) {
            head = new Node(null, item, jarak, null);
        } else {
            Node newNode = new Node(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, jarak, null);
            current.next = newNode;
            size++;
        }
    }

    // public void add(int item, int index) throws Exception {
    //     if (isEmpty()) {
    //         addFirst(item, jarak);
    //     } else if(index < 0 || index > size) {
    //         throw new Exception("Nilai indeks di luar batas");
    //     } else {
    //         Node current = head;
    //         int i = 0;
    //         while (i < index) {
    //             current = current.next;
    //             i++;
    //         }
    //         if (current.prev == null) {
    //             Node newNode = new Node(null, item, current);
    //             current.prev = newNode;
    //             head = newNode;
    //         } else {
    //             Node newNode = new Node(current.prev, item, current);
    //             newNode.prev = current.prev;
    //             newNode.next = current;
    //             current.prev.next = newNode;
    //             current.prev = newNode;
    //         }
    //         size++;
    //     }
        
    // }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp!= null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong.");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev =  null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int tujuan) {
        Node current = head;
            while (current!=null) {
                if (current.data == tujuan) {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    } else {
                        head = current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                    size--;
                    break;
                }
                current = current.next;
            }
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }  

    public int get(int index) throws Exception {
        if (isEmpty()|| index < 0 || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for(int i=0; i<index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty()||index>=size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node tmp = head;
        for (int i=0; i<index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public boolean contains(int item) {
        Node current = head;
        while (current != null) {
            if (current.data == item) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void updateJarak(int asal, int tujuan, int newJarak) throws Exception {
        Node current = head;
        while (current != null) {
            if (current.data == tujuan) {
                current.jarak = newJarak;
                System.out.println("Jarak antara "+asal+" dan "+tujuan+" berhasil diubah.");
                break;
            }
            current = current.next;
        }
        if (current == null) {
            throw new Exception("Node tujuan tidak ditemukan.");
        }
    }
}
