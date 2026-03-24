class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++) s=count(s);
        return s;
    }
    public String count(String s){
        String s1="";
        int c=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1)) c++;
            else{
                s1+=c;
                s1+=s.charAt(i-1);
                c=1;
            }
        }
        s1+=c;
        s1+=s.charAt(s.length()-1);
        return s1;
    }
}