class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            int[] arr=new int[26];
            for(int j=0;j<strs[i].length();j++)
            {
                arr[strs[i].charAt(j)-'a']+=1;
            }
            String ji=Arrays.toString(arr);
            if(map.containsKey(ji))
            {
                List<String> str=new ArrayList<>(map.get(ji));
                str.add(strs[i]);
                map.put(ji,str);
            }
            else
            {
                List<String> str=new ArrayList<>();
                str.add(strs[i]);
                map.put(ji,str);
            }
        }
        for(String ji:map.keySet())
        {
            res.add(map.get(ji));
        }
        return res;
    }


}