class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int x=nums.length/2;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i<x)
            {
                c+=nums[x]-nums[i];
            }
            else if(i>x)
            {
                c+=nums[i]-nums[x];
            }
        }
        return c;
    }
}