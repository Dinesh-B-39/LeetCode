class Solution {
    int offset=0;
    public int check(int[] nums,int ind,int target,int val,int[][]dp)
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
        if(dp[ind][val+offset]!=-1)
        {
            return dp[ind][val+offset];
        }
        int plus=check(nums,ind-1,target,val+nums[ind],dp);
        int minus=check(nums,ind-1,target,val-nums[ind],dp);
        dp[ind][val+offset]=plus+minus;
        return plus+minus;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int c=0;
        for(int i:nums)
        {
            c+=i;
        }
        int[][] dp=new int[nums.length][(c*2)+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        offset=c;
        return check(nums,nums.length-1,target,0,dp);
        
    }
}