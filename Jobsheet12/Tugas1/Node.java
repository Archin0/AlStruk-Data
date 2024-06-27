package Jobsheet12.Tugas1;

public class Node {
    Pengantri data;
    Node prev, next;

    Node(Node prev, Pengantri data, Node next) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}

