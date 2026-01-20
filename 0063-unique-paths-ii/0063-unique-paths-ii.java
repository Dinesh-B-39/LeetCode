class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        if(grid[0][0]!=1)
        {
            dp[0][0]=1;
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(i==0 && j==0)
                {
                    continue;
                }
                if(grid[i][j]==1)
                {
                    dp[i][j]=0;
                }
                else
                {
                    int top=0;
                    int left=0;
                    if(i>0)
                    {
                        top=dp[i-1][j];
                    }
                    if(j>0)
                    {
                        left=dp[i][j-1];
                    }
                    dp[i][j]=top+left;
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}