class Solution {
    public ArrayList<Integer> check(int n)
    {
        ArrayList<Integer> list=new ArrayList<>();
            while(n>0)
            {
                list.add(n%10);
                n=n/10;
            }
        // for(int i=0;i<list.size()/2;i++)
        // {
        //     int temp=list.get(i);
        //     list.set(i,list.get(list.size()-i-1));
        //     list.set(list.size()-i-1,temp);
        // }
        Collections.reverse(list);
            return list;
    }
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            ArrayList<Integer> temp=check(nums[i]);
            for(int i1=0;i1<temp.size();i1++)
            {
                res.add(temp.get(i1));
            }
        }
        int[] res1=new int[res.size()];
        for(int i=0;i<res.size();i++)
        {
            res1[i]=res.get(i);
        }
        return res1;
    }
}