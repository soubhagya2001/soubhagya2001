package binary_search_tree;

import java.util.ArrayList;

import binary_search_tree.Create_BST.Node;

public class Leaf_To_Node {
	//Node creating process
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
	
	//printing Node
	public static void printPath(ArrayList<Integer> path) {
		for(int i=0;i<path.size();i++) {
			System.out.print(path.get(i)+"-->");
		}
		
		System.out.println("null");
	}
	
	//printing all nodes from root to leaf
	public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
		
		if(root == null) {
			return;
		}
		path.add(root.data);
		if(root.left == null  &&  root.right == null) {
			printPath(path);
		}
		
		printRoot2Leaf(root.left, path);
		printRoot2Leaf(root.right,path);
		path.remove(path.size()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[] = {8,5,3,1,4,6,10,11,14};
		Node root = null;
		
		for(int i=0;i<values.length;i++) {
			root = insert(root,values[i]);
		}
		
		
		printRoot2Leaf(root, new ArrayList<>());
	}

}
