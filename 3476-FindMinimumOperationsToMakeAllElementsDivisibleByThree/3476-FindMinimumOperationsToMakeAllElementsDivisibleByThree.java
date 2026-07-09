// Last updated: 7/9/2026, 3:15:00 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int r=0;
        for(int n:nums){
            if(n%3 !=0)
            r++;
        }
        return r;
    }
}