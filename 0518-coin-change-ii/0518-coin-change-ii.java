class Solution {
    
    public int check(int target,int[] nums,int ind,int[][] dp)
    {
        if(target==0)
        {
            return 1;
        }
        if(ind==0 && nums[ind]==target)
        {
            return 1;
        }
        if(ind==-1)
        {
            return 0;
        }
        if(dp[ind][target]!=-1)
        {
            return dp[ind][target];
        }
        int non_take=check(target,nums,ind-1,dp);
        int take=0;
        if(nums[ind]<=target)
        {
            take=check(target-nums[ind],nums,ind,dp);
        }
        dp[ind][target]=take+non_take;
        return take+non_take;
    }
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        return check(amount,coins,coins.length-1,dp);
        
        
    }
}