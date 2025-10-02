class Solution {
    public boolean check(int[] nums,int k)
    {
        for(int i=k+1;i<nums.length;i++)
        {
            if(nums[i]>=nums[i-1])
            {
                return false;
            }
        }
        return true;
    }
    public long splitArray(int[] nums) {
        if(nums.length==2)
        {
            return Math.abs(nums[0]-nums[1]);
        }
        long[] res=new long[nums.length];
        long n=0;
        for(int i=0;i<nums.length;i++)
        {
            n+=nums[i];
            res[i]=n;
        }
        int z=-1;
        int flag=0;
        int yummy=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                yummy=1;
                z=i-1;
                break;
            }
        }
        long x=Long.MAX_VALUE;
        for(int i=1;i<=z+1;i++)
        {
            if(check(nums,i))
            {
                flag=1;
                // System.out.println(res[i]);
                // System.out.println(res[nums.length-1]-res[i]);
                x=Math.min(x,Math.abs(res[i-1]-(res[nums.length-1]-res[i-1])));
            }
        }
        if(yummy==0)
        {
            return (long)Math.abs(res[nums.length-2]-(res[nums.length-1]-res[nums.length-2]));
        }
        if(flag==0)
        {
             return -1;
        }
           
        
        return x;

    }
}