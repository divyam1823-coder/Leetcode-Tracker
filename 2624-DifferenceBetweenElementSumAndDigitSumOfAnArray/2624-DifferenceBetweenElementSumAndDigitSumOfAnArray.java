// Last updated: 7/9/2026, 3:15:22 PM
class Solution {
    public int differenceOfSum(int[] nums) {
      int sum=0;
      int digi=0;
      int count=0;
      for(int num:nums){
        sum+=num;
        while(num!=0){
          digi+= num%10;
          num=num/10;
        }

      }
      return Math.abs(sum - digi);
    }
    
}