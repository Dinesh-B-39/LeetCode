class Solution {
    public int check(int[][] grid,int i,int j,int score,int cost,int k,int[][][] dp)
    {
    if(cost>k)
    {
        return -300;
    }
    if(dp[i][j][cost]!=-300)
    {
        return dp[i][j][cost];
    }
    if(i==grid.length-1 && j==grid[0].length-1)
    {
        if(((grid[i][j]==1 || grid[i][j]==2) && cost+1<=k) || grid[i][j]==0)
        {
            return grid[i][j];
        }
        else
        {
           return -300;
        }
    }
    int p1=-300;
    int p2=-300;

    //RIGHT
    if(j+1<grid[0].length)
    {
        if(grid[i][j]==0)
        {
           p1=grid[i][j]+check(grid,i,j+1,score,cost,k,dp);
        }
        else if(grid[i][j]==1 || grid[i][j]==2)
        {
            p1=grid[i][j]+check(grid,i,j+1,score,cost+1,k,dp);
        }
    }
    //Down
    if(i+1<grid.length)
    {
        if(grid[i][j]==0)
        {
           p2=grid[i][j]+check(grid,i+1,j,score,cost,k,dp);
        }
        else if(grid[i][j]==1 || grid[i][j]==2)
        {
            p2=grid[i][j]+check(grid,i+1,j,score,cost+1,k,dp);
        }

    }
        dp[i][j][cost]=Math.max(p1,p2);
        return Math.max(p1,p2);
    }
    public int maxPathScore(int[][] grid, int k) {
            int[][][] dp=new int[grid.length][grid[0].length][k+1];
            for(int i=0;i<grid.length;i++)
            {
                for(int j=0;j<grid[0].length;j++)
                {
                    Arrays.fill(dp[i][j],-300);
                }
            }
            int z=check(grid,0,0,0,0,k,dp);
            if(z<0)
            {
                return -1;
            }
            return z;
       
        
    }
}