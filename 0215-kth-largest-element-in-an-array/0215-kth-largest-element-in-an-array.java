class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            p.add(nums[i]);
        }
        int r=0;
        while(k!=0)
        {
            r=p.poll();
            k--;
        }
        return r;
    }
}