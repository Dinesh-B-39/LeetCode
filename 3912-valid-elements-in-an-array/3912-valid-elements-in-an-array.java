class Solution {
    public boolean check2(int ind,int[] nums)
    {
        int val=nums[ind];
        for(int i=ind+1;i<nums.length;i++)
        {
            if(val<=nums[i])
            {
                return false;
            }
        }
        return true;
    }
    public boolean check1(int ind,int[] nums)
    {
        int val=nums[ind];
        for(int i=0;i<ind;i++)
        {
            if(val<=nums[i])
            {
                return false;
            }
        }
        return true;
    }
    public List<Integer> findValidElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
    
        list.add(nums[0]);
  
        for(int i=1;i<nums.length-1;i++)
        {
            if(check1(i,nums)|| check2(i,nums))
            {
                list.add(nums[i]);
                
            }
        }
        if(nums.length>1)
        {
             list.add(nums[nums.length-1]);
        }
       
        return list;
    }
}