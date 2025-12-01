class Solution {
    public void check(int[] nums,List<Integer> li,List<List<Integer>> res,int[] freq)
    {
        if(li.size()==nums.length)
        {
            res.add(new ArrayList<Integer>(li));
            return;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(freq[i]==0)
            {
                freq[i]=1;
                li.add(nums[i]);
                check(nums,li,res,freq);
                freq[i]=0;
                li.remove(li.size()-1);

            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> l1=new ArrayList<>();
        int[] freq=new int[nums.length];
        List<List<Integer>> res=new ArrayList<>();
        check(nums,l1,res,freq);
        return res;
    }
}