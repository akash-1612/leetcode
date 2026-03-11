class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1') s1+="0";
            else s1+="1";
        }
        System.out.println(s1);
        int n1=Integer.parseInt(s1,2);
        return n1;
    }
}