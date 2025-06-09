// File: SumOfElements.java
// Problem: Calculate the total sum of elements in the array
// Approach: Use a simple loop to add all elements
// Time: O(n), Space: O(1)
public class SumOfElements {
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }
}
