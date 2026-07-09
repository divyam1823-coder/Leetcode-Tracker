// Last updated: 7/9/2026, 3:18:31 PM
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int k=n/2;
        for(Map.Entry<Integer,Integer> en:m.entrySet()){
            if(en.getValue()>k)
            return en.getKey();
        }
        return 0;

    }
}