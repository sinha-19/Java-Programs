// File: RotateByK.java
// Problem: Rotate array to left by K elements
// Approach: Block Swap Algorithm (3 reversals)
// Time: O(n), Space: O(1)
public class RotateByK {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }
    }
}
