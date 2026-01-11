class Solution {
    public int check(int[][] grid,int[][] dp,int i,int j)
    {
         if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
       if(i==0)
       {
          dp[i][j]=grid[i][j]+check(grid,dp,i,j-1);
          return dp[i][j];
       }
       if(j==0)
       {
            dp[i][j]=grid[i][j]+check(grid,dp,i-1,j);
            return dp[i][j];
       }
       
        int top=grid[i][j]+check(grid,dp,i-1,j);
        int left=grid[i][j]+check(grid,dp,i,j-1);
        dp[i][j]=Math.min(top,left);
        return dp[i][j];
    }
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
      
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
          dp[0][0]=grid[0][0];
        int n=check(grid,dp,grid.length-1,grid[0].length-1);
        return n;
    }
}