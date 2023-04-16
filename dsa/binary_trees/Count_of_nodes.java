package binary_trees;

import binary_trees.Diameter.Node;

public class Count_of_nodes {
	
	static class Node{
		int data;
		Node left, right;
		
		public Node(int data) {
			this.data =  data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static int count(Node root) {
		if(root == null) {
			return 0;
		}
		
		int lh = count(root.left);
		int rh = count(root.right);
		return lh+rh+1;  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println("Number of nodes is "+count(root));
	}

}
