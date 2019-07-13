package com.tree;

import java.util.Stack;

public class BST {
	 Node root;

	public void insert(int key, String value) {
		Node newNode = new Node(key, value);
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;

			while (true) {
				parent = current;
				if (key < current.key) {
					current = current.leftChild;
					if (current == null)// parent is leaf node
					{
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					if (current == null)// parent is leaf node
					{
						parent.rightChild = newNode;
						return;
					}

				}

			}

		}

	}

	public Node findMin() {
		Node current = root;
		Node parent = null;
		while (current != null) {
			parent = current;
			current = current.leftChild;
		}
		return parent;
	}

	public Node findMax() {
		Node current = root;
		Node parent = null;
		while (current != null) {
			parent = current;
			current = current.rightChild;
		}
		return parent;
	}

	public boolean remove(int key)
	{
		Node current=root;
		Node parent=root;
		boolean isLeftChild=false;
		
		//Searching to find node with key to delete
		
		while(current.key!=key)
		{
			parent=current;
			if(current.key<key)
			{
				isLeftChild=true;
				current=current.leftChild;
			}
			else
			{	
				isLeftChild=false;
				current=current.rightChild;
				
			}
			
			if(current==null)
			return false;
			
		}
		//found the node
		Node nodeToDelete=current;
	
		
		
		//if node is a leaf node
		
		if(nodeToDelete.leftChild==null && nodeToDelete.rightChild==null)
		{
			if(nodeToDelete==root)
			{
				root=null;
			}
			else if(isLeftChild)
			{
				parent.leftChild=null;
			}
			else
			{
				parent.rightChild=null;
			}
			
		}
		// if node has one child
		
		else if(nodeToDelete.rightChild==null)
		{
			
		}
		
		
		// if node has two children
		
		
		
		
		
		
		
		
		return true;
	}
	
	public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("......................................................");
        
        while(isRowEmpty==false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for(int j=0; j<nBlanks; j++) {
                System.out.print(" ");
            }
                
            while(globalStack.isEmpty()==false) {
                Node temp = (Node)globalStack.pop(); 
                if(temp != null) {
                    System.out.print(temp.key); 
                    localStack.push(temp.leftChild); 
                    localStack.push(temp.rightChild);
                    if(temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false; 
                    }
                } else {
                    System.out.print("--"); 
                    localStack.push(null); 
                    localStack.push(null);
                }
                
                for(int j=0; j<nBlanks*2-2; j++) {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
            nBlanks = nBlanks/2;
            
            while(localStack.isEmpty()==false)
                globalStack.push( localStack.pop() ); 
            }
        System.out.println( "......................................................");
 
 }
	
	void inorder() 
    { 
        if (root == null) 
            return; 
  
  
        Stack<Node> s = new Stack<Node>(); 
        Node curr = root; 
  
        // traverse the tree 
        while (curr != null || s.size() > 0) 
        { 
  
            /* Reach the left most Node of the 
            curr Node */
            while (curr !=  null) 
            { 
                /* place pointer to a tree node on 
                   the stack before traversing 
                  the node's left subtree */
                s.push(curr); 
                curr = curr.leftChild; 
            } 
  
            /* Current must be NULL at this point */
            curr = s.pop(); 
  
            System.out.print(curr.key + " "); 
  
            /* we have visited the node and its 
               left subtree.  Now, it's right 
               subtree's turn */
            curr = curr.rightChild; 
        } 
    } 
  
	
	
	
	
	
	
	
	
	
}
