// Last updated: 7/9/2026, 3:15:07 PM
public class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int m = mainTank;
        int a = additionalTank;
        int distance = 0;
        int consumed_since_last = 0;
        
        while (m > 0) {
            // Consume 1 liter
            m--;
            distance += 10;
            consumed_since_last++;
            
            // Check for transfer every 5 liters consumed
            if (consumed_since_last == 5 && a > 0) {
                a--;
                m++;  // Transfer 1 liter to main tank
                consumed_since_last = 0;  // Reset counter
            }
        }
        
        return distance;
    }
}
