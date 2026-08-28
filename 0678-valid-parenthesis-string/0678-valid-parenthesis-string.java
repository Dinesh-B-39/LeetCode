class Solution {
    public boolean check(String s,int ind,int value,Boolean[][] dp)
    {
        if(ind==s.length())
        {
            if(value==0)
            {
                return true;
            }
            return false;
        }
        if(dp[ind][value+1]!=null)
        {
            return dp[ind][value+1];
        }
        boolean b1=false;
        if(value<0)
        {
            return false;
        }
        if(s.charAt(ind)=='(')
        {
            b1=check(s,ind+1,value+1,dp);
        }
        else if(s.charAt(ind)==')')
        {
            b1=check(s,ind+1,value-1,dp);
        }
        else
        {
            boolean k1=check(s,ind+1,value+1,dp);
            boolean k2=check(s,ind+1,value-1,dp);
            boolean k3=check(s,ind+1,value,dp);
            b1=(k1 || (k2 || k3));
        }
        return dp[ind][value+1]=b1;
    }
    public boolean checkValidString(String s) {
        Boolean [][] dp=new Boolean[s.length()][s.length()+1];
        return check(s,0,0,dp);
        
    }
}