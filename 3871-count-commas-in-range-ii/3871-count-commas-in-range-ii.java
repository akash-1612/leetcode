class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
        long t=0;
        if(n<1000000) return n-999;
        t+=999999L-999;
        if(n<1000000000L) return t+(n-999999L)*2;
        t+=(999999999L-999999L)*2;
        if(n<1000000000000L) return t+(n-999999999L)*3;
        t+=(999999999999L-999999999L)*3;
        if(n<1000000000000000L) return t+(n-999999999999L)*4;
        t+=(999999999999999L-999999999999L)*4;
        return t+(n-999999999999999L)*5;
    }
}