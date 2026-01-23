class Solution {
    public int check(int i,int j,int[][] matrix,int [][]dp)
    {
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int s1=0;
        int s2=0;
        int s3=0;
        int s4=0;
        if(j+1<matrix[0].length && matrix[i][j+1]>matrix[i][j])
        {
            s1=check(i,j+1,matrix,dp);
        }
        if(j-1>=0 && matrix[i][j-1]>matrix[i][j])
        {
            s2=check(i,j-1,matrix,dp);
        }
        if(i-1>=0 && matrix[i-1][j]>matrix[i][j])
        {
            s3=check(i-1,j,matrix,dp);
        }
        if(i+1<matrix.length && matrix[i+1][j]>matrix[i][j])
        {
            s4=check(i+1,j,matrix,dp);
        }
        int p1=Math.max(s1,s2);
        int p2=Math.max(s3,s4);
        dp[i][j]=Math.max(p1,p2)+1;
        return dp[i][j];
    }
    public int longestIncreasingPath(int[][] matrix) {
        int[][] dp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                dp[i][j]=-1;
            }
        }
        int maxe=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                int s1=check(i,j,matrix,dp);
                maxe=Math.max(maxe,s1);
            }
        }
        return maxe;
    }
}