class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int l=0,m=0;
        HashMap<Integer,Integer> c=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            c.put(nums[i],c.getOrDefault(nums[i],0)+1);
            while(c.get(nums[i])>k)
            {
                c.put(nums[l],c.get(nums[l])-1);
                l++;
            }
            m=Math.max(m,i-l+1);
        }
        return m;
    }
}