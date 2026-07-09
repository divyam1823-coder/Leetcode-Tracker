// Last updated: 7/9/2026, 3:15:56 PM
class Solution {
    public int diagonalSum(int[][] a) {
        int k=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++)
            if (i+j==a.length-1  || i==j){
                
                k+= a[i][j];
                
            }
        }
        return k;
    }
}