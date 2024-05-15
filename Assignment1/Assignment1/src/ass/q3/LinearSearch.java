package ass.q3;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int arr[], int N, int key) {
		int comp = 0;
		for (int i = 0; i < N; i++) {

			if (key == arr[i])

				return i;
			comp++;
			System.out.println("No of comparisons = "+comp);
		}
		return -1;

	}

	public static void main(String[] args) {

		int arr[] = { 14, 55, 88, 33, 77, 88, 36, 20, 14, 49, 50 };

		System.out.println("Array : " + Arrays.toString(arr));

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();

		int index = linearSearch(arr, arr.length, key);

		if (index != -1)
			System.out.println("Key is found at index :" + index);
		else
			System.out.println("Key not found");

		sc.close();

	}

}
