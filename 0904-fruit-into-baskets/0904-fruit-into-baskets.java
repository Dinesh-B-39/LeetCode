class Solution {
    public int totalFruit(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int maxe=Integer.MIN_VALUE;
        while(r<arr.length)
        {
            if(map.containsKey(arr[r]))
            {
                map.put(arr[r],map.get(arr[r])+1);
            }
            else
            {
                map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            }
            while(map.size()>2)
            {
                map.put(arr[l],map.get(arr[l])-1);
                if(map.get(arr[l])==0)
                {
                    map.remove(arr[l]);
                   
                }
                 l+=1;
            }
            maxe=Math.max(maxe,r-l+1);
            r+=1;

        }
        return maxe;
    }
}