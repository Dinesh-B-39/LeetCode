class Solution {
    int mod=(int)1e7;
    public int check(int[] coins,int ind,int amount,int[][] dp)
    {
        if(amount==0)
        {
            return 0;
        }
        if(ind==0)
        {
            if(amount%coins[ind]==0)
            {
                return amount/coins[ind];
            }
            else
            {
                return mod;
            }
        }
        if(dp[ind][amount]!=-1)
        {
            return dp[ind][amount];
        }
        int take=Integer.MAX_VALUE;
        int non_take=check(coins,ind-1,amount,dp);
        if(coins[ind]<=amount)
        {
            take=1+check(coins,ind,amount-coins[ind],dp);
        }
        dp[ind][amount]=Math.min(take,non_take);
        return dp[ind][amount];
    }
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
           
        }
        int p=check(coins,coins.length-1,amount,dp);
        if(p==mod)
        {
            return -1;
        }
        return p;
    }
}