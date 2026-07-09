// Last updated: 7/9/2026, 3:15:24 PM
class Solution {
    public int countDigits(int num) {
        int o=num,d=0;
        int c=0;
        while(num!=0){
            d=num%10;
            if(o%d==0)
             c++;
            num=num/10;
        }
        return c;

    }
}