class Solution {
    public String frequencySort(String s) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            int k=(int)s.charAt(i);
            map.put(k,map.getOrDefault(k,0)+1);
        }
        int[][] temp=new int[map.size()][2];
        int j=0;
        for(int i:map.keySet())
        {
            int[] res=new int[2];
            res[0]=i;
            res[1]=map.get(i);
            temp[j]=res;
            j+=1;
        }
        Arrays.sort(temp,(a,b)->b[1]-a[1]);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<temp.length;i++)
        {
            char c=(char)temp[i][0];
            int limit=temp[i][1];
            for(int j1=0;j1<limit;j1++)
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}