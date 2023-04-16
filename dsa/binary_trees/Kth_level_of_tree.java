package binary_trees;

import binary_trees.Binary_TreesB.Node;

public class Kth_level_of_tree {

	public static void kLevel(Node root,int level ,int k) {
		if(root == null) {
			return;
		}
		
		if(level == k) {
			System.out.print(root.data+" ");
			return;
		}
		
		kLevel(root.right,level+1,k);
		kLevel(root.left,level+1,k);
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
		
		int k =3;
		kLevel(root , 1 ,k);
	}

}
