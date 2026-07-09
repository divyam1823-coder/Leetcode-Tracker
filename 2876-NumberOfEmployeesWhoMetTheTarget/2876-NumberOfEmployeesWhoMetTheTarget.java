// Last updated: 7/9/2026, 3:15:06 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int e=0;
        for (int n:hours){
            if (n>=target)
            e++;

        }
        return e;
    }
    
}