class Solution {
    public int check(int c1,int c2,int c3)
    {
        if(c1+c2>c3)
        {
            return 1;
        }
        return 0;
    }
    public int triangleNumber(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    int n=check(nums[i],nums[j],nums[k]);
                    if(n!=0)
                    {
                        c+=n;
                    }
                    else
                    {
                        break;
                    }
                }
            }
        }
        return c;
    }
}