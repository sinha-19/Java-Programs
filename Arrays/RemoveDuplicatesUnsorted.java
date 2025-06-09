// File: RemoveDuplicatesUnsorted.java
// Problem: Remove duplicates from an unsorted array and return unique elements
// Approach: Use a HashSet to track seen elements
// Time: O(n), Space: O(n)
import java.util.*;
public class RemoveDuplicatesUnsorted {
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
}
