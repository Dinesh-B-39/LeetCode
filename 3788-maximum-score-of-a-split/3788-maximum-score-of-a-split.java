class Solution {
    public long maximumScore(int[] nums) {
        int maxe=Integer.MIN_VALUE;
        long[] pref=new long[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            pref[i]=nums[i]+pref[i-1];
        }
        int[] suff=new int[nums.length];
        int mine=nums[nums.length-1];
        suff[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            mine=Math.min(mine,nums[i]);
            suff[i]=mine;
        }
        long res=Long.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++)
        {
            res=Math.max(res,(long)(pref[i]-suff[i+1]));
        }
        return res;
    }
}