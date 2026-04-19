class Solution {
    public void reverse(int[] nums)
    {
        int l=0;
        int r=nums.length-1;
        while(l<r)
        {
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l+=1;
            r-=1;
        }
    }
    public int maxDistance(int[] nums1, int[] nums2) {
        
        int maxe=0;
        for(int i=0;i<nums1.length;i++)
        {
            int left=0;
            int right=nums2.length-1;
            while(left<=right)
            {
                int mid=(left+right)/2;
                if(nums2[mid]<nums1[i])
                {
                    right=mid-1;
                }
                else if(nums2[mid]>=nums1[i] && mid>=i)
                {
                    maxe=Math.max(maxe,mid-i);
                    left=mid+1;
                }
                else
                {
                    left=mid+1;
                }
                
            }
        }
        
        return maxe;
        
    }
}