// File: RearrangeIncDec.java
// Problem: Rearrange array such that first half is increasing and second half is decreasing
// Approach: Sort the array, then print first half as is and second half in reverse
// Time: O(n log n), Space: O(1)
import java.util.Arrays;
public class RearrangeIncDec {
    public static void rearrange(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        System.out.print("Increasing: ");
        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nDecreasing: ");
        for (int i = n - 1; i >= n / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
