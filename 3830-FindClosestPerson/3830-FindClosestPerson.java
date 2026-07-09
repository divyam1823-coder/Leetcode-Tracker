// Last updated: 7/9/2026, 3:14:51 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        int a=Math.abs(z-x);
        int b=Math.abs(y-z);
        if (a>b)
        {return 2;}
        else if(a==b) {return 0;}
        else {return 1;}
    }
    
}