// File: RemoveDuplicatesSorted.java
// Problem: Remove duplicates from a sorted array in-place and return new length
// Approach: Two pointers - one to track unique elements and one to iterate
// Time: O(n), Space: O(1)
public class RemoveDuplicatesSorted {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        int i = 0; // slow-runner pointer
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // new length after removing duplicates
    }
}
