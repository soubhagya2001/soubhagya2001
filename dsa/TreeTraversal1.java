package dsa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeTraversal1 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        Node root;

        BinaryTree() {
            root = null;
        }

        public void insert(int data) {
            root = insertRec(root, data);
        }

        private Node insertRec(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }

            if (data < root.data)
                root.left = insertRec(root.left, data);
            else if (data > root.data)
                root.right = insertRec(root.right, data);

            return root;
        }

        public void inorder() {
            inorderRec(root);
        }

        private void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.data + " ");
                inorderRec(root.right);
            }
        }

        public void preorder() {
            preorderRec(root);
        }

        private void preorderRec(Node root) {
            if (root != null) {
                System.out.print(root.data + " ");
                preorderRec(root.left);
                preorderRec(root.right);
            }
        }

        public void postorder() {
            postorderRec(root);
        }

        private void postorderRec(Node root) {
            if (root != null) {
                postorderRec(root.left);
                postorderRec(root.right);
                System.out.print(root.data + " ");
            }
        }

        public void levelOrder() {
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node tempNode = queue.poll();
                System.out.print(tempNode.data + " ");
                if (tempNode.left != null)
                    queue.add(tempNode.left);
                if (tempNode.right != null)
                    queue.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.print("Enter the number of nodes in the tree: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter node " + (i + 1) + " value: ");
            int value = scanner.nextInt();
            tree.insert(value);
        }

        System.out.println("Choose a tree traversal technique:");
        System.out.println("1. Inorder Traversal");
        System.out.println("2. Preorder Traversal");
        System.out.println("3. Postorder Traversal");
        System.out.println("4. Level-order Traversal");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Inorder Traversal: ");
                tree.inorder();
                break;
            case 2:
                System.out.print("Preorder Traversal: ");
                tree.preorder();
                break;
            case 3:
                System.out.print("Postorder Traversal: ");
                tree.postorder();
                break;
            case 4:
                System.out.print("Level-order Traversal: ");
                tree.levelOrder();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
