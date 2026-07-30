class Solution {
   
    public int check(int ind,String s,HashSet<String> set,int[] dp)
    {
        if(ind>=s.length())
        {
            return 1;
        }
      if(ind==s.length()-1)
      {
        if(s.charAt(ind)!='0')
        {
            return 1;
        }
        else
        {
            return 0;
        }
      }
      if(dp[ind]!=-1)
      {
        return dp[ind];
      }
      int take=0;
      int not_take=0;
      if(s.charAt(ind)!='0')
      {
        take=check(ind+1,s,set,dp);
      }
      String s1=s.substring(ind,ind+2);
      if(set.contains(s1))
      {
        not_take=check(ind+2,s,set,dp);
      }

      return dp[ind]=take+not_take;
    }
    public int numDecodings(String s) {
        HashSet<String> set=new HashSet<>();
        for(int i=1;i<27;i++)
        {
            set.add(i+"");
        }
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return check(0,s,set,dp);
        
        
    }
}