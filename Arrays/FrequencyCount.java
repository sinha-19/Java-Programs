// File: FrequencyCount.java
// Problem: Count the frequency of each element in an array
// Approach: Use HashMap to count occurrences
// Time: O(n), Space: O(n)
import java.util.HashMap;
public class FrequencyCount {
    public static void countFrequency(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (int key : freqMap.keySet()) {
            System.out.println(key + " -> " + freqMap.get(key));
        }
    }
}
