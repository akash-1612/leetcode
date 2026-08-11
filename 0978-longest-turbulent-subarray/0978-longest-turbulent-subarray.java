class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length==1) return 1;
        int g=1,l=1,m=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                g=l+1;
                l=1;
            }
            else if(arr[i]<arr[i-1])
            {
                l=g+1;
                g=1;
            }
            else 
            {
                g=1;
                l=1;
            }
            m=Math.max(m,Math.max(g,l));
        }
        return m;
    }
}