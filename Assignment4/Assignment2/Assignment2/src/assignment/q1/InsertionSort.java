package assignment.q1;

import java.util.Arrays;

public class InsertionSort {
	
	public static int insertinSort(int arr[],int N) {
		int comp = 0;
		for(int i = 1; i < N; i++) {
			
			int temp = arr[i];
			
			int j = i - 1;
			
			while(j >= 0 && arr[j] > temp) {
				
				arr[j+1] = arr[j];
				j--;
				
				comp++;
				
				System.out.println("Number of comparisons = "+comp);
			}
			arr[j+1] = temp;
		}
		return comp;

	}

	public static void main(String[] args) {
		
		int arr[] = {55, 44, 22, 66, 11, 33};
		
		System.out.println("Array before sort : "+Arrays.toString(arr));
		
		insertinSort(arr,arr.length);
		
		System.out.println("Array after sort : "+Arrays.toString(arr));
		

	}
	
}
