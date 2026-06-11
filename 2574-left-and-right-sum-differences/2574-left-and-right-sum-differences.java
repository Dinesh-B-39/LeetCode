class Solution {
    public int[] leftRightDifference(int[] nums) {
        // int[] pref=new int[nums.length];
        int[] suff=new int[nums.length];
        // pref[0]=nums[0];
        
        // for(int i=1;i<nums.length;i++)
        // {
        //     pref[i]=pref[i-1]+nums[i];
        // }
        suff[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            suff[i]=nums[i]+suff[i+1];
        }
        // for(int i=0;i<suff.length;i++)
        // {
        //     System.out.print(suff[i]+" ");
        // }
        int c=0;
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                if(i+1<nums.length)
                {
                    res[i]=suff[i+1];
                    c+=nums[i];

                }
                
            }
            else if(i==nums.length-1)
            {
                res[i]=c;
            }
            else
            {
                res[i]=Math.abs(c-suff[i+1]);
                c+=nums[i];
            }
        }
        return res;
    }
}