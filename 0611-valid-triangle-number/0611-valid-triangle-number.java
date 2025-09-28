class Solution {
    public int bsearch(int target,int[] nums,int low,int high)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return high;
    }
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                c+=bsearch(nums[i]+nums[j],nums,j+1,nums.length-1)-j;

            }
        }
        return c;
    }
}