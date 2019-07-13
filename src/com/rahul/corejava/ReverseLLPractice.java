package com.rahul.corejava;

public class ReverseLLPractice {

	public static void main(String[] args) {
		MyLinkedList list=new MyLinkedList();
		list.insertFirst(5);
		list.insertFirst(4);
		list.insertFirst(3);
		list.insertFirst(2);
		list.insertFirst(1);
		list.display();
		list.reverseList();
		System.out.println("Reverse List :");
		list.display();

	}

}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

class MyLinkedList {
	Node head;

	public void insertFirst(int data) {

		Node temp = new Node(data);
		if (isEmpty()) {
			head = temp;
			return;
		} else {
			temp.next = head;
			head = temp;
		}

	}

	public void display()
	{
		Node current=head;
		System.out.print("[ ");
		while(current!=null)
		{	System.out.print(current.data+", ");
			current=current.next;
		}
		System.out.print(" ]");
	}
	
	public void reverseList()
	{
		Node current=head,prev=null,next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	
	
	public boolean isEmpty() {
		return head == null;
	}

}
