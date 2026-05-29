class Solution {
    public int check(int n)
    {
        int c=0;
        while(n>0)
        {
            c+=n%10;
            n=n/10;
        }
        return c;
    }
    public int minElement(int[] nums) {
        int mine=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            mine=Math.min(mine,check(nums[i]));
        }
        return mine;
    }
}