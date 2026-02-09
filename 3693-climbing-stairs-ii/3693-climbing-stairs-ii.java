class Solution {
    int mod=(int)1e9;
    public int check(int ind,int[] costs,int[] dp)
    {
        if(ind<0)
        {
            return mod;
        }
        if(ind==-1)
        {
            return 0;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        int s1=costs[ind]+1+check(ind-1,costs,dp);
        int s2=costs[ind]+4+check(ind-2,costs,dp);
        int s3=costs[ind]+9+check(ind-3,costs,dp);
        dp[ind]=Math.min(s1,Math.min(s2,s3));
        return dp[ind];
    }
    public int climbStairs(int n, int[] costs) {
        int[] dp=new int[costs.length];
        Arrays.fill(dp,-1);
        return check(costs.length-1,costs,dp)-1000000000;
        
    }
}