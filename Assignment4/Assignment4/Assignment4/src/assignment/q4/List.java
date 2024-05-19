package assignment.q4;

public class List {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public List() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = tail = newnode;
		else {
			newnode.next = head;
			head = newnode;
		}	
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = tail = newnode;
		else {
			tail.next = newnode;
			tail = newnode;
		}
	}
	
	public void delFirst() {
		if(isEmpty())
			return;
		else if(head == tail)
			 head = null;
		else
			head = head.next;
	}
	
	public void delLast() {
		if(isEmpty())
			return;
		else if(head == tail)
			head = tail = null;
		else {
			Node trav = head;
			while( trav.next != tail) {
				trav = trav.next;
			}
				trav.next = null;
				tail = trav;
		}
		
	}
	
	public void display() {
		Node trav = head;
		System.out.print("List : ");
		while(trav != null){
			System.out.print(" "+trav.data);
			trav = trav.next;
		}
	}
	 void displayReverse(Node node) {
	        if (node == null)
	            return;
	        
	        displayReverse(node.next);
	        
	        System.out.print(node.data + " ");
	    }

	    
	    void displayReverse() {
	        displayReverse(head);
	    }

}
