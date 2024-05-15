package ass.q9;

import java.util.Arrays;

public class selectionSortComp {
	
	    public static int selectionSort(int arr[]) {
	        int n = arr.length;
	        int comparisons = 0;
	        
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                comparisons++; 
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	        return comparisons;
	    }
	public static void main(String[] args) {
	
		        int[] arr = {44, 11, 55, 22, 66, 33};
		        System.out.println("Array before sort :"+Arrays.toString(arr));
		        int comparisons = selectionSort(arr);
		        System.out.println("Sorted array:");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		        System.out.println("Number of comparisons: " + comparisons);
		    }
		}





