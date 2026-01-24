class Solution {
    public boolean check(int target,int[] nums,Boolean[][] dp,int ind)
    {
        if(dp[ind][target]!=null)
        {
            return dp[ind][target];
        }
        if(target==0)
        {
            return true;
        }
        if(ind==0)
        {
            return target==nums[ind];
        }
        boolean non_take=check(target,nums,dp,ind-1);
        boolean take=false;
        if(nums[ind]<=target)
        {
            take=check(target-nums[ind],nums,dp,ind-1);
        }
        dp[ind][target]=non_take || take;
        return dp[ind][target];
    }
    public boolean canPartition(int[] nums) {
        int s=0;
        for(int i:nums)
        {
            s+=i;
        }
        if(s%2==1)
        {
            return false;
        }
        Boolean[][] dp=new Boolean[nums.length][(s/2)+1];
        return check(s/2,nums,dp,nums.length-1);
    }
}