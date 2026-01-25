class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
       int mine=Integer.MAX_VALUE;
       for(int i=0;i<=nums.length-k;i++)
       {
        mine=Math.min(mine,nums[i+k-1]-nums[i]);
       }
        return mine;
    }
}