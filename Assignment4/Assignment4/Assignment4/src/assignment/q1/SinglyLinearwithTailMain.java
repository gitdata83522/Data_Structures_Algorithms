package assignment.q1;

public class SinglyLinearwithTailMain {

	public static void main(String[] args) {
		List l = new List();
		
		l.addFirst(10);
		l.addFirst(20);
		l.addFirst(30);
		l.addLast(40);
		l.addLast(50);
		l.addLast(60);
//		l.delFirst();
		l.delLast();
		l.display();

	}

}
