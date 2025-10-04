class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int z=Integer.MIN_VALUE;
        while(l<r)
        {
            z=Math.max(z,((r-l)*(Math.min(height[l],height[r]))));
           
            if(height[l]<height[r])
            {
                l+=1;
            }
           else
            {
                r--;
            }
            

        }
        return z;
    }
}