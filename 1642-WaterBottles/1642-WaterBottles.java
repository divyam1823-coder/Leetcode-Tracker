// Last updated: 7/9/2026, 3:15:58 PM
class Solution {
    public int numWaterBottles(int b, int e) {
        int drink=b;
        int empty=b;
        while(empty>=e){
            int newd=empty/e;
            drink+=newd;
            empty=(empty%e)+newd;
        }
        return drink;
    }
}