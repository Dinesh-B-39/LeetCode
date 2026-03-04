class Solution {
    public int check(int i,int by,int[] prices,int[][] dp)
    {
        if(i==prices.length)
        {
            return 0;
        }
        if(dp[i][by]!=-1)
        {
            return dp[i][by];
        }
        if(by==0)
        {
            int b1=-prices[i]+check(i+1,1,prices,dp);
            int b2=check(i+1,0,prices,dp);
            dp[i][by]=Math.max(b1,b2);
            return dp[i][by];
        }
        else
        {
            int s1=prices[i]+check(i+1,0,prices,dp);
            int s2=check(i+1,1,prices,dp);
            dp[i][by]=Math.max(s1,s2);
            return dp[i][by];

        }
    }
    public int maxProfit(int[] prices) {
        int[][] dp=new int[prices.length][2];
        for(int i=0;i<dp.length;i++)
        {
           
                Arrays.fill(dp[i],-1);
        }
        return check(0,0,prices,dp);
    }
}