import java.util.Arrays;
import java.util.Scanner;

public class assigrment{

    // Linear Search implementation
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Return -1 if the target is not found
    }

    // Binary Search implementation
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids overflow for large indices

            if (array[mid] == target) {
                return mid; // Return the index of the target element
            } else if (array[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size and elements
        System.out.print("Enter the size of  array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the target element to search
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        // Perform Linear Search
        int linearResult = linearSearch(array, target);
        if (linearResult != -1) {
            System.out.println("Linear Search: Element found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Element not found.");
        }

        // Sort the array for Binary Search
        Arrays.sort(array);
        System.out.println("Sorted array for Binary Search: " + Arrays.toString(array));

        // Perform Binary Search
        int binaryResult = binarySearch(array, target);
        if (binaryResult != -1) {
            System.out.println("Binary Search: Element found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Element not found.");
        }

        scanner.close();
    }
}
