// Last updated: 7/9/2026, 3:16:00 PM
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        long count = 0;
        for (int val : freq.values()) {
            count += (long) val * (val - 1) / 2;
        }
        return (int) count;
    }
}