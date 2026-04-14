class Solution {
    public long check(List<Integer> robot,int[][] factory,int ind,int fac,long[][][] dp)
    {
        if(fac==factory.length)
        {
            return Long.MAX_VALUE/2;
        }
        if(ind==robot.size())
        {
            return 0;
        }
        if(dp[ind][fac][factory[fac][1]]!=Long.MAX_VALUE)
        {
           
            return dp[ind][fac][factory[fac][1]];
        }
        
        
            long s1=Long.MAX_VALUE/2;
            if(factory[fac][1]>0)
            {
                factory[fac][1]-=1;
                s1=Math.abs(factory[fac][0]-robot.get(ind))+check(robot,factory,ind+1,fac,dp);
                 factory[fac][1]+=1;
            }
            long s2=check(robot,factory,ind,fac+1,dp);
            return dp[ind][fac][factory[fac][1]]=Math.min(s1,s2);

        
    }
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory,(a,b)->Integer.compare(a[0],b[0]));
        long[][][] dp=new long[robot.size()][factory.length][robot.size()+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                Arrays.fill(dp[i][j],Long.MAX_VALUE);
            }
        }
        return check(robot,factory,0,0,dp);
        
    }
}