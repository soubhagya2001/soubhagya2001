package binary_trees;

import binary_trees.Count_of_nodes.Node;

public class Sum_of_nodes {
	
	public static int Sum(Node root) {
		if(root == null) {
			return 0;
		}
		
		int Lsum = Sum(root.left);
		int Rsum = Sum(root.right);
		
		return Lsum+Rsum+root.data;
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
		
		System.out.println("Sum of all the nodes is "+Sum(root));
	}

}
