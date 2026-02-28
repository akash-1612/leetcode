class Solution {
    public int concatenatedBinary(int n) {
        long n1=0;
        for(int i=1;i<=n;i++)
        {
            int b=Integer.toBinaryString(i).length();
            n1=((n1<<b)+i)%1000000007;
        }
        return (int)n1;
    }
}