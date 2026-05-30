class Solution {
    public int maxArea(int[] height) {
        int maxe=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        while(left<=right)
        {
            if(height[left]<=height[right])
            {
                maxe=Math.max(maxe,(right-left)*height[left]);
                left+=1;
            }
            else
            {
                 maxe=Math.max(maxe,(right-left)*height[right]);
                right-=1;
            }
        }
        return maxe;
    }
}