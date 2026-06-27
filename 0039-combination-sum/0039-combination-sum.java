class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void check(int[] arr,ArrayList<Integer> list,int ind,int target)
    {
         if(ind==arr.length)
        {
             if(target==0)
            {
            if(!res.contains(list))
                {
                    res.add(new ArrayList<>(list));
                }
           
            }
             return;
        }
        if(target==0)
        {
            if(!res.contains(list))
            {
                res.add(new ArrayList<>(list));
            }
            return;
        }
       
        if(arr[ind]<=target)
        {
            list.add(arr[ind]);
            check(arr,list,ind,target-arr[ind]);
            list.remove(list.size()-1);
        }
        check(arr,list,ind+1,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        check(candidates,new ArrayList<Integer>(),0,target);
        return res;
        
    }
}