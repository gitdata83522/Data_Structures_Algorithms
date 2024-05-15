package ass.q6;

import java.util.Arrays;
import java.util.Scanner;

public class Q6linearSearch {
	
	public static int linearSearch(int arr[], int key, int occur){
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				count++;
				
				if(count == occur)
					return i;
			}
		}
		return -1;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int arr[]= {20,10,50,80,10,90,50,70,50,90};
		System.out.println(Arrays.toString(arr));
	    int key,occur;
	   
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter key to be searched");
	    key=sc.nextInt();
	    System.out.println("enter the occurance no");
	    occur=sc.nextInt();
	   
	   
	   int index=linearSearch(arr,key,occur);
	   
	   if(index!=-1)
	   {
		   System.out.println(occur+"th occurrence is at index :"+index);
		 //  System.out.println("no of comparisons="+(arr.length-index));
	   }
	   else
	   {
		   System.out.println("element not found");
	   }
		
	}

}
