// File: MedianOfArray.java
// Problem: Find the median (middle element) of an array
// Approach: Sort the array and return middle (or average of two)
// Time: O(n log n), Space: O(1)
import java.util.Arrays;
public class MedianOfArray {
    public static double median(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 1) return arr[n / 2];
        return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
    }
}
