class Solution {

    public int check(int i,int j,int[][] coins,int limit,int[][][] dp)
    {
        int m = coins.length;
        int n = coins[0].length;

        // 🔴 BASE CASE (reach end)
        if(i == m-1 && j == n-1)
        {
            if(coins[i][j] < 0 && limit < 2)
            {
                return dp[i][j][limit] = 0;
            }
            else
            {
                return dp[i][j][limit] = coins[i][j];
            }
        }
        if(dp[i][j][limit] != Integer.MIN_VALUE)
        {
            return dp[i][j][limit];
        }
        if(coins[i][j] > 0)
        {
            int p1 = Integer.MIN_VALUE;
            int p2 = Integer.MIN_VALUE;

            // 🔥 MOVE DOWN
            if(i+1 < m)
            {
                p1 = coins[i][j] + check(i+1, j, coins, limit, dp);
            }
            // 🔥 MOVE RIGHT
            if(j+1 < n)
            {
                p2 = coins[i][j] + check(i, j+1, coins, limit, dp);
            }

            return dp[i][j][limit] = Math.max(p1, p2);
        }
        else
        {
            if(limit < 2)
            {
                int p1 = Integer.MIN_VALUE;
                int p2 = Integer.MIN_VALUE;
                // 🔥 SKIP CASE
                if(i+1 < m)
                {
                    p1 = check(i+1, j, coins, limit+1, dp);
                }
                if(j+1 < n)
                {
                    p2 = check(i, j+1, coins, limit+1, dp);
                }
                int y1 = Math.max(p1, p2);
                p1 = Integer.MIN_VALUE;
                p2 = Integer.MIN_VALUE;

                // 🔥 TAKE CASE
                if(i+1 < m)
                {
                    p1 = coins[i][j] + check(i+1, j, coins, limit, dp);
                }
                if(j+1 < n)
                {
                    p2 = coins[i][j] + check(i, j+1, coins, limit, dp);
                }
                int y2 = Math.max(p1, p2);
                return dp[i][j][limit] = Math.max(y1, y2);
            }
            else
            {
                int p1 = Integer.MIN_VALUE;
                int p2 = Integer.MIN_VALUE;
                if(i+1 < m)
                {
                    p1 = coins[i][j] + check(i+1, j, coins, limit, dp);
                }
                if(j+1 < n)
                {
                    p2 = coins[i][j] + check(i, j+1, coins, limit, dp);
                }

                return dp[i][j][limit] = Math.max(p1, p2);
            }
        }
    }
    public int maximumAmount(int[][] coins) {
        int[][][] dp = new int[coins.length][coins[0].length][3];

        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[i].length;j++)
            {
                Arrays.fill(dp[i][j],Integer.MIN_VALUE);
            }
        }
        // 🔥 START FROM (0,0) NOW
        int m = check(0, 0, coins, 0, dp);

        return m;
    }
}