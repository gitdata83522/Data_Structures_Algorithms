package assignment.q2;

public class SinglyCircularWithTailMain {

	public static void main(String[] args) {
		List l = new List();
		
		l.addLast('s');
		l.addLast('h');
		l.addLast('e');
		l.addLast('k');
		l.addFirst('i');
		l.addFirst('h');
		l.addFirst('b');
		l.addFirst('a');
		
//		l.delFirst();
		l.delLast();
		
		
		l.display();

	}

}
