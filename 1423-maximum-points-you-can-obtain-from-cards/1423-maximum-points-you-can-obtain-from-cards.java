class Solution {
    public int maxScore(int[] arr, int k) {
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int maxe=sum;
        int i1=k-1;
        int j1=arr.length-1;
        while(i1>=0)
        {
            sum-=arr[i1];
            sum+=arr[j1];
            maxe=Math.max(maxe,sum);
            i1-=1;
            j1-=1;
        }
        return maxe;
        
    }
}