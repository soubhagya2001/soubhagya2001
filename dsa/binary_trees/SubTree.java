package binary_trees;

import binary_trees.Binary_TreesB.Node;

public class SubTree {

	public static boolean isIdentical(Node node , Node subRoot) {
		
		if(node == null  &&  subRoot == null) {
			return true;
		}else if(node == null || subRoot == null || node.data != subRoot.data) {
			return false;
		}
		
		if(!isIdentical(node.left, subRoot.left)) {
			return false;
		}
		
		if(!isIdentical(node.right , subRoot.right)) {
			return false;
		}
		
		return true; 
	}
	
	public static boolean isSubtree(Node root, Node subRoot) {
		if(root == null) {
			return false;
		}
		
		
		if(root.data == subRoot.data) {
			if(isIdentical(root,subRoot)) {
				return true;
			}
		}
		
		return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
		
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
		
		
		Node subRoot = new Node(2);
		subRoot.left = new Node(4);
		subRoot.right = new Node(5);
		
		System.out.println(isSubtree(root,subRoot)); 
	}

}
