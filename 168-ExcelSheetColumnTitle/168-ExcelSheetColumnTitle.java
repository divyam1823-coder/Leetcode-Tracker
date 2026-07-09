// Last updated: 7/9/2026, 3:18:33 PM
public class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;  // Adjust for 1-based indexing
            int remainder = columnNumber % 26;
            sb.append((char) ('A' + remainder));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}