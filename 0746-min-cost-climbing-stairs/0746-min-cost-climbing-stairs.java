class Solution {
    public int check(int ind,int[] nums,int[] dp)
    {
        if(ind>=nums.length)
        {
            return 0;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        int s1=nums[ind]+check(ind+1,nums,dp);
        int s2=nums[ind]+check(ind+2,nums,dp);
        dp[ind]=Math.min(s1,s2);
        return dp[ind];
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        Arrays.fill(dp,-1);
        int m1=check(0,cost,dp);
        int m2=check(1,cost,dp);
        return Math.min(m1,m2);

        
    }
}