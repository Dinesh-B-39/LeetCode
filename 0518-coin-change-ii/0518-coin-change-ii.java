class Solution {
    int res=0;
    public int check(int ind,int[] arr,int k,int[][] dp)
    {
        if(ind==-1)
        {
            if(k==0)
            {
                return 1;
            }
            return 0;
        }
        if(dp[ind][k]!=-1)
        {
            return dp[ind][k];
        }
        int s1=0;
        int s2=0;
        if(arr[ind]<=k)
        {
            s1=check(ind,arr,k-arr[ind],dp);
        }
        s2=check(ind-1,arr,k,dp);
        return dp[ind][k]=s1+s2;

    }
    public int change(int amount, int[] coins) {
        Arrays.sort(coins);
        int[][] dp=new int[coins.length][amount+1];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return check(coins.length-1,coins,amount,dp);
        
        
    }
}