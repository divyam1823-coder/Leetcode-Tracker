// Last updated: 7/9/2026, 3:20:55 PM
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=0;
        while (i<j){
            int h=Math.min(height[i],height[j]);
            int w=j-i;
            int area=h*w;
        
        if(area>ans){
            ans=area;

        }
        else if(height[i]<height[j]){
            i++;
            
        }else{
            j--;

        }}
        return ans;
    }
}