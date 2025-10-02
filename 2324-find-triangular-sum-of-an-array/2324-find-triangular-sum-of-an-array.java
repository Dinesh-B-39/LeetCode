class Solution {
    public int triangularSum(int[] nums) {
        int k=nums.length-1;
        for(int i=0;i<nums.length-1;i++)
        {
            int z=k;
            for(int j=0;j<z;j++)
            {
                nums[j]=(nums[j]+nums[j+1])%10;
            
                
            }
            k-=1;
        }
        return nums[0];
    }
}