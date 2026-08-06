class Solution {
    public int mod(int n)
    {
        int r=0,p=1;
        while(n>0)
        {
            r=n%10;
            p*=r;
            n/=10;
        }
        return p;
    }
    public int smallestNumber(int n, int t) {
        if(mod(n)%t==0) return n;
        else
        {
            while(true)
            {
                n+=1;
                if(mod(n)%t==0) return n;
            } 
        }
    }
}