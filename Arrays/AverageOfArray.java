// File: AverageOfArray.java
// Problem: Find the average of elements in an array
// Approach: Sum all elements and divide by count
// Time: O(n), Space: O(1)
public class AverageOfArray {
    public static double average(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return arr.length == 0 ? 0 : (double) sum / arr.length;
    }
}
