class Solution {
    int x=-(int)1e9;
    public int check(int i,int j,int[] nums1,int[] nums2,int[][] dp)
    {
        if(i<0 || j<0)
        {
            return x;
        }
        if(dp[i][j]!=Integer.MIN_VALUE)
        {
            return dp[i][j];
        }
      
        int not=nums1[i]*nums2[j];
        int take=(nums1[i]*nums2[j])+check(i-1,j-1,nums1,nums2,dp);
        int non_take1=check(i-1,j,nums1,nums2,dp);
        int non_take2=check(i,j-1,nums1,nums2,dp);
        int x=Math.max(take,Math.max(non_take1,non_take2));
       
            return dp[i][j]=Math.max(x,not);
        
    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int[][] dp=new int[nums1.length][nums2.length];
        for(int i=0;i<dp.length;i++)
        {
            Arrays.fill(dp[i],Integer.MIN_VALUE);
        }
        return check(nums1.length-1,nums2.length-1,nums1,nums2,dp);
    }
}