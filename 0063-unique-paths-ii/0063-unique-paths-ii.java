class Solution {
    public int check(int[][] grid,int[][] dp,int i,int j)
    {
        if(i<0 || j<0 || grid[i][j]==1)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int top=check(grid,dp,i-1,j);
        int left=check(grid,dp,i,j-1);
        dp[i][j]=top+left;
        return top+left;
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        dp[0][0]=1;
        int m=check(grid,dp,grid.length-1,grid[0].length-1);
        return m;
    }
}