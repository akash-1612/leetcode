class Solution {
    public int minPartitions(String n) {
        int m=0;
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)-'0'>m) m=n.charAt(i)-'0';
        }
        return m;
    }
}