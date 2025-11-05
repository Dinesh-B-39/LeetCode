class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int c1=nums[0];
        int c2=nums[nums.length-1];
        int i=0;
        while(c1<=c2)
        {
            if(nums[i]==c1)
            {
                i+=1;
            }
            else
            {
                list.add(c1);
            }
            c1+=1;
        }
        return list;
    }
}