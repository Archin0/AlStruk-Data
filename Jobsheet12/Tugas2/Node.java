package Jobsheet12.Tugas2;

public class Node {
    Film data;
    Node prev, next;

    Node(Node prev, Film data, Node next) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}
