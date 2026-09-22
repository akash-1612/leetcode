class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> l=new ArrayList<>();
        backtracking(l,new ArrayList<>(),1,n,k);
        return l;
    }
    private void backtracking(List<List<Integer>> l,List<Integer> temp,int start,int n,int k)
    {
        if(n<0) return;
        if(k==0&&n==0) 
        {
            l.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=9;i++)
        {
            temp.add(i);
            backtracking(l,temp,i+1,n-i,k-1);
            temp.remove(temp.size()-1);
        }
    }
}