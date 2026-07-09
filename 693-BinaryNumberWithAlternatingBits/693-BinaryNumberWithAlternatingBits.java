// Last updated: 7/9/2026, 3:16:44 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);   // XOR with shifted version
        return (x & (x + 1)) == 0;  // check if x is all 1s
    }

    // Simple test runner
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Testcases
        System.out.println(sol.hasAlternatingBits(5));   // true (binary 101)
        System.out.println(sol.hasAlternatingBits(7));   // false (binary 111)
        System.out.println(sol.hasAlternatingBits(11));  // false (binary 1011)
        System.out.println(sol.hasAlternatingBits(10));  // true (binary 1010)
        System.out.println(sol.hasAlternatingBits(1));   // true (binary 1)
    }
}
