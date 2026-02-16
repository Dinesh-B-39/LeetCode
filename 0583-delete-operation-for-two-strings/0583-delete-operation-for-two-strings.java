class Solution {
    public int check(int i,int j,String s1,String s2,int[][] dp)
    {
        if(i<0 && j<0)
        {
            return 0;
        }
        if(i<0)
        {
            return j+1;
        }
        if(j<0)
        {
            return i+1;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j))
        {
            dp[i][j]=check(i-1,j-1,s1,s2,dp);
            return dp[i][j];
        }
        else
        {
            int k1=1+check(i-1,j,s1,s2,dp);
            int k2=1+check(i,j-1,s1,s2,dp);
            dp[i][j]=Math.min(k1,k2);
            return dp[i][j];
        }
    }
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()][word2.length()];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return check(word1.length()-1,word2.length()-1,word1,word2,dp);
        
    }
}