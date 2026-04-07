class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> res=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<matches.length;i++)
        {
            set.add(matches[i][1]);
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
        }
        List<Integer> win=new ArrayList<>();
        List<Integer> loss=new ArrayList<>();
        for(int i=0;i<matches.length;i++)
        {
            if(!set.contains(matches[i][0]))
            {
                win.add(matches[i][0]);
                set.add(matches[i][0]);
            }
        }
        Collections.sort(win);
        for(int i:map.keySet())
        {
            if(map.get(i)==1)
            {
                loss.add(i);
            }
        }
        Collections.sort(loss);
        res.add(win);
        res.add(loss);
        return res;
    }
}