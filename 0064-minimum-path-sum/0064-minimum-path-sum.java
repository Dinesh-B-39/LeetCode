class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(i==0 && j==0)
                {
                    dp[i][j]=grid[i][j];
                    continue;
                }
                int s1=Integer.MAX_VALUE;
                int s2=Integer.MAX_VALUE;
                if(i>0)
                {
                    s1=dp[i-1][j];
                }
                if(j>0)
                {
                    s2=dp[i][j-1];
                }
                dp[i][j]=grid[i][j]+Math.min(s1,s2);
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}