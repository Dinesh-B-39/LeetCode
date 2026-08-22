class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        if(nums.length<=2)
        {
            return nums;
        }
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            if(l1.get(l1.size()-1)>l2.get(l2.size()-1))
            {
                l1.add(nums[i]);
            }
            else
            {
                l2.add(nums[i]);
            }
        }
        int p=0;
        for(int i=0;i<l1.size();i++)
        {
            nums[p]=l1.get(i);     
            p+=1;
        }
        for(int i=0;i<l2.size();i++)
        {
            nums[p]=l2.get(i);     
            p+=1;
        }

        return nums;
        
    }
}