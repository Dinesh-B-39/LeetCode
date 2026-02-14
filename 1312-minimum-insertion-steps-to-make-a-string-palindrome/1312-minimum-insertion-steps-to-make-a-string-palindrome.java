class Solution {
    int mod=-1*(int)1e9;
    public int check(int i,int j,String s1,String s2,int[][] dp)
    {
        if(i<0 || j<0)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j))
        {
            dp[i][j]=1+check(i-1,j-1,s1,s2,dp);
            return dp[i][j];
        }
        else
        {
            int non_take1=check(i-1,j,s1,s2,dp);
            int non_take2=check(i,j-1,s1,s2,dp);
            dp[i][j]=Math.max(non_take1,non_take2);
            return dp[i][j];

        }
    }
    public int minInsertions(String s) {
        StringBuilder sb=new StringBuilder(s);
        String rev=sb.reverse().toString();
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int k=check(s.length()-1,s.length()-1,s,rev,dp);
        return s.length()-k;
    }
}