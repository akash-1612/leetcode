class Solution {
    public int scoreDifference(int[] nums){
        int s=0,s1=0;
        boolean f=true;
        for(int i=0;i<nums.length;i++)
            {
                if(nums[i]%2==1) f=!f;
                if(i%6==5) f=!f;
                if(f) s+=nums[i];
                else s1+=nums[i];
            }
            return s-s1;
    }
            
}