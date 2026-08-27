class Solution {
    public int check(int ind,int[] nums,int[] dp)
    {
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        if(ind==nums.length-1)
        {
            return nums[ind];
        }
        
        int s1=nums[ind];
        if(ind+2<nums.length)
        {
            s1=nums[ind]+check(ind+2,nums,dp);
        }
        int s2=0;
        if(ind+1<nums.length)
        {
            s2=check(ind+1,nums,dp);
        }
        return dp[ind]=Math.max(s1,s2);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return check(0,nums,dp);
        
    }
}