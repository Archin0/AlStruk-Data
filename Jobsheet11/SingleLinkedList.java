package Jobsheet11;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() { //pencetakan data ini tidak memperbolehkan LL dalam kondisi kosong
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println();
            System.out.print("Isi Linked List: ");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else{
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int input) {
        // node baru yang ditambahkan berisi data melalui parameter pada method addFirst
        Node ndInput = new Node(input, null);
        if (isEmpty()) { //jika kosong, maka peran head dan tail harus dimiliki node yg sama
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        //node baru yang ditambahkan berisi data melalui parameter pada method addLast
        Node ndInput = new Node(input, null);
        if (isEmpty()) { //jika kosong, maka peran head dan tail dimiliki node yg sama
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) { //jika tdk ada node selanjutnya
                                            //maka jadikan ndInput sebagai tail
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null); //selama masih ada node, lanjutkan
    }

    void insertAt(int index, int input) {
        // pastikan operasi dari method ini adalah menggeser posisi
        // node yang terletak di indeks dan node tersebut berpindah satu indeks setelahnya
        if (index < 0) {
            System.out.println("Indeks harus >= 0");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp != null) {
                    temp = temp.next;
                } else {
                    System.out.println("Indeks di luar batas");
                    return;
                }
            }
            if (temp != null) {
                temp.next = new Node(input, temp.next);
                if (temp.next.next == null) {
                    tail = temp.next;
                }
            }
        }
    }

    int getData(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf(int key) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return index;
        } else {
            return -1; // Mengembalikan -1 jika kunci tidak ditemukan
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if(isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if(head == tail) {
            head = tail = null;
        } else{
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(int key) {
        if(isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else {
            if (head.data == key) {
                removeFirst();
            } else {
                Node temp = head;
                while (temp.next != null) {
                    if (temp.next.data == key) {
                        temp.next = temp.next.next;
                        if (temp.next == null) {
                            tail = temp;
                        }
                        break;
                    }
                    temp = temp.next;
                }
            }
        }
    }

    public void removeAt(int index) {
        if(index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for(int i=0; i<index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;

            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
