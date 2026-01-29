class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] dp=new int[matrix.length][matrix[0].length];
        int maxe=Integer.MIN_VALUE;
        for(int i=0;i<matrix[0].length;i++)
        {
            if(matrix[0][i]=='1')
            {
                dp[0][i]=1;
                maxe=1;
            }
            else
            {
                dp[0][i]=0;
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]=='1')
            {
                dp[i][0]=1;
                maxe=1;
            }
            else
            {
                dp[i][0]=0;
            }
        }
        
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j]=='1')
                {
                    int x=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                    dp[i][j]=x+1;
                    maxe=Math.max(maxe,dp[i][j]);
                }
                else
                {
                    dp[i][j]=0;
                }
                maxe=Math.max(maxe,dp[i][j]);
            }
        }
        return maxe*maxe;
        
    }
}