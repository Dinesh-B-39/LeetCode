class Solution {
    public int check(int ind1,int ind2,String s,String t,int[][] dp)
    {
       if(ind2==t.length())
       {
            return 1;
       }
       if(ind1==s.length())
       {
        return 0;
       }
        if(dp[ind1][ind2]!=-1)
        {
            return dp[ind1][ind2];
        }
        int s1=0;
        int s2=0;
        if(s.charAt(ind1)==t.charAt(ind2))
        {
            s1=check(ind1+1,ind2+1,s,t,dp);
        }
        s2=check(ind1+1,ind2,s,t,dp);
        return dp[ind1][ind2]=s1+s2;
        
    }
    public int numDistinct(String s, String t) {
       
        int[][] dp=new int[s.length()][t.length()];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        
        return check(0,0,s,t,dp);
        
    }
}