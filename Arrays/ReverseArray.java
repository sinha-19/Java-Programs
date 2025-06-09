// File: ReverseArray.java
// Problem: Reverse the elements of the array in-place
// Approach: Use two-pointer technique from ends
// Time: O(n), Space: O(1)
public class ReverseArray {
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}
