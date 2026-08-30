class Solution {

    public int minimumDeletions(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int m1=-1;
        int m2=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                m2=i;
            }
            if(nums[i]<min)
            {
                min=nums[i];
                m1=i;
            }
        }
        // System.out.println("M1 :"+m1);
        // System.out.println("M1 :"+m2);
        int z1=Integer.MAX_VALUE;
        if(m1<=m2)
        {
            z1=m1+1+(m2-m1);
            z1=Math.min(z1,m1+1+(nums.length-m2));
            z1=Math.min(z1,((nums.length-m2)+(m2-m1)));
        }
        else
        {
            z1=m2+1+(m1-m2);
            z1=Math.min(z1,m2+1+(nums.length-m1));
            z1=Math.min(z1,((nums.length-m1)+(m1-m2)));
            
        }
        
        return z1;
    }
}