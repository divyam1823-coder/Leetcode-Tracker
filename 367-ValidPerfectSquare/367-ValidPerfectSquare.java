// Last updated: 7/9/2026, 3:17:24 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        for (long i = 1; i * i <= num; i++) {
        if (i * i == num) {
            return true;
        }
    }
    return false;
    }
}