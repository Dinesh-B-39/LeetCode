class Solution {
    public int check(int[] nums,int[] dp,int ind)
    {
        if(ind<0)
        {
            return 0;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        
        int pick=nums[ind]+check(nums,dp,ind-2);
        int non_pick=0+check(nums,dp,ind-1);
        dp[ind]=Math.max(pick,non_pick);
        return dp[ind];
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        int x=check(nums,dp,nums.length-1);
        return x;
        
    }
}