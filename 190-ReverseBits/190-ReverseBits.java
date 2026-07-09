// Last updated: 7/9/2026, 3:18:04 PM
public class Solution {
    // Reverse bits of a 32-bit unsigned integer
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;          // shift result left
            result |= (n & 1);     // add the last bit of n
            n >>= 1;               // shift n right
        }
        return result;
    }

    // Test runner
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example 1
        int input1 = 43261596;
        System.out.println(sol.reverseBits(input1)); // Expected: 964176192

        // Example 2
        int input2 = 2147483644;
        System.out.println(sol.reverseBits(input2)); // Expected: 1073741822
    }
}