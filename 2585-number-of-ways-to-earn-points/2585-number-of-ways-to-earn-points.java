class Solution {
    int mod=1000000007;
    public int check(int target,int[][] types,int ind,int[][][] dp)
    {
        if(ind==types.length && target==0)
        {
            return 1;
        }
        if(ind==types.length)
        {
            return 0;
        }
        if(target==0)
        {
          return 1;
        }
        if(dp[target][ind][types[ind][0]]!=-1)
        {
            return dp[target][ind][types[ind][0]];
        }
        int s1=0;
        if(types[ind][0]>0 && types[ind][1]<=target)
        {
            types[ind][0]-=1;
            s1=check(target-types[ind][1],types,ind,dp);
            types[ind][0]+=1;
        }
        int s2=check(target,types,ind+1,dp);
        return dp[target][ind][types[ind][0]]=(s1+s2)%mod;

    }
    public int waysToReachTarget(int target, int[][] types) {
        
        int[][][] dp=new int[target+1][types.length][51];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                Arrays.fill(dp[i][j],-1);
            }
            
        }
        return check(target,types,0,dp);
        
        
    }
}