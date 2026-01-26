class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int mine=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            mine=Integer.min(mine,Math.abs(arr[i]-arr[i+1]));
        }
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            if(Math.abs(arr[i]-arr[i+1])==mine)
            {
                List<Integer> list=new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                res.add(list);
            }
        }
        return res;
    }
}