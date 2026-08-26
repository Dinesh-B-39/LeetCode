class Solution {
    public int check(int i,int j,List<List<Integer>> list,List<List<Integer>> dp)
    {

        if(i==list.size()-1)
        {
            return list.get(i).get(j);
        }
        if(dp.get(i).get(j)!=Integer.MAX_VALUE)
        {
            return dp.get(i).get(j);
        }
        int p=list.get(i).get(j);
        int s1=p+check(i+1,j,list,dp);
        int s2=0;
        if(list.get(i+1).size()>j+1)
        {
            s2=p+check(i+1,j+1,list,dp);
        }
        dp.get(i).set(j,Math.min(s1,s2));
        return dp.get(i).get(j);

    }
    public int minimumTotal(List<List<Integer>> list) {
        List<List<Integer>> dp=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<list.get(i).size();j++)
            {
                temp.add(Integer.MAX_VALUE);
            }
            dp.add(temp);
        }
        int m=check(0,0,list,dp);
        return m;
        
    }
}