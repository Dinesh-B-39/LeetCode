class Solution {
    public int minimumCost(int[] nums) {
        int z=nums[0];
        nums[0]=-1;
        Arrays.sort(nums);
        z+=nums[1];
        z+=nums[2];
        return z;
        
    }
}