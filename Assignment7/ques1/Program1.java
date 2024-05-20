package assignment7.ques1;

import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		
		int arr[]= {0,22,77,44,55,33,66,11,99};
		Heap h = new Heap();
		System.out.println("Array Before: "+Arrays.toString(arr));
		h.heapSort(arr);
		System.out.println("Array After: "+Arrays.toString(arr));
	}
}

class Heap {
	private int SIZE;
	public Heap() {
		SIZE = 0;
	}
	
	public void addHeap(int arr[]) {
		SIZE++;
		int ci = SIZE;
		int pi = ci / 2;
		while(pi >= 1) {
			if(arr[pi] < arr[ci])
				break;
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			ci = pi;
			pi = ci / 2;
		}
	}
	
	public int deleteHeap(int arr[]) {
		int min = arr[1];
		arr[1] = arr[SIZE];
		arr[SIZE] = min;
		SIZE--;
		int pi = 1;
		int ci = pi * 2;
		while(ci <= SIZE) {
			if(ci + 1 <= SIZE && arr[ci + 1] < arr[ci])
				ci = ci + 1;
			if(arr[pi] < arr[ci])
				break;
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			pi = ci;
			ci = pi * 2;
		}
		return min;
	}
		
	public void heapSort(int arr[]) {
		for(int i = 1 ; i < arr.length ; i++ )
			addHeap(arr);
		for(int i = 1 ; i < arr.length ; i++ )
			deleteHeap(arr);
	}

}