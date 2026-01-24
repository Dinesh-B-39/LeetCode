class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxe=0;
        int n=nums.length;
        for(int i=0;i<=nums.length/2;i++)
        {
            maxe=Math.max(maxe,nums[i]+nums[n-i-1]);
        }
        
        return maxe;
    }
}