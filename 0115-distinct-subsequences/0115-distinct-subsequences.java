class Solution {
    public int check(int i,int j,String s,String t,int[][] dp)
    {
        if(j<0)
        {
            return 1;
        }
        if(i<0)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s.charAt(i)==t.charAt(j))
        {
            int s1=check(i-1,j-1,s,t,dp);
            int s2=check(i-1,j,s,t,dp);
            dp[i][j]=s1+s2;
        }
        else
        {
             dp[i][j]=check(i-1,j,s,t,dp);
        }
        return dp[i][j];
    }
    public int numDistinct(String s, String t) {
        int[][] dp=new int[s.length()][t.length()];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return check(s.length()-1,t.length()-1,s,t,dp);
    }
}