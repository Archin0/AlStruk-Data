package Jobsheet15.Praktikum1;

public class BinaryTree08 {
    Node08 root;
    int size;

    public BinaryTree08() {
        root = null;
        size = 0;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int data) {
        if (this.isEmpty()) {
            root = new Node08(null, data, null);
            return;
        }

        Node08 current = root;
        while (true) {
            if (data > current.data) {
                if (current.left != null) {
                    current = current.left;
                } else {
                    current.left = new Node08(null, data, null);
                    break;
                }
            } else {
                if (current.right != null) {
                    current = current.right;
                } else {
                    current.right = new Node08(null, data, null);
                    break;
                }
            }
        }
    }

    public boolean find(int data) {
        boolean result = false;
        Node08 current = root;
        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    public void traversePreOrder(Node08 node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node08 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public void traverseInOrder(Node08 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    public Node08 getSuccessor(Node08 del) {
        Node08 successor = del.right;
        Node08 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        Node08 parent = root;
        Node08 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data");
            return;
        }

        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        } else {
            Node08 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else {
                if (isLeftChild) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }
            successor.left = current.left;
        }
    }

    public void addRecursive(int data) {
        root = addRecursive(root, data);
    }

    private Node08 addRecursive(Node08 node, int data) {
        if (node == null) {
            return new Node08(null, data, null);
        }

        if (data < node.data) {
            node.left = addRecursive(node.left, data);
        } else if (data > node.data) {
            node.right = addRecursive(node.right, data);
        }

        return node;
    }

    public void findMinMax() {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }

        Node08 minNode = findMin(root);
        Node08 maxNode = findMax(root);

        System.out.println("Minimum value in the tree: " + minNode.data);
        System.out.println("Maximum value in the tree: " + maxNode.data);
    }

    private Node08 findMin(Node08 node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    private Node08 findMax(Node08 node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    public void displayLeafNodes() {
        System.out.print("Leaf nodes: ");
        displayLeafNodes(root);
        System.out.println();
    }

    private void displayLeafNodes(Node08 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            displayLeafNodes(node.left);
            displayLeafNodes(node.right);
        }
    }

    public int countLeafNodes() {
        return countLeafNodes(root);
    }

    private int countLeafNodes(Node08 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }
}
