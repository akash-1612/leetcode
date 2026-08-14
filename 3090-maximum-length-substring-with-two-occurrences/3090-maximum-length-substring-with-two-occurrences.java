class Solution {
    public int maximumLengthSubstring(String s) {
        int m=0;
        for(int i=0;i<s.length();i++)
        {
            int c=0,j=i;
            HashMap<Character,Integer> h=new HashMap<>();
            while(j<s.length()&&h.getOrDefault(s.charAt(j),0)<2)
            {
                h.put(s.charAt(j),h.getOrDefault(s.charAt(j),0)+1);
                c++;
                j++;
            }
            h.clear();
            m=m<c?c:m;
        }
        return m;
    }
}