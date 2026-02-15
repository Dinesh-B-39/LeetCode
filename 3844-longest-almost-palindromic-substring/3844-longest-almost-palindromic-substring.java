class Solution {
    public int check(int l,int r,String s,int[][] dp)
    {
        if(l>r)
        {
            return 0;
        }
        if(dp[l][r]!=-1)
        {
            return dp[l][r];
        }
        if(s.charAt(l)==s.charAt(r))
        {
            dp[l][r]=check(l+1,r-1,s,dp);
         
            return dp[l][r];
            
        }
        else
        {
            int non_take1=1+check(l+1,r,s,dp);
            int non_take2=1+check(l,r-1,s,dp);
            dp[l][r]=Math.min(non_take1,non_take2);
           
            return dp[l][r];
        }
    }
    public int almostPalindromic(String s) {
        int[][] dp=new int[s.length()][s.length()];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int maxe=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(i!=j)
                {
                   int m=check(i,j,s,dp);
                    if(m<=1)
                    {
                        maxe=Math.max(maxe,j-i+1);
                    }
                }
            }
        }
        return maxe;
    }
}