class Solution {
    public int[][] intervalIntersection(int[][] f, int[][] s) {
        int i=0,j=0,k=0;
        int [][] a=new int[f.length+s.length][2];
        if(f.length==0||s.length==0) return new int[][]{};
        while(i<f.length&&j<s.length)
        {
            System.out.println(k+" "+i+" "+j);
            if(f[i][0]<=s[j][0]){
                if(f[i][1]>=s[j][0]){
                    a[k][0]=s[j][0];
                    if(f[i][1]<s[j][1]){
                        a[k][1]=f[i][1]; 
                        i++;
                        k++;
                    }
                    else{
                        a[k][1]=s[j][1];
                        j++;
                        k++;
                    }
                }
                else{
                    i++;
                }
            }
            else{
                if(s[j][1]>=f[i][0]){
                    a[k][0]=f[i][0];
                    if(f[i][1]<s[j][1]){
                        a[k][1]=f[i][1];
                        k++;
                        i++;
                    }
                    else{
                        a[k][1]=s[j][1];
                        k++;
                        j++;
                    }
                }
                else{
                    j++;
                }
            }
        }
        return Arrays.copyOf(a,k);
    }
}