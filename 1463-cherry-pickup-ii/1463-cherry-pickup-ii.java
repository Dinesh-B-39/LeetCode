class Solution {
    int mod=Integer.MIN_VALUE;
    public int check(int[][] grid,int i,int j1,int j2,int[][][] dp)
    {
        if(j1<0 || j2<0 || j1>=grid[0].length || j2>=grid[0].length)
        {
            return mod;
        }
        if(i==grid.length-1)
        {
            if(j1==j2)
            {
                return grid[i][j1];
            }
            else
            {
                return grid[i][j1]+grid[i][j2];
            }
        }
        if(dp[i][j1][j2]!=-1)
        {
            return dp[i][j1][j2];
        }
        int maxe=Integer.MIN_VALUE;
        for(int i1=-1;i1<=1;i1++)
        {
            for(int j=-1;j<=1;j++)
            {
                maxe=Math.max(maxe,check(grid,i+1,j1+i1,j2+j,dp));
            }
        }
        if(j1==j2)
        {
            dp[i][j1][j2]= maxe+grid[i][j1];
        }
        else
        {
            dp[i][j1][j2]= maxe+grid[i][j1]+grid[i][j2];
        }
        return  dp[i][j1][j2];
    }
    public int cherryPickup(int[][] grid) {
        int[][][] dp=new int[grid.length][grid[0].length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
        }
        return check(grid,0,0,grid[0].length-1,dp);
        
    }
}