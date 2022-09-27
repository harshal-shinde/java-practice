package dataStructure.linklist;

public class LinkedList {

	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	//Print list
	public static void printList() {
		Node n = head;
		while(n!= null) {
			System.out.println(n.data +" ");
			n = n.next;
		}
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
