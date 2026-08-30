class Solution {
   int mod=(int)1e7;
    public int check(int[] arr,int ind,int target,int[][] dp)
    {
        if(target==0)
        {
            return 0;
        }
        if(ind==arr.length)
        {
            return mod;
        }
        if(dp[ind][target]!=-1)
        {
            return dp[ind][target];
        }
        int s1=Integer.MAX_VALUE;
        int s2=Integer.MAX_VALUE;
        if(arr[ind]<=target)
        {
            s1=1+check(arr,ind,target-arr[ind],dp);
        }
        s2=check(arr,ind+1,target,dp);
        return dp[ind][target]=Math.min(s1,s2);
    }
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[][] dp=new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int f=check(coins,0,amount,dp);
        if(f==mod)
        {
            return -1;
        }
        return f;
        
        
    }
}