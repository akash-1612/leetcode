class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n=mat[0].length;
        k=k%n;
        for(int i=0;i<mat.length;i++)
        {
        for(int j=0;j<mat[i].length;j++){
            int l=(j-k+n)%n;
            if(mat[i][j]!=mat[i][l]) return false;
            }
        }
        return true;
    }
}