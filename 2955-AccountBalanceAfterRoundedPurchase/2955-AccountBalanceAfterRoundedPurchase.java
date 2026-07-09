// Last updated: 7/9/2026, 3:15:04 PM
class Solution {
    public int accountBalanceAfterPurchase(int p) {
        if (p%10!=0){
            return 100-(((p+5)/10)*10);

            
        }else
            return 100-p;
    }
}