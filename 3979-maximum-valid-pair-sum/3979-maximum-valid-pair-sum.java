class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int[] a=new int[nums.length];
        int m=nums[nums.length-1];
        for(int i=nums.length-1;i>=0;i--)
        {
            if(m<nums[i]){
                m=nums[i];
                a[i]=nums[i];

            }
            else a[i]=m;
        }
        int max=0,s=0;
        for(int i=0;i<nums.length-k;i++)
        {
            s=nums[i]+a[i+k];
            if(s>max) max=s;
        }
        return max;
    }
}