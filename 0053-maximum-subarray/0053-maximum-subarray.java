class Solution {
    public int maxSubArray(int[] nums) {
        int s=0,e=0;
        int max=0,maxsofar=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            max+=nums[i];
            maxsofar=Math.max(max,maxsofar);
            max=Math.max(0,max);
            System.out.println(max+" "+maxsofar);
        }
        return maxsofar;
    }
}