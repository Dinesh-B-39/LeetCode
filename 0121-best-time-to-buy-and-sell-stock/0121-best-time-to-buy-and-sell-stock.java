class Solution {
    public int maxProfit(int[] arr) {
        int mine=arr[0];
        int ans=0;
        for(int i=1;i<arr.length;i++)
        {
            if(mine<arr[i])
            {
                ans=Math.max(ans,arr[i]-mine);
            }
            mine=Math.min(mine,arr[i]);
        }
        return ans;
    }
}