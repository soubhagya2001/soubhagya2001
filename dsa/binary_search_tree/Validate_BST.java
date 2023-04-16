package binary_search_tree;

import binary_search_tree.Create_BST.Node;

public class Validate_BST {

	public static boolean isValidateBST(Node root, Node min, Node max) {
		if(root == null) {
			return true;
		}
		
		if(min != null  &&  root.data <= min.data) {
			return false;
		}
		
		else if(max != null && root.data >= max.data) {
			return false;
		}
		
		return isValidateBST(root.left,min,root) && isValidateBST(root.right,root,max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
