class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=0;
        int mine=Integer.MAX_VALUE;
        while(i<nums.length && j<nums.length)
        {
            if((long)nums[i]*k>=nums[j])
            {
                mine=Math.min(mine,nums.length-(j-i+1));
                j+=1;
               
            }
            else
            {
                i+=1;
            }
        }
        return mine;
        
    }
}