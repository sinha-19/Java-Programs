// File: CircularRotation.java
// Problem: Circularly rotate array to right by k positions
// Approach: Use reversal algorithm for rotation
// Time: O(n), Space: O(1)
public class CircularRotation {
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }
    }
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }
}
