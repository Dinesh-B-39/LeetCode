class Solution {
    public double minimumAverage(int[] nums) {
       
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        double x=Double.MAX_VALUE;
        while(i<j)
        {
            double m=(double)(nums[i]+nums[j])/2;
           
            x=Math.min(x,m);
            i+=1;
            j-=1;
        }
        return x;
    }
}