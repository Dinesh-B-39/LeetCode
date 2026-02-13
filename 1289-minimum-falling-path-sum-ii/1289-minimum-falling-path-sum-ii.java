class Solution {
    public int check(int i1,int j1,int[][] grid,int[][] dp)
    {
        if(i1==0)
        {
            return grid[i1][j1];
        }
        if(dp[i1][j1]!=Integer.MAX_VALUE)
        {
            return dp[i1][j1];
        }
        int mine=Integer.MAX_VALUE;
        for(int j=0;j<grid[0].length;j++)
        {
            if(j!=j1)
            {
                mine=Integer.min(mine,grid[i1][j1]+check(i1-1,j,grid,dp));
            }
        }
        dp[i1][j1]=mine;
        return dp[i1][j1];
    }
    public int minFallingPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        int mine=Integer.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++)
        {
            mine=Math.min(mine,check(grid.length-1,i,grid,dp));
        }
        return mine;
    }
}