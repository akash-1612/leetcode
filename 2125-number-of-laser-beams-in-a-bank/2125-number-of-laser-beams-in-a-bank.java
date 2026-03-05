class Solution {
    public int numberOfBeams(String[] bank) {
        int c=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<bank.length;i++)
        {
            int s=0;
           for(int j=0;j<bank[i].length();j++)
           {
            if(bank[i].charAt(j)=='1') s+=1;;
           }
           if(s>0) l.add(s);
        }
        System.out.println(l);
        for(int i=0;i<l.size()-1;i++)
        {
            c+=l.get(i)*l.get(i+1);
        }
        return c;
    }
}