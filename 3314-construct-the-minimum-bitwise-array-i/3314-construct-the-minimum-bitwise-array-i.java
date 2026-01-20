class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] res=new int[nums.size()];
        for(int i=0;i<nums.size();i++)
        {
            res[i]=-1;
            for(int j=0;j<nums.get(i);j++)
            {
               
                if((j|(j+1))==nums.get(i))
                {
                    res[i]=j;
                    break;
                }
            }
        }
        return res;
    }
}