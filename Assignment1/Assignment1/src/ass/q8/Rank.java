package ass.q8;

import java.util.Scanner;

public class Rank {

	public static void main(String[] args) {
		int arr[] = {10,20,15,3,4,4,1};
		
		int element,count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rank of element to be found : ");
		
		element = sc.nextInt();
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] <= element)
				count++;
		}
		System.out.println("rank of element : "+element+" is "+count);
		sc.close();
	}

}
