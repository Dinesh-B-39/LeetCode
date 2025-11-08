class Solution {
    public int minMoves(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        int k=nums[nums.length-1];
        for(int i=0;i<nums.length;i++)
        {
            c+=k-nums[i];
        }
        return c;
    }
}