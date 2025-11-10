class Solution {
    public int check(ArrayList<Integer> list)
    {
        int mine=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-2;i++)
        {
            for(int j=i+1;j<list.size()-1;j++)
            {
                for(int k=j+1;k<list.size();k++)
                {
                    mine=Math.min(mine,Math.abs(list.get(i)-list.get(j))+Math.abs(list.get(j)-list.get(k))+Math.abs(list.get(k)-list.get(i)));
                }
            }
        }
        return mine;
    }
    public int minimumDistance(int[] nums) {
        int[] res=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            res[nums[i]]+=1;
        }
        boolean flag=false;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(res[nums[i]]>=3)
            {
                if(!list.contains(nums[i]))
                {
                    
                    list.add(nums[i]);
                }
                flag=true;
            }
        }
        if(flag==false)
        {
            return -1;
        }
        ArrayList<ArrayList<Integer>> list2=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            
            int c=list.get(i);
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==c)
                {
                   temp.add(j);
                //    System.out.println(j);
                }
            }
            list2.add(temp);
        }
        int mine=Integer.MAX_VALUE;
        for(int i=0;i<list2.size();i++)
        {
            int extmin=Integer.MAX_VALUE;
            // for(int j=0;j<list2.get(i).size()-2;j++)
            // {
               
            // int x1=list2.get(i).get(j);
            // // System.out.println("x1"+x1);
            // int x2=list2.get(i).get(j+1);
            // // System.out.println("x2"+x2);
            // int x3=list2.get(i).get(j+2);
            // // System.out.println("x3"+x3);

            extmin=Math.min(mine,check(list2.get(i)));
        // }
         mine=Math.min(mine,extmin);
        }
        return mine;
    }
}