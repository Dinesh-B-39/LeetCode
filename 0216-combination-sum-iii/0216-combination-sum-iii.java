class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void check(int k,int n,List<Integer> list,int sum,int i)
    {
        int z=list.size();
        
        if(z==k && sum==n)
        {
            
                res.add(new ArrayList<Integer>(list));
        
            return;
        }
        if(i>9)
        {
            return;
        }
        sum+=i;
        list.add(i);
        check(k,n,list,sum,i+1);
        sum-=i;
        list.remove(list.size()-1);
        check(k,n,list,sum,i+1);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list=new ArrayList<>();
        check(k,n,list,0,1);
        return res;
        
    }
}