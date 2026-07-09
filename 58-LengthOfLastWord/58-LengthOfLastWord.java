// Last updated: 7/9/2026, 3:19:55 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        boolean charFound=false;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(charFound)return len;
                continue;
            }
            len++;
            charFound=true;
        }
        return len;
    }
}