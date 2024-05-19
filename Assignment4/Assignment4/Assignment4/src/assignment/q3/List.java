package assignment.q3;



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
	public List() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = newnode;
		else {
			newnode.next = head;
			head = newnode;
		}	
	}
	
	 void insertAfter(int position, int value) {
	        if (position < 0) {
	            System.out.println("Invalid position.");
	            return;
	        }
	        Node newNode = new Node(value);
	        if (head == null) {
	            if (position == 0) {
	                head = newNode;
	            } else {
	                System.out.println("Position out of range.");
	            }
	            return;
	        }
	        Node current = head;
	        for (int i = 0; i < position && current != null; i++) {
	            current = current.next;
	        }
	        if (current == null) {
	            System.out.println("Position out of range.");
	            return;
	        }
	        newNode.next = current.next;
	        current.next = newNode;
	    }

	    
	    void insertBefore(int position, int value) {
	        if (position <= 0) {
	            System.out.println("Invalid position.");
	            return;
	        }
	        Node newNode = new Node(value);
	        if (position == 1) {
	            newNode.next = head;
	            head = newNode;
	            return;
	        }
	        Node current = head;
	        for (int i = 1; i < position - 1 && current != null; i++) {
	            current = current.next;
	        }
	        if (current == null) {
	            System.out.println("Position out of range.");
	            return;
	        }
	        newNode.next = current.next;
	        current.next = newNode;
	    }
	
	public void display() {
		if(isEmpty())
			return;
		Node trav = head;
		System.out.print("List : ");
		while(trav != null){
			System.out.print(" "+trav.data);
			trav = trav.next;
		}
	}

}
