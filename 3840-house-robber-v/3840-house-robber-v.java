class Solution {
    public long check(int ind,int val,int[] nums,int[] colors,long[][] dp)
    {
        if(ind==nums.length)
        {
            return 0;
        }
        if(dp[ind][val]!=-1)
        {
            return dp[ind][val];
        }
        long take=Integer.MIN_VALUE;
        if(val==0 ||(val==1 && colors[ind]!=colors[ind-1]))
        {
            take=(long)nums[ind]+check(ind+1,1,nums,colors,dp);
        }
        long non_take=(long)check(ind+1,0,nums,colors,dp);
        return dp[ind][val]=Math.max(take,non_take);
    }
    public long rob(int[] nums, int[] colors) {
        long[][] dp=new long[nums.length][2];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return check(0,0,nums,colors,dp);
        
    }
}