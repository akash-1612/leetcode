class Solution {
    public String convertToTitle(int n) {
        String s="";
        while(n>0)
        {
            n--;
            s+=(char)(65+n%26);
            n/=26;
        }
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1+=s.charAt(i);
        }
        return s1;
    }
}