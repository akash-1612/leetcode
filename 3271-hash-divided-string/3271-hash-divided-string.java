class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i+=k){
            int value=0;
            for(int j=0;j<k;j++){
                value+=s.charAt(i+j)-'a';
            }
            value%=26;
            sb.append((char)(value+'a'));
        }
        return sb.toString();
    }
}