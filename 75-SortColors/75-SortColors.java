// Last updated: 7/9/2026, 3:19:30 PM
class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0, count1=0, count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0++;
            }
            else if(nums[i]==1){
                count1++;
            }
            else{
                count2++;
            }
        }
        int j=0;
            while(count0>0){
            nums[j]=0;
            j++;
            count0--;
        }
         while(count1>0){
            nums[j]=1;
            j++;
            count1--;
        }
          while(count2>0){
            nums[j]=2;
            j++;
            count2--;
        }
        
    }
}