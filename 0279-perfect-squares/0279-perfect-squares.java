class Solution {
    int mod=(int)1e9;
    public int check(int n,int ind,ArrayList<Integer> list,int[][] dp)
    {
        if(n==0)
        {
            return 0;
        }
        if(ind==0)
        {
            if(n%list.get(ind)==0)
            {
                return n/list.get(0);
            }
            else
            {
                return mod;
            }
        }
        if(dp[n][ind]!=-1)
        {
            return dp[n][ind];
        }
        int take=mod;
        if(n>=list.get(ind))
        {
            take=1+check(n-list.get(ind),ind,list,dp);
        }
        int non_take=check(n,ind-1,list,dp);
        return dp[n][ind]=Math.min(take,non_take);
    }
    public int numSquares(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        int z=0;
        int i=1;
        while(z<=n)
        {
            int x=i*i;
            list.add(x);
            i+=1;
            z=x;
        }
        list.remove(list.size()-1);
        int[][] dp=new int[n+1][list.size()];
        for(int i1=0;i1<dp.length;i1++)
        {
            Arrays.fill(dp[i1],-1);
        }
        return check(n,list.size()-1,list,dp);
    }
}