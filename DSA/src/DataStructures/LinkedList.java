package DataStructures;

public class LinkedList { // status -> complete
   	
	Node head;
	static class Node{
		int data;
		Node next = null;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void addAtEnd(int data) {
		Node newnode = new Node(data);
		
		if(head == null) {
			head = newnode;
			return;
		}
		
		Node current = head;
		while(current.next != null) {
			current = current.next;	
		}
		
		current.next = newnode;
		
	}
	
	public void addAtStart(int data) {
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
	}
	
	public int delete(int key ) {
		Node temp = head;
		Node prev = null;
		
		if(temp != null && temp.data == key) {
			head = temp.next;
			return temp.data;
		}
		
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp == null) {return -1;}
		
		prev.next = temp.next;
		return temp.data;
		
	}
	
	public void addAtPos(int pos, int data) {
		Node newnode = new Node(data);
		
		if (pos == 1) {
			newnode.next = head;
			head = newnode;
		}
		
		int startpos = 1;
		Node current = head;
		while(startpos < (pos-1) && current != null) {
			current = current.next;
			startpos++;
		}
		if(current == null) {
			return;
		}
		
		newnode.next = current.next;
		current.next = newnode;
		
		}
		
	
	
	
	public void Display() {
		Node current = head;
		while(current !=null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
		
	}
	
	public static void main(String args[]) {
		LinkedList l1 = new LinkedList();
		l1.addAtEnd(1);
		l1.addAtEnd(2);
		l1.addAtEnd(3);
		l1.addAtEnd(4);
		l1.addAtEnd(5);
		l1.addAtPos(2, 7);
		System.out.println(l1.delete(5));
		
		l1.Display();
	}
	
}
