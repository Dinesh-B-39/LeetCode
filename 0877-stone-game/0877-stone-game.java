class Solution {
    public int check(int l,int r,int[] piles,int[][] dp)
    {
        if(l==r)
        {
            return piles[l];
        }
        if(dp[l][r]!=-1)
        {
            return dp[l][r];
        }
        int s1=piles[l]-check(l+1,r,piles,dp);
        int s2=piles[r]-check(l,r-1,piles,dp);
        return dp[l][r]=Math.max(s1,s2);
    }
    public boolean stoneGame(int[] piles) {
        int[][] dp=new int[piles.length][piles.length];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        int n=check(0,piles.length-1,piles,dp);
        return n>0;
        
    }
}