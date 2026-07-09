// Last updated: 7/9/2026, 3:16:20 PM
class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        
        int prev1 = 0; // T(0)
        int prev2 = 1; // T(1)
        int prev3 = 1; // T(2)
        
        for (int i = 3; i <= n; i++) {
            int next = prev1 + prev2 + prev3;
            prev1 = prev2;
            prev2 = prev3;
            prev3 = next;
        }
        
        return prev3; // This is T(n)
    }
}
