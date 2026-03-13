class Solution {
    public int countDistinctIntegers(int[] nums) {
     int len=nums.length;
     int[] nums1=new int[2*len];
     System.arraycopy(nums, 0, nums1, 0, nums.length);
    int count=0;
     for(int i=0;i<len;i++)
     {
        int rev=0;
        int n=nums[i];
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        nums1[len+i]=rev;
     }   
     Arrays.sort(nums1);
     for(int i=0;i<nums1.length-1;i++)
     {
     if(nums1[i]!=nums1[i+1])
     {
        count++;
     }
     }
    return ++count;    
    }
}