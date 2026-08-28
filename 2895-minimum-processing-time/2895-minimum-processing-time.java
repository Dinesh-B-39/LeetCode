class Solution {
    public int minProcessingTime(List<Integer> pT, List<Integer> tasks) {
        Collections.sort(pT);
        Collections.sort(tasks,Collections.reverseOrder());
        int m1=0;
        int p=0;
        for(int i=0;i<pT.size();i++)
        {
            m1=Math.max(m1,pT.get(i)+tasks.get(p));
            p+=4;
        }
        return m1;
    }
}