package basic;
//
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {

    public static int binarySearch(int[] arr, int target) {
	    int left = 0;
        int right = arr.length - 1;

       while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

	        // Input the elements of the array
        System.out.println("Enter the elements of the array (in sorted order): ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

	        // Sort the array (if not already sorted)
        Arrays.sort(arr);

	        // Input the target element to search
        System.out.print("Enter the target element to search: ");
	    int target = scanner.nextInt();
	        // Perform binary search
        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
        scanner.close();
    }
}
