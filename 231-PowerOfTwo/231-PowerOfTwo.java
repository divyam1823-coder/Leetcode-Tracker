// Last updated: 7/9/2026, 3:17:38 PM
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
