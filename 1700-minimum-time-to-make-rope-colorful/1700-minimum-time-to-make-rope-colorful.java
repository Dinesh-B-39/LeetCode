class Solution {
    public int minCost(String colors, int[] neededTime) {
       ArrayList<ArrayList<Integer>> list=new ArrayList<>();
       ArrayList<Integer> temp=new ArrayList<>();
       temp.add(neededTime[0]);
       for(int i=1;i<colors.length();i++)
       {
        if(colors.charAt(i)==colors.charAt(i-1))
        {
            temp.add(neededTime[i]);
        }
        else
        {
            if(temp.size()>1)
            {
                list.add(new ArrayList<>(temp));
            }
            temp.clear();
             temp.add(neededTime[i]);
        }
       }
        if (temp.size() > 1) {
            list.add(new ArrayList<>(temp));
        }
       int c=0;
        for(int i=0;i<list.size();i++)
        {
            Collections.sort(list.get(i));
            int z=0;
            for(int j=0;j<list.get(i).size()-1;j++)
            {
                z+=list.get(i).get(j);
            }
            c+=z;
            // int mine=Integer.MAX_VALUE;
            // for(int j=0;j<list.get(i).size();j++)
            // {
            //     int z=0;
            //     for(int k=0;k<list.get(i).size();k++)
            //     {
            //         if(k!=j)
            //         {
            //             z+=list.get(i).get(k);
            //         }
            //     }
            //     mine=Integer.min(mine,z);

            // }
            // c+=mine;
        }
        return c;
    }
}