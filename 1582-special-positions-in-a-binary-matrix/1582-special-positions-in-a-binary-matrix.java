class Solution {
    public int numSpecial(int[][] mat) {
        int c1=0;
        int[] r=new int[mat.length];
        int[] c=new int[mat[0].length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                r[i]+=mat[i][j];
                c[j]+=mat[i][j];
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++)
            {
                if(r[i]==1 && c[j]==1 && mat[i][j]==1) c1++;
            }
        }
        return c1;
    }
}