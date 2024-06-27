package Jobsheet15.Praktikum1;

public class Node08 {
    int data;
    Node08 left, right;
    public Node08 next;

    public Node08() {

    }

    public Node08(Node08 left, int data, Node08 right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
