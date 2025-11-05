class Solution {
    public long maxProduct(int[] nums) {
        long c1=Long.MIN_VALUE;
        long c2=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(Math.abs(nums[i])>c1)
            {
                c2=c1;
                c1=Math.abs(nums[i]);
            }
            else if(Math.abs(nums[i])>c2)
            {
                c2=Math.abs(nums[i]);
            }
        }
        return c1*c2*100000;
    }
}