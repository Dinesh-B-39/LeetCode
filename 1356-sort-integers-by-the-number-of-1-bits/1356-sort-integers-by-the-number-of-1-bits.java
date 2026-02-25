class Solution {
    public void check(HashMap<Integer,ArrayList<Integer>> map,int k,String s)
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                c+=1;
            }
        }
        if(map.containsKey(c))
        {
            map.get(c).add(k);
        }
        else
        {
            ArrayList<Integer> li=new ArrayList<>();
            li.add(k);
            map.put(c,li);
        }

    }
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            check(map,arr[i],Integer.toBinaryString(arr[i]));
        }
        int[] res=new int[arr.length];
        int j=0;
        for(int s:map.keySet())
        {
            ArrayList<Integer> ji=new ArrayList<>(map.get(s));
            for(int i=0;i<ji.size();i++)
            {
                res[j]=ji.get(i);
                j+=1;
            }
            // System.out.println();
        }
        return res;
    }
}