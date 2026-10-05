public class Main {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert function
    static Node insert(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Search function
    static boolean search(Node root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        }

        return search(root.right, key);
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 8);
        root = insert(root, 5);
        root = insert(root, 10);
        root = insert(root, 3);
        root = insert(root, 6);
        root = insert(root, 12);

        int key = 6;

        if (search(root, key)) {
            System.out.println(key + " Found");
        } else {
            System.out.println(key + " Not Found");
        }
    }
}
