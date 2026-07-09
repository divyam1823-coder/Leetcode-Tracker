// Last updated: 7/9/2026, 3:20:12 PM
class Solution {
    public int trap(int[] height) {
        //tc:o(n) sc:O(n) -->using left max and right max for at each ele then interate finf min of left max and riht ma at each level then find heifgh that water we can store udate answer gtreater than 0 na yes na  creatin space n na 
        int n=height.length;
        int leftmax[]= new int[n];
        int rightmax[]= new int[n];
        int ans=0;

        //calculate leftmax array
        leftmax[0]=height[0];//leftmost build we can't store/trap water na
        for(int i=1;i<n-1;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }

        //calculate rightmax array
        rightmax[n-1]=height[n-1]; //rightmost build we can't store/trap water na
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }

        //iterae loop finally then at each index find water we can trap by min(left,right)-h[i]
        for(int i=1;i<n-1;i++){
            int water=Math.min(leftmax[i],rightmax[i])-height[i];
            if(water>0){
                ans+=water;
            }
        }
        return ans;
    }
}