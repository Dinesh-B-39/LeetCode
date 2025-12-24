class Solution {
    List<List<Integer>> fin=new ArrayList<>();
    public void check(int[] nums,int[] res,ArrayList<Integer> list)
    {
        if(list.size()==nums.length)
        {
            fin .add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(res[i]!=-1)
            {
                list.add(nums[i]);
                res[i]=-1;
                check(nums,res,list);
                list.remove(list.size()-1);
                res[i]=0;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int[] res=new int[nums.length];
        ArrayList<Integer> list=new ArrayList<>();
        check(nums,res,list);
        return fin;
        
    }
}