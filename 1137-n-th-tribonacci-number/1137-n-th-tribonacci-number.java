class Solution {
    public int check(int n,int[] dp)
    {
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        dp[n]=check(n-1,dp)+check(n-2,dp)+check(n-3,dp);
        return dp[n];

    }
    public int tribonacci(int n) {
        if(n==0 ||n==1)
        {
            return n;
        }
        // if(n==2);
        // {
        //     return 1
        // }
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        if(n>=2)
        {
             dp[2]=1;
        }
       
        return check(n,dp);
        
    }
}