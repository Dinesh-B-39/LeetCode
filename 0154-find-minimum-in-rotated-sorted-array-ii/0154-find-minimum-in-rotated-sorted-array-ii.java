class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mine=Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[low]==nums[mid] && nums[mid]==nums[high])
            {
                mine=Math.min(mine,nums[mid]);
                low+=1;
                high-=1;
            }
            else if(nums[low]<=nums[mid])
            {
                
                mine=Math.min(mine,nums[low]);
                low=mid+1;
            }
            else
            {
                mine=Math.min(mine,nums[mid]);
                high=mid-1;
            }
        }
        return mine;
    }
}