class Solution {
    public int check(int[][] dp,int[][] grid,int i,int j)
    {
        if(i<0 ||j<0 || grid[i][j]==1)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int top=check(dp,grid,i-1,j);
        int left=check(dp,grid,i,j-1);
        dp[i][j]=top+left;
        return top+left;
    

    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        dp[0][0]=1;
        int n=check(dp,grid,grid.length-1,grid[0].length-1);
        return n;
        
    }
}