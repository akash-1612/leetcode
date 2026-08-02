class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int m[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<=n1&&j<=n2)
        {
            if(i==n1)
            {
                while(j<n2) m[k++]=nums2[j++];
                break;
            }
            else if(j==n2)
            {
                while(i<n1) m[k++]=nums1[i++];
                break;
            }
            else if(nums1[i]<nums2[j]) m[k++]=nums1[i++];
            else m[k++]=nums2[j++];
        }
        if(m.length%2==0) return (float)(m[m.length/2-1]+m[m.length/2])/2;
        else return m[m.length/2];
    }
}