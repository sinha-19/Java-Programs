// File: SmallestElement.java
// Problem: Find the smallest number in an array
// Approach: Traverse array once, compare each element to current min
// Time: O(n), Space: O(1)
public class SmallestElement {
    public static int findSmallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }
}
