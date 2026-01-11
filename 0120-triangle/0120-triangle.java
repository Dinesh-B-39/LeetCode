class Solution {
    public int check(List<List<Integer>> list, ArrayList<ArrayList<Integer>> dp,int i,int j)
    {
        if(i==0)
        {
            return dp.get(0).get(0);
        }
        if(i<0 || j<0 || list.get(i).size()<=j)
        {
            return Integer.MAX_VALUE;
        }
        if(dp.get(i).get(j)!=-1)
        {
            return dp.get(i).get(j);
        }
        int s1=check(list,dp,i-1,j);
        int s2=check(list,dp,i-1,j-1);
        dp.get(i).set(j,Math.min(s1,s2)+list.get(i).get(j));
        return dp.get(i).get(j);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        ArrayList<ArrayList<Integer>> dp=new ArrayList<>();
        for(int i=0;i<triangle.size();i++)
        {
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<triangle.get(i).size();j++)
            {
                list.add(-1);
            }
            dp.add(list);
        }
        int mine=Integer.MAX_VALUE;
        dp.get(0).set(0,triangle.get(0).get(0));
        for(int i=0;i<triangle.get(triangle.size()-1).size();i++)
        {
            int u=check(triangle,dp,triangle.size()-1,i);
            mine=Math.min(mine,u);
        }
        return mine;
    }
}