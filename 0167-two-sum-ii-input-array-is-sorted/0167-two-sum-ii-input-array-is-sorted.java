class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[]{-1,-1};
        int l=0,r=numbers.length-1;
        while(l<r)
        {
            int s=numbers[l]+numbers[r];
            if(s==target)
            {
                arr[0]=l+1;
                arr[1]=r+1;
                break;
            }
            if(s<target) l++;
            else r--;
        }
        return arr;
    }
}