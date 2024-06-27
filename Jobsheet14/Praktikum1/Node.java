package Jobsheet14.Praktikum1;

public class Node {
    int data, jarak;
    Node prev, next;

    Node(Node prev, int data, int jarak, Node next) {
        this.prev = prev;
        this.next = next;
        this.data = data;
        this.jarak = jarak;
    }
}
