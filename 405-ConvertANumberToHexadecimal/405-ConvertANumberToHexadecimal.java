// Last updated: 7/9/2026, 3:17:15 PM
public class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int digit = num & 0xF;
            char c = (digit < 10) ? (char) ('0' + digit) : (char) ('a' + (digit - 10));
            sb.append(c);
            num >>= 4;
        }
        String s = sb.reverse().toString();
        int start = 0;
        while (start < s.length() - 1 && s.charAt(start) == '0') {
            start++;
        }
        return s.substring(start);
    }
}