package assignment5.ques4;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter elemnent: ");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		int maxcount = 0; 
	    int element_having_max= 0; 
	    for (int i = 0; i < 5; i++) { 
	      int count = 0; 
	      for (int j = 0; j < 5; j++) { 
	        if (arr[i] == arr[j]) { 
	          count++; 
	        } 
	      } 
	  
	      if (count > maxcount) { 
	        maxcount = count; 
	        element_having_max = arr[i]; 
	      } 
	      
	    } 
	    System.out.println("Maximum time occur element "+element_having_max);
	    sc.close();
	}

}


