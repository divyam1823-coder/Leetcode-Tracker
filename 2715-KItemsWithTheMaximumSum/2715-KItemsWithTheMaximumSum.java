// Last updated: 7/9/2026, 3:15:16 PM
class Solution {
    public int kItemsWithMaximumSum(int one, int zeros, int neg, int k) {
        int r=0;
        if (k<=one)
        return k;
        else if(k<=(one+zeros))
        return one;
        else if (k>=(one+zeros))
        r=k-(one+zeros);
        return one-r;
    }
}