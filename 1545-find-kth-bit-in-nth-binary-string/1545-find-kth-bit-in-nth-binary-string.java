class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder s=new StringBuilder("0");
        while(n>=1){
            StringBuilder s1=new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1') s1.append("0");
                else s1.append("1");
            }
            s1.reverse();
            s.append("1");
            s.append(s1);
            n--;
        }
        return s.charAt(k-1);
    }
}