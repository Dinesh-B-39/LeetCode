class Solution {
    public long[] findPrefixScore(int[] nums) {
        long maxe=Long.MIN_VALUE;
        long[] res=new long[nums.length];
        long s=0;
        for(int i=0;i<nums.length;i++)
        {
            maxe=Math.max(maxe,nums[i]);
            s+=(long)nums[i]+maxe;
            res[i]=s;
        }
        return res;
    }
}