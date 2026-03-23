class Solution {
    public int check(int ind,int c,int[] nums,int[] temp)
    {
        if(temp[ind]==-1)
        {
            return c;
        }
        temp[ind]=-1;
        return check(nums[ind],c+1,nums,temp);
    }
    public int arrayNesting(int[] nums) {
        int maxe=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int[] temp=new int[nums.length];
            temp[i]=-1;
            maxe=Math.max(maxe,check(nums[i],1,nums,temp));
        }

        return maxe;
    }
}