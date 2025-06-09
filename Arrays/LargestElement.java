// File: LargestElement.java
// Problem: Find the largest number in an array
// Approach: Traverse array once, update max when greater element is found
// Time: O(n), Space: O(1)
public class LargestElement {
    public static int findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }
}
