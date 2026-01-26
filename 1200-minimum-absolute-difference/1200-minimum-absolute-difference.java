class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mine=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            mine=Integer.min(mine,Math.abs(arr[i]-arr[i+1]));
        }
        List<List<Integer>> res=new ArrayList<>();
          List<Integer> list=new ArrayList<>();
          list.add(-1);
          list.add(-1);
        for(int i=0;i<arr.length-1;i++)
        {
            if(Math.abs(arr[i]-arr[i+1])==mine)
            {
                list.set(0,arr[i]);
                list.set(1,arr[i+1]);
                res.add(new ArrayList<>(list));
            }
        }
        return res;
    }
}