class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0,m=0;
        for(int i=0;i<nums.length;i++) 
        {
            xor^=nums[i];
            if(xor!=0) m=i;
        }
        if(xor!=0) return m+1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0) return nums.length-1;
        }
        return 0;
    }
}