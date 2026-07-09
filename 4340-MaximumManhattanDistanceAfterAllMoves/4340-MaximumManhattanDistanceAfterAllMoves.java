// Last updated: 7/9/2026, 3:14:47 PM
class Solution {
    public int maxDistance(String moves) {
        int x = 0, y = 0, blanks = 0;

        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case '_':
                    blanks++;
                    break;
            }
        }

        return Math.abs(x) + Math.abs(y) + blanks;
    }
}