// File: SecondSmallestLargest.java
// Problem: Find second smallest and second largest in the array
// Approach: Traverse to find min, max, secondMin, secondMax
// Time: O(n), Space: O(1)
public class SecondSmallestLargest {
    public static void findSecondSmallestAndLargest(int[] arr) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        System.out.println("Second Smallest: " + (secondMin == Integer.MAX_VALUE ? "Not Found" : secondMin));
        System.out.println("Second Largest: " + (secondMax == Integer.MIN_VALUE ? "Not Found" : secondMax));
    }
}
