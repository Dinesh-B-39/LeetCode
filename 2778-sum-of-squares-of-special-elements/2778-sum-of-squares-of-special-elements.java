class Solution {
    public int sumOfSquares(int[] nums) {
        int z=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums.length%(i+1)==0)
            {
                z+=(nums[i]*nums[i]);
            }
        }
        return z;
    }
}