class Solution {
    public int check(List<List<Integer>> triangle,int i,int j,ArrayList<ArrayList<Integer>> dp)
    {
        if(i<0 || j<0 || triangle.get(i).size()<=j)
        {
            return Integer.MAX_VALUE;
        }
        // if(i==0 && j==0)
        // {
        //     return triangle.get(i).get(j);
        // }
        if(dp.get(i).get(j)!=null)
        {
            return dp.get(i).get(j);
        }
        int top=check(triangle,i-1,j,dp);
        int dig=check(triangle,i-1,j-1,dp);
        dp.get(i).set(j,Math.min(top,dig)+triangle.get(i).get(j));
        return dp.get(i).get(j);

    }
    public int minimumTotal(List<List<Integer>> triangle) {
        ArrayList<ArrayList<Integer>> dp=new ArrayList<>();
        for(int i=0;i<triangle.size();i++)
        {
            ArrayList<Integer> d1=new ArrayList<>();
            for(int j=0;j<triangle.get(i).size();j++)
            {
                d1.add(null);
            }
            dp.add(d1);
        }
        dp.get(0).set(0,triangle.get(0).get(0));
        int mine=Integer.MAX_VALUE;
        for(int i=0;i<triangle.get(triangle.size()-1).size();i++)
        {
            mine=Math.min(mine,check(triangle,triangle.size()-1,i,dp));
        }
        return mine;
    }
}