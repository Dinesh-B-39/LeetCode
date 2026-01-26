class Solution {
    public int check(int[] nums,int ind,int target,int val)
    {
        if(ind==0)
        {
             if(val+nums[ind]==target && val-nums[ind]==target)
            {
                return 2;
            }
            if(val+nums[ind]==target || val-nums[ind]==target)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        int plus=check(nums,ind-1,target,val+nums[ind]);
        int minus=check(nums,ind-1,target,val-nums[ind]);
        return plus+minus;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return check(nums,nums.length-1,target,0);
        
    }
}