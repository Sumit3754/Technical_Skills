class Main {
    public static void main(String[] args) {

        int[] arr = {-8, 0, 6, 4, 2, -5};

        // Assume first element is the largest
        int max = arr[0];

        // Traverse the array to find the largest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print the largest element
        System.out.println("Largest element is: " + max);
    }
}

/*
Question:
Write a Java program to find the largest element in a given integer array.

Observation:
- The program assumes the first element of the array as the largest.
- It compares each element with the current maximum.
- If a larger element is found, the maximum value is updated.
- After traversing the array, the maximum variable stores the largest element.
- Time Complexity: O(n)
- Space Complexity: O(1)
*/
