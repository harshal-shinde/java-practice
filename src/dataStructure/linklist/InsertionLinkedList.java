package dataStructure.linklist;

import dataStructure.linklist.LinkedList.Node;

public class InsertionLinkedList {

	static Node head;
	
	//Print list
	public static void printList() {
		Node head = null;
		Node n = head;
		while(n!= null) {
			System.out.println(n.data +" ");
			n = n.next;
		}
	}
	
	//Add node at the front of the list
	public static void pushFront(int newData) {
		//Allocate the new node and put data
		Node newNode = new Node(newData);
		
		//Make next of newly added Node as head
		newNode.next = head;
		
		//Move the head to point to new node
		head = newNode;
		
	}
	
	//InsertAfter
	public static void insertAfter(Node prevNode, int data) {
		
		//Check if the given node is null or not
		if(prevNode == null) {
			System.out.println("The given previous node cannot be null");
		}
		// allocate the node & put in the data
		Node newNode = new Node(data);
		
		//Make next of new node as next of previous node
		newNode.next = prevNode.next;
		
		//Make next of prev as new node
		
		prevNode.next = newNode;
	}

	//Add node at the end 
	
	@SuppressWarnings("null")
	public static void insertEnd(int data) {
		
		Node newNode = new Node(data);
		
		//Check list is empty or not
		if(head == null) {
			head = newNode;
			return;
		}
		
		//This new node is going to be the last node, 
		//so make next of it as null
		newNode.next = null;
		
		//Else traverse till the last node
		Node last = head;
		
		while(last !=null) {
			last = last.next;
		}
		
		//Change the next of last node
		last.next = newNode;
		return;
		
	}
	
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second;
		second.next = third;
		
		printList();
	}
	
}
