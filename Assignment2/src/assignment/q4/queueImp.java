package assignment.q4;

public class queueImp {
	private int arr[];
	private int front, rear;
	private final int SIZE;
	
	public queueImp(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
	}
	
	public void push(int value) {
		rear++;
		arr[rear] = value;
	}
	
	public void pop() {
		front++;
	}
	
	public int peek() {
		return arr[front];
	}
	
	public boolean isFull() {
		return rear == SIZE;
	}
	
	public boolean isEmpty() {
		return rear == front;
	}

}
