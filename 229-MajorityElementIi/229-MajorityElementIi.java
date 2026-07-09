// Last updated: 7/9/2026, 3:17:40 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> m=new HashMap<>();
        for (int i=0;i<n;i++){
             m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int k=n/3;
        for(Map.Entry<Integer,Integer> en:m.entrySet()){
            if(en.getValue()>k)
             l.add(en.getKey());

        }
        return l;
    }
}