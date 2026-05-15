class Solution {
    public int maxScore(int[] nums, int k) {
        int lsum=0;
        int rsum=0;
        for(int i=0;i<k;i++)
        {
            lsum+=nums[i];
        }
        int maxe=lsum;
        int l=k-1;
        int r=nums.length-1;
        while(l>=0)
        {
            lsum-=nums[l];
            lsum+=nums[r];
            l-=1;
            r-=1;
            maxe=Math.max(maxe,lsum);
        }
        return maxe;
    }
}