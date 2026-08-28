class Solution {
    public int minProcessingTime(List<Integer> pT, List<Integer> tasks) {
        Collections.sort(pT);
        Collections.sort(tasks,Collections.reverseOrder());
        int m1=0;
        int j1=0;
        for(int i=0;i<tasks.size();i+=4)
        {
            int maxe=0;
            for(int j=i;j<Math.min(i+4,tasks.size());j++)
            {
                maxe=Math.max(maxe,tasks.get(j));
            }
            m1=Math.max(m1,pT.get(j1)+maxe);
            j1+=1;
        }

        return m1;
    }
}