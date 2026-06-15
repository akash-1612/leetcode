class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] s1=paragraph.toLowerCase().split("[ !?',;.]+");
        Set<String> ban=new HashSet<>();
        for (String s : banned)
        {
            ban.add(s);
        }
        for (String s : s1) {

            System.out.println(s);
        }
        int max=0;
        String m="";
        for(String s : s1)
        {
            int c=0;
            if(!(ban.contains(s)))
            {
                for(String t: s1){
                    if (s.equals(t)) c++;
                }
            } 
            if(c>max) 
            {
                max=c;
                m=s;
            }
        }
        return m;
    }
}