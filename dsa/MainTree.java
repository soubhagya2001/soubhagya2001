package dsa;

import java.util.Scanner;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

public class MainTree {
    Node root;

    public MainTree() {
        root = null;
    }

    public void insert(int value) {
        root = insertNode(root, value);
    }

    public Node insertNode(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.data)
            node.left = insertNode(node.left, value);
        else if (value > node.data)
            node.right = insertNode(node.right, value);

        return node;
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements to insert into the tree: ");
        int n = scanner.nextInt();

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            tree.insert(value);
        }

        System.out.println("In-order traversal:");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Pre-order traversal:");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Post-order traversal:");
        tree.postOrderTraversal(tree.root);
        System.out.println();

        scanner.close();
    }
}
