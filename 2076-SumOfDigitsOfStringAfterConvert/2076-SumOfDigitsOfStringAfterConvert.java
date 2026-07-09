// Last updated: 7/9/2026, 3:15:48 PM
class Solution {
    public int getLucky(String s, int k) {
        // Step 1: Convert the string to a number string by replacing each letter with its position
        StringBuilder numStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            int pos = c - 'a' + 1;
            numStr.append(pos);
        }
        
        // Step 2: Perform the digit sum operation k times
        for (int i = 0; i < k; i++) {
            int digitSum = 0;
            for (char digit : numStr.toString().toCharArray()) {
                digitSum += digit - '0';
            }
            numStr = new StringBuilder(String.valueOf(digitSum));
        }
        
        // Return the final integer
        return Integer.parseInt(numStr.toString());
    }
}