class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void check(int ind,int[] arr,int target,ArrayList<Integer> list)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        // if(ind==nums.length)
        // {
        //       if(target==0)
        //     {
        //         res.add(list);
        //     }
        //     return;
        // }
        for(int i=ind;i<arr.length;i++)
        {
            if(i!=ind && arr[i]==arr[i-1])
            {
                continue;
            }
            if(arr[i]>target)
            {
                break;
            }
            list.add(arr[i]);
            check(i+1,arr,target-arr[i],list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        check(0,arr,target,list);
        return res;
    }
}