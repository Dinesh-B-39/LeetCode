class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr=new long[nums.length];
        long res=0;
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i]*nums[i];
            res+=arr[i];
        }
        System.out.println(res);
        Arrays.sort(arr);
        int k=(nums.length/2)-1;
        for(int i=k;i>=0;i--)
        {
            res-=2*arr[i];
        }
        return res;
    }
}