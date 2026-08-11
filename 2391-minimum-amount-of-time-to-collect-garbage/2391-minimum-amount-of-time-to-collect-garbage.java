class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int p=0,m=0,g=0,s=0;
        for(int i=0;i<garbage.length;i++)
        {
            for(char c:garbage[i].toCharArray())
            {
                if(c=='P') p=i;
                else if(c=='G') m=i;
                else if(c=='M') g=i;
                s++;
            }
        }
        for(int i=1;i<travel.length;i++)
        {
            travel[i]+=travel[i-1];
        }
        if(p!=0) s+=travel[p-1];
        if(m!=0) s+=travel[m-1];
        if(g!=0) s+=travel[g-1];
        return s;
    }
}