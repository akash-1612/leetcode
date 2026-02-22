class Solution {
    public int f(int n)
    {
        if(n==0) return 1;
        else return n*f(n-1);
    }
    public boolean isDigitorialPermutation(int n) {
        int s=0;
        int n1=n;
        while(n>0)
        {
            int r=n%10;
            s+=f(r);
            n/=10;
        }
        String s1=Integer.toString(s);
        String s2=Integer.toString(n1);
        return isAnagram(s1,s2);
    }
        public boolean isAnagram(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        if(l1!=l2){
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}