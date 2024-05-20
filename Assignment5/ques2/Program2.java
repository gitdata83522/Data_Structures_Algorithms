package assignment5.ques2;

public class Program2 {

	public static void main(String[] args) {
		Deque dq = new Deque();
		dq.pushFirst(10);
		dq.pushFirst(27);
		dq.pushFirst(20);
		dq.pushFirst(30);
		dq.pushFirst(25);
		dq.peek();
		dq.popLast();
		dq.popFirst();
		dq.popFirst();
		dq.peek();
	}
}

class Deque{
	private List l;
	
	public Deque() {
		l=new List();
	}
	
	public void pushFirst(int value) {
		l.addFirst(value);
	}
	
	public void popFirst() {
		l.deleteFirst();
	}
	
	public void popLast() {
		l.deleteLast();
	}
	
	public void peek() {
		System.out.println(l.headData());
	}
}

class List {
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
		newnode.next = head;
		head = newnode;
	}
	
	public int getHeadData() {
		return head.data;
	}
	
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else
			head = head.next;
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(head.next==null)
			head=null;
		else {
			Node trav ;
			for(trav=head; trav.next.next!=null; trav=trav.next);
			trav.next=null;
		}
	}
	
	public void display() {
		Node trav=head;
		System.out.print("List: ");
		while(trav!=null) {
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
		System.out.println("");
	}
	
	public int headData() {
		return head.data;
	}
}
