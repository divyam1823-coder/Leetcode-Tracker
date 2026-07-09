// Last updated: 7/9/2026, 3:16:22 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxRight = -1; // last element always becomes -1
        
        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = maxRight;   // replace with greatest element to the right
            if (current > maxRight) {
                maxRight = current; // update maxRight
            }
        }
        return arr;
    }
}