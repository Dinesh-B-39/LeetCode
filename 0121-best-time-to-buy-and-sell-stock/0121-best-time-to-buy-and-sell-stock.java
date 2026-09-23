class Solution {
    public int maxProfit(int[] prices) {
        int[] temp=new int[prices.length];
        int maxe=prices[prices.length-1];
        temp[temp.length-1]=maxe;
        for(int i=prices.length-1;i>=0;i--)
        {
            maxe=Math.max(maxe,prices[i]);
            temp[i]=maxe;
        }
        int res=0;
        for(int i=0;i<prices.length-1;i++)
        {
            res=Math.max(res,temp[i+1]-prices[i]);
        }
        return res;
    }
}