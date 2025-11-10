public class Solution {
    public int MinCost(string colors, int[] neededTime) {
        List<List<int>> list=new List<List<int>>();
        List<int> temp=new List<int>();
       temp.Add(neededTime[0]);
       for(int i=1;i<colors.Length;i++)
       {
        if(colors[i]==colors[i-1])
        {
            temp.Add(neededTime[i]);
        }
        else
        {
            if(temp.Count()>1)
            {
                list.Add(new List<int>(temp));
            }
            temp.Clear();
             temp.Add(neededTime[i]);
        }
       }
        if (temp.Count() > 1) {
            list.Add(new List<int>(temp));
        }
       int c=0;
        for(int i=0;i<list.Count();i++)
        {
            list[i].Sort();
            int z=0;
            for(int j=0;j<list[i].Count()-1;j++)
            {
                z+=list[i][j];
            }
            c+=z;
           
        }
        return c;
        
    }
}