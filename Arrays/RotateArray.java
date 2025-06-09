// File: RotateArray.java
// Problem: Rotate array by k elements to left or right
// Approach: Use reversal algorithm for rotation
// Time: O(n), Space: O(1)
public class RotateArray {
    // Helper to reverse array between indices start and end
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }
    }
    // Rotate left by k elements
    public static void rotateLeft(int[] arr, int k) {
        k %= arr.length;
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }
    // Rotate right by k elements
    public static void rotateRight(int[] arr, int k) {
        k %= arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }
}
