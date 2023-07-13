package basic;

import java.util.Scanner;

public class LinearSearchExample {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
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
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the target element to search
        System.out.print("Enter the target element to search: ");
        int target = scanner.nextInt();

        // Perform linear search
        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}

