package assignment.q3;

public class insertNodeMain {

	public static void main(String[] args) {
		List l = new List();
		
		l.addFirst(50);
		l.addFirst(40);
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		l.insertAfter(2, 25);
		
		l.display();

	}

}
