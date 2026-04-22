class Solution {
    public int nthUglyNumber(int n) {
        int[] dp=new int[n];
        dp[0]=1;
        int p1=0;
        int p2=0;
        int p3=0;
        for(int i=1;i<n;i++)
        {
            int mul2=dp[p1]*2;
            int mul3=dp[p2]*3;
            int mul5=dp[p3]*5;
            int min_val=Math.min(mul2,Math.min(mul3,mul5));
            dp[i]=min_val;
            if(min_val==mul2)
            {
                p1+=1;
            }
            if(min_val==mul3)
            {
                p2+=1;
            }
            if(min_val==mul5)
            {
                p3+=1;
            }
        }
        return dp[n-1];
    }
}