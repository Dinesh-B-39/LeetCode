class Solution {
    public void check(int i,int j,int[] arr)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i+=1;
            j-=1;
        }
    }

    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        check(nums.length-k,nums.length-1,nums);
        check(0,nums.length-k-1,nums);
        check(0,nums.length-1,nums);

        
    }
}