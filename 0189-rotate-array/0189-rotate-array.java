class Solution {
    public void reverse(int[] nums,int i,int j)
    {
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i+=1;
            j-=1;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int z1=nums.length-k;
        int z2=z1-1;
        reverse(nums,z1,nums.length-1);
        reverse(nums,0,z2);
        reverse(nums,0,nums.length-1);
        
        
    }
}