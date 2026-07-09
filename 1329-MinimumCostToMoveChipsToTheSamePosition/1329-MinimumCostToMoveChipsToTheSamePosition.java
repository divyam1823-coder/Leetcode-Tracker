// Last updated: 7/9/2026, 3:16:13 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
      int odd=0;
      int even=0;
      for(int x:position){
        if (x%2==0) even++;
        else odd++;
      }  
      return even<odd?even:odd;
    }
}