class Solution {
    static final int mod = 1_000_000_007;
    public long check(int i,int j,int[][] matrix,long[][] dp)
    {
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        long s1=0;
        long s2=0;
        long s3=0;
        long s4=0;
        if(j-1>=0 && matrix[i][j-1]>matrix[i][j])
        {
            s1=check(i,j-1,matrix,dp);
        }
        if(j+1<matrix[0].length && matrix[i][j+1]>matrix[i][j])
        {
            s2=check(i,j+1,matrix,dp);
        }
        if(i-1>=0 && matrix[i-1][j]>matrix[i][j])
        {
            s3=check(i-1,j,matrix,dp);
        }
        if(i+1<matrix.length && matrix[i+1][j]>matrix[i][j])
        {
            s4=check(i+1,j,matrix,dp);
        }
        dp[i][j]=(s1+s2+s3+s4+1)%mod;
        return dp[i][j];
    }
    public int countPaths(int[][] grid) {
        long[][] dp=new long[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        long n=0;
           for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                n=(n+check(i,j,grid,dp))%mod;
               
                
            }
        }
        return (int)n;
    }
}