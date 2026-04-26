class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            if(a[0]==b[0])
            {
                return Integer.compare(b[1],a[1]);
            }
            else
            {
                return Integer.compare(a[0],b[0]);
            }
    });
      int s1=intervals[0][0];
      int s2=intervals[0][1];
      ArrayList<int[]> list=new ArrayList<>();
      for(int i=1;i<intervals.length;i++)
      {
        if(intervals[i][1]>=s1 && intervals[i][1]<=s2)
        {
            continue;
        }
        else
        {
            int[] arr={s1,s2};
            list.add(arr);
            s1=intervals[i][0];
            s2=intervals[i][1];
        }
       
      }

    return list.size()+1;
    }
}