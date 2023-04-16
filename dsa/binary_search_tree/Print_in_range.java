package binary_search_tree;

import binary_search_tree.Create_BST.Node;

public class Print_in_range {

	public static Node insert(Node root, int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		
		if(root.data > val) {
			//left subtree
			root.left = insert(root.left,val);
		}else {
			//right subtree
			root.right = insert(root.right,val);
		}
		
		return root;
	}
	
	
	
	public static void printInRange(Node root, int k1, int k2) {
		
		if(root == null) {
			return;
		}
		if(root.data >= k1  &&  root.data <= k2) {
			printInRange(root.left,k1,k2);
			System.out.print(root.data+" ");
			printInRange(root.right,k1,k2);
		}
		
		else if(root.data < k1) {
			printInRange(root.left,k1,k2);
		}
		
		else {
			printInRange(root.right,k1,k2);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int values[] = {5,1,3,4,2,7};
		Node root = null;
		
		for(int i=0;i<values.length;i++) {
			root = insert(root, values[i]);
		}

		
		printInRange(root,5,12);
	}
}
