class Solution {
    public int check(int[] nums,int[] dp,int ind,int x)
    {
        if(ind<x)
        {
            return 0;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        int pick=nums[ind]+check(nums,dp,ind-2,x);
        int non_pick=0+check(nums,dp,ind-1,x);
        dp[ind]=Math.max(pick,non_pick);
        return dp[ind];
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int x1=-1;
        if(nums.length==1)
        {
            return nums[0];
        }
        // if(nums.length>1)
        // {
              dp[1]=nums[1];
              x1=check(nums,dp,nums.length-1,1);
            Arrays.fill(dp,-1);
        // }
      
        dp[0]=nums[0];
        int x2=check(nums,dp,nums.length-2,0);
        return Math.max(x1,x2);
        
    }
}
