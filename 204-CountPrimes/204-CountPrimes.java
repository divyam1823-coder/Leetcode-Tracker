// Last updated: 7/9/2026, 3:17:48 PM
class Solution {
    
    public int countPrimes(int n) {

        
        boolean[] Prime = new boolean[n];
        for (int i = 2; i < n; i++) 
            Prime[i] = true;

        for (int i = 2; i * i < n; i++) {
            if (Prime[i]) {
                for (int j = i * i; j < n; j += i) {
                    Prime[j] = false;
        
                }
            }
        }
        int c = 0;
        for (int i = 2; i < n; i++) {
            if (Prime[i]) 
                c++;
        }
        return c;
    
    }  
}
