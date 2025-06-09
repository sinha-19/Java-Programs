// File: SortByAnotherArray.java
// Problem: Sort array1 such that elements appear in the order of array2
// Approach: Use frequency map of array1, iterate array2 for ordering, then append leftover sorted elements
// Time: O(n log n), Space: O(n)
import java.util.*;
public class SortByAnotherArray {
    public static int[] sortByAnotherArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr1) freq.put(num, freq.getOrDefault(num, 0) + 1);
        List<Integer> result = new ArrayList<>();
        for (int num : arr2) {
            while (freq.getOrDefault(num, 0) > 0) {
                result.add(num);
                freq.put(num, freq.get(num) - 1);
            }
        }
        List<Integer> leftovers = new ArrayList<>();
        for (int num : freq.keySet()) {
            while (freq.get(num) > 0) {
                leftovers.add(num);
                freq.put(num, freq.get(num) - 1);
            }
        }
        Collections.sort(leftovers);
        result.addAll(leftovers);
        return result.stream().mapToInt(i -> i).toArray();
    }
}
