class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int s1=0;
        int s2=0;
        for(int i=0;i<k;i++)
        {
            s1+=nums[i];
            s2+=nums[nums.length-i-1];
        }
        return Math.abs(s1-s2);
    }
}