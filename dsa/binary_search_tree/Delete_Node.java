package binary_search_tree;

import binary_search_tree.Create_BST.Node;

public class Delete_Node {

	public static Node delete(Node root, int val) {
		if(root.data < val) {
			root.right = delete(root.right,val);
		}else if(root.data > val) {
			root.left = delete(root.left, val);
		}else {
			//case 1 leaf node
			if(root.left == null  &&  root.right == null) {
				return null;
			}
			
			//case 2  : single child
			if(root.left == null) {
				return root.right;
			}else if(root.right == null) {
				return root.left;
			}
			
			//case 3 : both children
			Node IS = findInorderSuccessor(root.right);
			root.data = IS.data;
			root.right = delete(root.right, IS.data);
		}
		
		return root;
	}
	
	public static Node findInorderSuccessor(Node root) {
		while(root.left != null) {
			root = root.left;
		}
		
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int values[] = {5,1,3,4,2,7};
//		Node root = null;
//		
//		for(int i=0;i<values.length;i++) {
//			root = insert(root, values[i]);
//		}
	}

}
