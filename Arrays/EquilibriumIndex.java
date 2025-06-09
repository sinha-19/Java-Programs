// File: EquilibriumIndex.java
// Problem: Find index where sum of elements left equals sum of elements right
// Approach: Calculate total sum; traverse and keep track of left sum to find equilibrium
// Time: O(n), Space: O(1)
public class EquilibriumIndex {
    public static int findEquilibriumIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) totalSum += num;
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i]; // totalSum now is right sum for index i
            if (leftSum == totalSum) return i;
            leftSum += arr[i];
        }
        return -1; // No equilibrium index
    }
}
