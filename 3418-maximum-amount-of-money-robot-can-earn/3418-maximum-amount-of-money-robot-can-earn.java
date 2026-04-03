class Solution {

    public int check(int i,int j,int[][] coins,int limit,int[][][] dp)
    {

        if(i==0 && j==0)
        {
            if(coins[i][j]<0 && limit<2)
            {
                return 0;
            }
            else
            {
                 return coins[i][j];
            }   
        }
        if(j<0 ||i<0)
        {
            return Integer.MIN_VALUE;
        }
        if(dp[i][j][limit]!=Integer.MIN_VALUE)
        {
            return dp[i][j][limit];
        }
        if(coins[i][j]>0)
        {
            return dp[i][j][limit]=coins[i][j]+Math.max(check(i-1,j,coins,limit,dp),check(i,j-1,coins,limit,dp));
        }
        else
        {
            if(limit<2)
            {
                int y1=Math.max(check(i-1,j,coins,limit+1,dp),check(i,j-1,coins,limit+1,dp));
                int y2=coins[i][j]+Math.max(check(i-1,j,coins,limit,dp),check(i,j-1,coins,limit,dp));
                return dp[i][j][limit]=Math.max(y1,y2);
            }
            else
            {
                return dp[i][j][limit]=coins[i][j]+Math.max(check(i-1,j,coins,limit,dp),check(i,j-1,coins,limit,dp));
            }
        }
    }
    public int maximumAmount(int[][] coins) {
        int[][][] dp=new int[coins.length][coins[0].length][3];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            {
                 Arrays.fill(dp[i][j],Integer.MIN_VALUE);
            }
           
        }
        int m=check(coins.length-1,coins[0].length-1,coins,0,dp);
       
        return m;
    }
    
}