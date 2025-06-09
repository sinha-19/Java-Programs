// File: SearchElement.java
// Problem: Search for a given element in an array and return its index
// Approach: Linear search
// Time: O(n), Space: O(1)
public class SearchElement {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1; // not found
    }
}
