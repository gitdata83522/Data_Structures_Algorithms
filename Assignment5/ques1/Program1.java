package assignment5.ques1;

public class Program1 {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(20);
		s.peek();
		s.push(30);
		s.push(40);
		s.pop();
		s.peek();
		s.pop();
		s.pop();
		s.pop();
		s.peek();
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
	
	public void display() {
		Node trav=head;
		System.out.print("List: ");
		while(trav!=null) {
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
		System.out.println("");
	}
}

class Stack{
	private List l;
	
	public Stack() {
		l=new List();
	}
	
	public void push(int value) {
		l.addFirst(value);
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		l.deleteFirst();
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Peeked data "+l.getHeadData());
	}
	
	public boolean isEmpty() {
		return l.isEmpty();
	}
}
