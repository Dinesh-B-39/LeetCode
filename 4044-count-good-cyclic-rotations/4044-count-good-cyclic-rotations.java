class Solution {
    public int countGoodRotations(int[] nums) {
        int res=0;
        long s1=0;
        long s2=0;
        for(int i=0;i<nums.length/2;i++)
        {
            s1+=(long)nums[i];
        }
        for(int i=nums.length/2;i<nums.length;i++)
        {
            s2+=(long)nums[i];
        }
        if(s1>s2)
        {
            res+=1;
        }
        int z=nums.length/2;
        int p=0;
        while(p<nums.length-1)
        {
            s1-=nums[p];
            s1+=nums[z];
            s2+=nums[p];
            s2-=nums[z];
             if(s1>s2)
            {
                // System.out.print(s1+" "+s2);
                // System.out.println();
                res+=1;
            }
            z=(z+1)%nums.length;
            p+=1;
        }
        return res;
    }
}