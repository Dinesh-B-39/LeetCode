class Solution {
    public int check(int i,int j,String s1,String s2,int[][] dp)
    {
        if(i<0 && j<0)
        {
            return 0;
        }
        if(i<0)
        {
            int z=0;
            for(int j1=j;j1>=0;j1--)
            {
                z+=(int)(s2.charAt(j1));
            }
            return z;
        }
        if(j<0)
        {
            int z=0;
            for(int i1=i;i1>=0;i1--)
            {
                z+=(int)(s1.charAt(i1));
            }
            return z;
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
            int p1=(int)(s1.charAt(i));
            int p2=(int)(s2.charAt(j));
            int k1=p1+check(i-1,j,s1,s2,dp);
            int k2=p2+check(i,j-1,s1,s2,dp);
            return dp[i][j]=Math.min(k1,k2);
        }
    }
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp=new int[s1.length()][s2.length()];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return check(s1.length()-1,s2.length()-1,s1,s2,dp);
        
    }
}