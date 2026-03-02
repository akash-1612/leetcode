class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            l.add(i);
        }
       int j=0;
        while(l.size()>1)
        {
            j=(j+k-1)%n;
            l.remove(j);
            n=l.size();
        }
        return l.get(0);
    }
}