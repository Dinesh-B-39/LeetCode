class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] maxPref=new int[nums.length];
        int[] minSuf=new int[nums.length];
        maxPref[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            maxPref[i]=Math.max(maxPref[i-1],nums[i]);
        }
        minSuf[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            minSuf[i]=Math.min(minSuf[i+1],nums[i]);
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int z=maxPref[i]-minSuf[i];
            if(z<=k)
            {
                if(i<res)
                {
                    res=i;
                }
            }

        }
    if(res==Integer.MAX_VALUE)
    {
        return -1;
    }
        return res;
    }
}