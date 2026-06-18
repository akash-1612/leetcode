class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c=0;
        int ave=0;
        for(int i=0;i<k;i++)
        {
            ave+=arr[i];
        }
        if(ave/k>=threshold) c++;
        for(int i=k;i<arr.length;i++)
        {
            ave+=arr[i]-arr[i-k];
            if(ave/k>=threshold) c++;
        }
        return c;
    }
}