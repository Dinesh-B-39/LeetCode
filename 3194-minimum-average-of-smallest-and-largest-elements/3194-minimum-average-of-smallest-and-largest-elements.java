class Solution {
    public double minimumAverage(int[] nums) {
        double[] res=new double[nums.length/2];
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        double x=Double.MAX_VALUE;
        while(i<j)
        {
            double m=(double)(nums[i]+nums[j])/2;
            res[i]=m;
            x=Math.min(x,res[i]);
            i+=1;
            j-=1;
        }
        return x;
    }
}