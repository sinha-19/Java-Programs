// File: IsSubset.java
// Problem: Check if all elements of arr2 are present in arr1
// Approach: Use HashSet for lookup
// Time: O(n + m), Space: O(n) where n = size of arr1, m = size of arr2
import java.util.*;
public class IsSubset {
    public static boolean isSubset(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) set.add(num);
        for (int num : arr2) {
            if (!set.contains(num)) return false;
        }
        return true;
    }
}
