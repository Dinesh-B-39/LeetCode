class Solution {
    public boolean check1(int[] res)
    {
        for(int i=1;i<res.length;i++)
        {
            if(res[i]<res[i-1])
            {
                return false;
            }
        }
        return true;
    }
    public boolean check(int[] nums) {
        int[] res=new int[nums.length];
        int tar=-1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
            {
                tar=i;
                break;
            }
        }
        if(tar==-1)
        {
            return true;
        }
        int j=0;
        for(int i=tar;i<nums.length;i++)
        {
            res[j]=nums[i];
            j+=1;
        }
        for(int i=0;i<tar;i++)
        {
            res[j]=nums[i];
            j+=1;
        }
        return check1(res);
      
    }
}