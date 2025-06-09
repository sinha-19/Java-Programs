// File: MaxProductSubarray.java
// Problem: Find contiguous subarray with maximum product
// Approach: Track max and min product ending at current index (to handle negatives)
// Time: O(n), Space: O(1)
public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxProd = nums[0], minProd = nums[0], result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = maxProd;
            maxProd = Math.max(Math.max(nums[i], maxProd * nums[i]), minProd * nums[i]);
            minProd = Math.min(Math.min(nums[i], temp * nums[i]), minProd * nums[i]);
            result = Math.max(result, maxProd);
        }
        return result;
    }
}
