class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int rows = grid.length,cols = grid[0].length;
        int n = rows*cols;
        k = k%n;
        int[] arr = new int[n];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i*cols+j] = grid[i][j];
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i=n-k;i<n;i++){
            if(temp.size() == cols){
                res.add(new ArrayList<>(temp));
                temp.clear();
                temp.add(arr[i]);
            }
            else    temp.add(arr[i]);
        }

        for(int i=0;i<n-k;i++){
            if(temp.size() < cols){
                temp.add(arr[i]);
            }
            else{
              res.add(new ArrayList<>(temp));
                temp.clear();
                temp.add(arr[i]);  
            } 
        }
        if(temp.size() == cols) res.add(temp);
        return res;
    }
}