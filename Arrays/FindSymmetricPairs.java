// File: FindSymmetricPairs.java
// Problem: Find all pairs (a,b) where (b,a) also exists in the array of pairs
// Approach: Use a HashMap to store pairs and check for symmetric counterpart
// Time: O(n), Space: O(n)
import java.util.*;
public class FindSymmetricPairs {
    public static List<String> findSymmetricPairs(int[][] pairs) {
        Map<Integer, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (int[] pair : pairs) {
            int first = pair[0], second = pair[1];
            if (map.containsKey(second) && map.get(second) == first) {
                result.add("(" + first + ", " + second + ")");
            } else {
                map.put(first, second);
            }
        }
        return result;
    }
}
