// Last updated: 7/9/2026, 3:17:30 PM
public class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;  // Negative numbers and 0 are not ugly
        }
        if (n == 1) {
            return true;  // 1 is ugly by definition
        }
        
        // Divide n by 2, 3, and 5 as long as it's divisible
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        
        // If n is 1 after divisions, it's ugly; otherwise, it's not
        return n == 1;
    }
}
