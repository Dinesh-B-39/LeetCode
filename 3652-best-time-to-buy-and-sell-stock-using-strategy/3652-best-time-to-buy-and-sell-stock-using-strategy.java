class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        long[] pref=new long[prices.length];
        long m=0;
        for(int i=0;i<pref.length;i++)
        {
            m+=prices[i];
            pref[i]=m;
        }
        long[] sea=new long[prices.length];
        for(int i=0;i<sea.length;i++)
        {
            sea[i]=prices[i]*strategy[i];
        }
        for(int i=1;i<sea.length;i++)
        {
            sea[i]+=sea[i-1];
        }
        long maxe=sea[sea.length-1];
        long c=0;
        for(int i=0;i<=prices.length-k;i++)
        {
            c=0;
            if(i-1>=0)
            {
                c+=sea[i-1];
            }
            c+=pref[i+k-1]-pref[i+(k/2)-1];
            if(k<prices.length)
            {
                c+=sea[sea.length-1]-sea[i+k-1];
            }
            maxe=Math.max(maxe,c);
        }
        
        return maxe;
    }
}