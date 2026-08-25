class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> a=new HashSet<>();
        for(int i=0;i<nums.length;i++) a.add(nums[i]);
        int i=1;
        while(true)
        {
            if(!a.contains(i*k)) return i*k;
            else i++;
        }
    }
}