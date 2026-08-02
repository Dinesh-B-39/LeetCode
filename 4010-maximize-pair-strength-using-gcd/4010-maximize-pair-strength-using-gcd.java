class Solution {
    public int findGcd(int a,int b)
    {
        while(b>0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long maxPairStrength(int[] nums) {
        long maxe=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int res=findGcd(nums[i],nums[j]);
                long res1=(long)res*res;
                long v=(long)nums[i]*nums[j];
                maxe=Math.max(maxe,v/res1);
            }
        }
        return maxe;
    }
}