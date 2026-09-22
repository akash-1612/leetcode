class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> l=new ArrayList<>();
        backtracking(l,new ArrayList<>(),1,n,k);
        return l;
    }
    private void backtracking(List<List<Integer>> l,List<Integer> temp,int start,int n,int k)
    {
        if(k==0) 
        {
            l.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++)
        {
            temp.add(i);
            backtracking(l,temp,i+1,n,k-1);
            temp.remove(temp.size()-1);
        }
    }
}