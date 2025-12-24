class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[nums.length];
        int j=0;
        for(int i=0;i<n;i++)
        {
            res[j]=nums[i];
            j+=1;
            res[j]=nums[i+n];
            j+=1;
        }
        return res;
    }
}