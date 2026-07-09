// Last updated: 7/9/2026, 3:17:20 PM
class Solution {
    public char findTheDifference(String s, String t) {
        
        int ssum=0,tsum=0;
        for(int i=0;i<s.length();i++){
            ssum += s.charAt(i);
        }
        for(int j=0;j<t.length();j++){
            tsum+=t.charAt(j);
        }
        return (char)(tsum-ssum);
    }
}
    