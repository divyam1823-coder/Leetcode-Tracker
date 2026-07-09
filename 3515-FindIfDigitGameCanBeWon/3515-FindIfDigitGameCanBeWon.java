// Last updated: 7/9/2026, 3:14:56 PM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleDigit = 0, doubleDigit = 0;
        for(int num : nums) {
            if(num % 10  == num) singleDigit += num;
            else doubleDigit += num;
        }
        return singleDigit != doubleDigit;
    }
}