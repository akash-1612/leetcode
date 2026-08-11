class Solution {
    public int largestAltitude(int[] gain) {
        int m=gain[0];
        for(int i=1;i<gain.length;i++){
            gain[i]+=gain[i-1];
            if(m<gain[i]) m=gain[i];
        }
        m=m<0?0:m;
        return m;
    }
}