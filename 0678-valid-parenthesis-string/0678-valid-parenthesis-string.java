class Solution {
    public boolean check(String s,int i,int k,Boolean[][] dp)
    {
        boolean s1=false;
        boolean s2=false;
        boolean s3=false;
      if(i==s.length())
      {
        return k==0;
      }
      if(dp[i][k]!=null)
      {
        return dp[i][k];
      }
      if(s.charAt(i)=='(')
      {
        s1=check(s,i+1,k+1,dp);
      }
      else if(s.charAt(i)==')')
      {
        if(k>0)
        {
            s1=check(s,i+1,k-1,dp);
        }
        else
        {
            return false;
        }
      }
      else
      {
        s1=check(s,i+1,k+1,dp);
        if(k>0)
        {
            s2=check(s,i+1,k-1,dp);
        }

        s3=check(s,i+1,k,dp);
      }
      return dp[i][k]=s1 || s2 || s3;

    }
    public boolean checkValidString(String s) {
        Boolean[][] dp=new Boolean[s.length()][s.length()];
        return check(s,0,0,dp);
        
    }
}