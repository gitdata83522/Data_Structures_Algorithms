package ass.q5;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearchDescending {
    public static int binarySearchDescending(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid; 
            } else if (arr[mid] < key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {42, 23, 16, 15, 8, 4};
        System.out.println("Array :"+Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter key to be searched : ");
       int key = sc.nextInt();
        int result = binarySearchDescending(arr, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
