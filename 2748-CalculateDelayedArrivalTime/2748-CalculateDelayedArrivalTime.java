// Last updated: 7/9/2026, 3:15:14 PM
class Solution {
    public int findDelayedArrivalTime(int a, int d) {
        if (a+d>=24){
            return (a+d)-24;
        }else
        return a+d;
    }
}