class Solution {
    public int check(int[][] matrix,int[][] dp,int i,int j)
    {
        if(i<0 || j<0 || j>=matrix[0].length)
        {
            return Integer.MAX_VALUE;
        }
        if(i==0)
        {
            return matrix[i][j];
        }
        if(dp[i][j]!=Integer.MIN_VALUE)
        {
            return dp[i][j];
        }
        int s1=check(matrix,dp,i-1,j-1);
        int s2=check(matrix,dp,i-1,j);
        int s3=check(matrix,dp,i-1,j+1);
        dp[i][j]=Math.min(s1,Math.min(s2,s3))+matrix[i][j];
        return dp[i][j];
    }
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                dp[i][j]=Integer.MIN_VALUE;
            }
        }
        int mine=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++)
        {
            int z=check(matrix,dp,matrix.length-1,i);
            mine=Math.min(mine,z);
        }
        return mine;
    }
}