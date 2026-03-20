class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int ans[][] = new int[n-k+1][m-k+1];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                int arr[] = new int[k*k];
                int idx=0;
                for(int h=i;h<i+k;h++){
                    for(int v=j;v<j+k;v++){
                        arr[idx++]=grid[h][v];
                    }
                }
                Arrays.sort(arr);
                int min=999999;
                for(int v=1;v<k*k;v++){
                    if(arr[v]!=arr[v-1]){
                        min = Math.min(arr[v]-arr[v-1],min);
                    }
                }
                ans[i][j] = min==999999 ? 0 :min;
            }
        }
        return ans;
    }
}