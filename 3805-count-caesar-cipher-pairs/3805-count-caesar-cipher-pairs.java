class Solution {
    
    public long countPairs(String[] words) {
        HashMap< ArrayList<Integer>,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<words[i].length()-1;j++)
            {
                list.add((((words[i].charAt(j)-'a')-(words[i].charAt(j+1)-'a'))+26)%26);
                // System.out.print(arr[j]+" ");
            }
            // System.out.println();
            map.put(list,map.getOrDefault(list,0)+1);
        }
        long s=0;
        for(ArrayList<Integer> arr:map.keySet())
        {
           long z=map.get(arr);
            s+=(z*(z-1))/2;
        }
        return s;
        
    }
}