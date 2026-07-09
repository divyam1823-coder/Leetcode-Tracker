// Last updated: 7/9/2026, 3:16:01 PM
class Solution {
    public int countOdds(int low, int high) {
        // Number of odd numbers from 1 to high (inclusive)
        int oddsUpToHigh = (high + 1) / 2;
        
        // Number of odd numbers from 1 to low-1 (inclusive)
        // If low == 0, there are 0 odd numbers up to -1
        int oddsUpToLowMinus1 = (low == 0) ? 0 : (low) / 2;
        
        // The count of odd numbers between low and high (inclusive)
        return oddsUpToHigh - oddsUpToLowMinus1;
    }
}
