# Study
Purpose of the Code:

This Java program demonstrates two common search techniques:

Linear Search: A straightforward approach that checks each element in the array one by one until the target is found or the end of the array is reached.

Binary Search: A more efficient search technique that requires a sorted array. It divides the search space in half with each iteration, significantly reducing the number of comparisons.

How to Run the Program
Ensure you have Java installed on your system.
Copy the code into a file named Assignment.java.
Open a terminal or command prompt and navigate to the directory containing the file.
Compile the program using the following command:
javac Assignment.java
Run the compiled program:
java Assignment
Follow the prompts:

Enter the size of the array.
Enter the elements of the array.
Enter the target element to search for.
Time Complexity Analysis
Linear Search
Best Case: O(1) (if the target element is the first element).
Worst Case: O(n) (if the target element is not in the array or is the last element).
Binary Search
Best Case: O(1) (if the middle element matches the target in the first comparison).
Worst Case: O(log n) (in case of repeated divisions until the target is found or the search space is exhausted).
Worst Case Demonstration
The program sorts the array for Binary Search and prints the sorted array. If the target element is not found, the program demonstrates the efficiency of Binary Search compared to Linear Search.
Note on O(n) for Binary Search
Binary Search is only O(n) if the array is unsorted, as sorting takes additional time (O(n log n)). Therefore, to achieve O(log n) efficiency, the array must be sorted beforehand.
Example Output:

Enter the size of array: 5
Enter the elements of the array:
3
1
4
5
2
Enter the element to search for: 4
Linear Search: Element found at index 2
Sorted array for Binary Search: [1, 2, 3, 4, 5]
Binary Search: Element found at index 3
