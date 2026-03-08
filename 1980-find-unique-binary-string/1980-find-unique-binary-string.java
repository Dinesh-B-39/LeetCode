class Solution {
    int flag=0;
    String res="";
    public void check(String s,int limit,HashSet<String> set)
    {
        // if(flag==1)
        // {
        //     return;
        // }
        if(s.length()==limit)
        {
            if(!set.contains(s))
            {
                res=s;
                flag=1;
            }
            return;
        }
        check(s+"0",limit,set);
        check(s+"1",limit,set);
    }
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        check("",nums[0].length(),set);
        return res;
        
    }
}