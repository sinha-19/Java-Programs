// File: FindRepeatingElements.java
// Problem: Find all elements that appear more than once in the array
// Approach: Use a HashMap to count frequencies and then collect duplicates
// Time: O(n), Space: O(n)
import java.util.*;
public class FindRepeatingElements {
    public static List<Integer> findRepeating(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}
