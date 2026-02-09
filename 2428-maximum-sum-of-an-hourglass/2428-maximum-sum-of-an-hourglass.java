class Solution {
    public int check(int[][] grid,int i1,int j1)
    {
        int z=0;
        for(int i=i1;i<=i1+2;i+=2)
        {
            for(int j=j1;j<=j1+2;j++)
            {
                z+=grid[i][j];
            }
        }
        z+=grid[i1+1][j1+1];
        return z;
    }
    public int maxSum(int[][] grid) {
        int maxe=Integer.MIN_VALUE;
        for(int i=0;i<=grid.length-3;i++)
        {
            for(int j=0;j<=grid[0].length-3;j++)
            {
                maxe=Math.max(maxe,check(grid,i,j));
            }
        }
        return maxe;
        
    }
}