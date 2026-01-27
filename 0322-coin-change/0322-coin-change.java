class Solution {
    
    int mod=1000000007;
    public int check(int[] arr,int[][] dp,int target,int ind)
    {
       if(ind==0)
       {
        if(target%arr[ind]==0)
        {
            return target/arr[ind];
        }
        else
        {
            return (int)1e9;
        }
       }
        if(target==0)
        {
            return 0;
        }
        if(ind==0)
        {
            if(arr[ind]==target)
            {
                return 1;
            }
          
        }
        if(dp[ind][target]!=-1)
        {
            return dp[ind][target];
        }
        int non_take=check(arr,dp,target,ind-1);
        int take=Integer.MAX_VALUE;
        if(arr[ind]<=target)
        {
            take=1+check(arr,dp,target-arr[ind],ind);
        }
        dp[ind][target]=Math.min(non_take,take);
        return dp[ind][target];
    }
    public int coinChange(int[] coins, int amount) {
        int [][] dp=new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        int z=check(coins,dp,amount,coins.length-1);
        int mod=(int)1e9;
        if(z==mod)
        {
            return -1;
        }
        return z;
        
    }
}