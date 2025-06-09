// File: SortByFrequency.java
// Problem: Sort array elements by frequency, and by value if frequency same
// Approach: Use HashMap for frequency, then sort with comparator
// Time: O(n log n), Space: O(n)
import java.util.*;
public class SortByFrequency {
    public static int[] sortByFrequency(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) freq.put(num, freq.getOrDefault(num, 0) + 1);
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArr, (a, b) -> {
            int freqCompare = freq.get(a) - freq.get(b);
            if (freqCompare == 0) return a - b;
            return freqCompare;
        });
        return Arrays.stream(boxedArr).mapToInt(Integer::intValue).toArray();
    }
}
