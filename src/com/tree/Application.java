package com.tree;

public class Application {

	public static void main(String[] args) {
		BST tree = new BST();
		/*tree.insert(1, "Fifty");
		tree.insert(3, "Ten");
		tree.insert(2, "Twenty");
		tree.insert(5, "Thirty");
		tree.insert(4, "Fourty");
		System.out.println(tree.findMin().key);
		System.out.println(tree.findMax().key);
		tree.inorder();
*/
		
			tree.root = new Node(1,""); 
	        tree.root.leftChild = new Node(2,""); 
	        tree.root.rightChild = new Node(3,""); 
	        tree.root.leftChild.leftChild = new Node(4,""); 
	        tree.root.leftChild.rightChild = new Node(5,""); 
	        tree.inorder(); 

		
		
	}

}
