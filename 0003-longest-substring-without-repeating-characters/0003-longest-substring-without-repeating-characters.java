class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int m=0;
        int l=0;
        HashSet<Character> c=new HashSet<>();
        for(int r=0;r<n;r++)
        {
            if(!c.contains(s.charAt(r)))
            {
                c.add(s.charAt(r));
                m=Math.max(m,r-l+1);
            }
            else
            {
                while(c.contains(s.charAt(r)))
                {
                    c.remove(s.charAt(l));
                    l++;
                }
                c.add(s.charAt(r));
            }
        }
        return m;
    }
}