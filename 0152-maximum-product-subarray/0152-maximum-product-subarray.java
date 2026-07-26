class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int l=1,r=1;
        for(int i=0;i<nums.length;i++)
        {
            l=(l==0?1:l)*nums[i];
            r=(r==0?1:r)*nums[nums.length-1-i];
            max=Math.max(max,Math.max(l,r));
        }
        return max;
    }
}