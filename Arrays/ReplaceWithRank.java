// File: ReplaceWithRank.java
// Problem: Replace each element by its rank when sorted (rank starts at 1)
// Approach: Use sorting and HashMap to assign ranks
// Time: O(n log n), Space: O(n)
import java.util.*;
public class ReplaceWithRank {
    public static int[] replaceWithRank(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sorted) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }
        return result;
    }
}
