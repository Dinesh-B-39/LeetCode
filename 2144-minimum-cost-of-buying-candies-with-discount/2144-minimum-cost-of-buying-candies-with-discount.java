class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int tot=0;
        for(int i=cost.length-1;i>=0;i-=3)
        {
            tot+=cost[i];
            if(i-1>=0)
            {
                 tot+=cost[i-1];

            }
        }
        return tot;
    }
}