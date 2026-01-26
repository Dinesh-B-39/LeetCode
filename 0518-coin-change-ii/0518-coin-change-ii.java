class Solution {
    
    public int check(int target,int[] nums,int ind,int[][] dp)
    {
        if(target==0)
        {
            return 1;
        }
        if(dp[ind][target]!=-1)
        {
            return dp[ind][target];
        }
        int val=0;
        for(int i=ind;i>=0;i--)
        {
            if(nums[i]<=target)
            {
                val+=check(target-nums[i],nums,i,dp);
            }
        }
        dp[ind][target]=val;
        return val;
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