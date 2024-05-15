package ass.q3;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
	public static int binarySearchwithLoop(int arr[], int N, int key) {

		int left = 0, right = N - 1, mid, comp = 0;

		while (left <= right) {
			comp++;
			System.out.println("No of comparisons = "+comp);
			mid = (left + right) / 2;

			if (key == arr[mid]) 
				
				return mid;
				
			else if (key < arr[mid])

				right = mid - 1;

			else

				left = mid + 1;
			
			
		}

		return -1;
	}

	public static int binarySearchwithRecursion(int arr[], int left, int right, int key) {

		if (left > right)
			return -1;

		int mid = (left + right) / 2;

		if (key == arr[mid])

			return mid;

		else if (key < arr[mid])

			return binarySearchwithRecursion(arr, left, mid - 1, key);

		else

			return binarySearchwithRecursion(arr, mid + 1, right, key);

	}

	public static void main(String[] args) {

		int arr[] = { 1, 23, 32, 45, 50, 61, 76, 84 };

		System.out.println("Array : " + Arrays.toString(arr));

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();

		int index = binarySearchwithLoop(arr, arr.length - 1, key);
//		int index = binarySearchwithRecursion(arr, 0, arr.length - 1, key);

		if (index != -1)
			System.out.print("Key found at index " + index);
		else
			System.out.print("Key not found");

		sc.close();

	}

}
