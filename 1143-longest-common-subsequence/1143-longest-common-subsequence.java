class Solution {
    public int check(int ind1,int ind2,String text1,String text2,int[][] dp)
    {
        if(ind1<0 || ind2<0)
        {
            return 0;
        }
        if(dp[ind1][ind2]!=-1)
        {
            return dp[ind1][ind2];
        }
        if(text1.charAt(ind1)==text2.charAt(ind2))
        {
            dp[ind1][ind2]=1+check(ind1-1,ind2-1,text1,text2,dp);
            return dp[ind1][ind2];
        }
        else
        {
            dp[ind1][ind2]=Math.max(check(ind1-1,ind2,text1,text2,dp),check(ind1,ind2-1,text1,text2,dp));
            return dp[ind1][ind2];
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {

        int[][] dp=new int[text1.length()][text2.length()];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return check(text1.length()-1,text2.length()-1,text1,text2,dp);
        
    }
}