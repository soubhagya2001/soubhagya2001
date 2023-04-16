package binary_trees;

import binary_trees.Tree_Height.Node;

public class Diameter {

	static class Node{
		int data;
		Node left, right;
		
		public Node(int data) {
			this.data =  data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static int height(Node root) {
		if(root == null) {
			return 0;
		}
		
		int lh = height(root.left);
		int rh = height(root.right);
		return Math.max(lh, rh) +1;  
	}
	
	//Time : O(N^2)
	public static int Diam(Node root) {
		if(root == null) {
			return 0;
		}
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		int leftDiam = Diam(root.left);
		int rightDiam = Diam(root.right);
		
		int selfDiam = leftDiam + rightDiam + 1;
		
		return Math.max(selfDiam, Math.max(rightDiam, leftDiam));
		
	}
	
	
	//Time : O(n)
	public class Info{
		int ht;
		int diam;
		
		public Info(int diam, int ht){
			this.diam = diam;
			this.ht = ht;
		}
	}
	
	public static Info diameter(Node root) {
		
		if(root == null) {
			return new Info(0,0);
		}
		Info leftInfo = diameter(root.left);
		Info rightInfo = diameter(root.right);
		
		int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht);
		int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
		
		return new Info(diam, ht);
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
		
		System.out.println("Diameter is "+Diam(root));
	}

}
