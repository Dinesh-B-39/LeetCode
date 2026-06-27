class Solution {

    public int check(int m,int n,int i,int j,int[][] dp)
    {
        if(i==0 && j==0)
        {
          
            return 1;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int c1=0;
        int c2=0;
        if(i-1>=0)
        {
            c1=check(m,n,i-1,j,dp);
        }
        if(j-1>=0)
        {
            c2=check(m,n,i,j-1,dp);
        }
        return dp[i][j]=c1+c2;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return check(m,n,m-1,n-1,dp);

        
    }
}