package assignment.q2;

public class List {
	static class Node{
		private char data;
		private Node next;
		public Node(char value) {
			data = value;
			next = null;
		}
	}
	private Node tail;
	public List() {
		tail = null;
	}
	
	public boolean isEmpty() {
		return tail == null;
	}
	
	public void addLast(char value) {
		Node newnode = new Node(value);
		if(isEmpty()) {
			tail = newnode;
			tail.next = newnode;
		}
		else {
				newnode.next = tail.next;
				tail.next = newnode;
				tail = newnode;
			}
	}
	
	public void addFirst(char value) {
		Node newnode =new Node(value);
		if(isEmpty()) {
			tail = newnode;
			tail.next = newnode;
		}
		else {
			newnode.next =tail.next;
			tail.next = newnode;
		}
			
	}
	
	public void delFirst() {
		if(isEmpty())
			return;
		else if(tail.next == tail)
			tail = null;
		else
			tail.next = tail.next.next;
	}
	
	public void delLast() {
		if(isEmpty())
			return;
		else if(tail.next == tail)
			tail =null;
		else {
			Node trav = tail.next;
			while(trav.next != tail) {
				trav = trav.next;
			}
			trav.next = tail.next;
			tail = trav;
		}
		
	}
	
	public void display() {
		if(isEmpty())
			return;
		Node trav = tail.next;
		System.out.print("List with tail : ");
		do {
			System.out.print(" "+trav.data);
			trav = trav.next;
		}while(trav != tail.next);
	}
	
	
		 
		
	}

