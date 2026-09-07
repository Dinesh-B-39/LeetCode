class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        List<List<String>> res=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            String s=strs[i];
            int[] arr=new int[26];
            for(int j=0;j<s.length();j++)
            {
                arr[s.charAt(j)-'a']+=1;
            }
            String key=Arrays.toString(arr);
            if(map.containsKey(key))
            {
                map.get(key).add(s);
            }
            else
            {
                ArrayList<String> l1=new ArrayList<String>();
                l1.add(s);
                map.put(key,l1);
                
            }
        }
        for(String s:map.keySet())
        {
            res.add(map.get(s));
        }
        return res;
    }
}