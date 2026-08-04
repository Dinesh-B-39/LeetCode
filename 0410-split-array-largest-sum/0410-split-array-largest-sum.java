class Solution {
    public int check(int ind,int[] pref,int k,int prev,int[][][] dp)
    {
    
    if(ind==pref.length)
    {
        if(k==1)
        {
            return pref[pref.length-1]-pref[prev];
        }
        return Integer.MAX_VALUE;
    }
        if(k==1)
        {
            if(prev==-1)
            {
                return pref[pref.length-1];
            }
            return pref[pref.length-1]-pref[prev];
        }
        if(dp[ind][k][prev+1]!=-1)
        {
            return dp[ind][k][prev+1];
        }
        int s1=Integer.MAX_VALUE;
        if(prev==-1)
        {
            s1=Math.max(pref[ind],check(ind+1,pref,k-1,ind,dp));
        }
        else
        {
            s1=Math.max(pref[ind]-pref[prev],check(ind+1,pref,k-1,ind,dp));
        }
        int s2=check(ind+1,pref,k,prev,dp);
        return dp[ind][k][prev+1]=Math.min(s1,s2);
    }
    public int splitArray(int[] nums, int k) {
        int[] pref=new int[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            pref[i]=pref[i-1]+nums[i];
        }
        int[][][] dp=new int[nums.length][k+1][nums.length+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
            
        }
        return check(0,pref,k,-1,dp);
        
    }
}
