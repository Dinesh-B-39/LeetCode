class Solution {
    public int maxScore(int[] arr, int k) {
        int lsum=0;
        int rsum=0;
        int maxe=Integer.MIN_VALUE;
        for(int i=0;i<k;i++)
        {
            lsum+=arr[i];
        }
        maxe=Math.max(maxe,lsum);
        int l=k-1;
        int r=arr.length-1;
        while(l>=0)
        {
            lsum-=arr[l];
            l-=1;
            rsum+=arr[r];
            r-=1;
             maxe=Math.max(maxe,lsum+rsum);
            
        }
        return maxe;
    }
}