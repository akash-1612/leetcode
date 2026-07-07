class Solution {
    public long sumAndMultiply(int n) {
        long s=0,r=0,x=0;
        String m="";
        while(n>0)
        {
            r=n%10;
            if(r>0){
            x=x*10+r;
            s+=r;
            }
            n/=10;
        }
        long rev=0,r1=0;
        while(x>0)
        {
            r1=x%10;
            rev=rev*10+r1;
            x/=10;
        }
        return rev*s;
    }
}