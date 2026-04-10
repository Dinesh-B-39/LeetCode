class Solution {
    public int[][] merge(int[][] intervals) {
        int p1=0;
        int p2=0;
        Arrays.sort(intervals,(a,b)->
        {
            if(a[0]==b[0])
            {
                return Integer.compare(a[1],b[1]);
            }
            else
            {
                return Integer.compare(a[0],b[0]);
            }
        });
        ArrayList<int[]> list=new ArrayList<>();
        int s1=intervals[0][0];
        int s2=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            p1=intervals[i][0];
            p2=intervals[i][1];
            if(p1>=s1 && p1<=s2)
            {
                s2=Math.max(s2,p2);
            }
            else
            {
                int[] temp={s1,s2};
                list.add(temp);
                s1=p1;
                s2=p2;
            }
        }
        int[] temp={s1,s2};
                list.add(temp);
               
        int[][] res=new int[list.size()][2];
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }
        return res;
    }
}
