class Solution {
    public int check(String s,int ind,int[] dp)
    {
        if(ind==0 )
        {
            if(s.charAt(ind)=='0')
            {
                 return 0;
            }
            else
            {
                return 1;
            }
           
        }
        if(ind==-1)
        {
            return 1;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        int take=0;
        int non_take=0;
        if(s.charAt(ind)!='0')
        {
            take=check(s,ind-1,dp);
        }
        if(ind>=1)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(s.charAt(ind-1));
            sb.append(s.charAt(ind));
             int p=Integer.parseInt(sb.toString());
             if(s.charAt(ind-1)!='0' && p>=10 && p<=26)
            {
                non_take=check(s,ind-2,dp);
            }
        }
       dp[ind]=take+non_take;
        return take+non_take;
    }
    public int numDecodings(String s) {

        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);   
        return check(s,s.length()-1,dp);
        
    }
}