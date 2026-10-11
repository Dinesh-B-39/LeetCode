class Solution {
    public int check(int ind,int prev,int[] nums,int[][] dp)
    {
        if(ind==nums.length)
        {
            return 0;
        }
        if(dp[ind][prev+1]!=-1)
        {
            return dp[ind][prev+1];
        }
        int c1=0;
        int c2=0;
        if(prev==-1)
        {
            c1=1+check(ind+1,ind,nums,dp);
            c2=check(ind+1,-1,nums,dp);
        }
        else
        {
            if(nums[ind]>nums[prev])
            {
                c1=1+check(ind+1,ind,nums,dp);
            }
            c2=check(ind+1,prev,nums,dp);
        }
        return dp[ind][prev+1]=Math.max(c1,c2);
    }
    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length][nums.length];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return check(0,-1,nums,dp);
        
    }
}