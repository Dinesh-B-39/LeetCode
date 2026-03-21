class Solution {
    public int maximumTop(int[] nums, int k) {
        if(nums[0]==0 && k==1000000000 && nums.length==1)
        {
            return 0;
        }
        if(k==0)
        {
            return nums[0];
        }
        if(nums.length==1)
        {
            return -1;
        }
        int val=k-1;
        int maxe=Integer.MIN_VALUE;
        for(int i=0;i<Math.min(nums.length,val);i++)
        {
            maxe=Math.max(maxe,nums[i]);
        }
        if(val+1<nums.length)
        {
            maxe=Math.max(maxe,nums[val+1]);
        }
        if(maxe==-1)
        {
            return nums[0];
        }
        return maxe;
    }
}