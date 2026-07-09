// Last updated: 7/9/2026, 3:14:50 PM
class Solution {
    public int mirrorDistance(int ori) {

        int n=ori;
        int rev=0;
        while(n!=0){
            rev=rev*10+ n%10;
            n=n/10;
        }
        return Math.abs(ori-rev);
    }
    
}