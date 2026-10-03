class Solution {
    public String check(String s)
    {
        int[] temp=new int[26];
        for(int i=0;i<s.length();i++)
        {
            temp[s.charAt(i)-'a']+=1;
        }
        return Arrays.toString(temp);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String p=check(strs[i]);
            if(!map.containsKey(p))
            {
                map.put(p,new ArrayList<String>());  
            }
            map.get(p).add(strs[i]);
        }
        for(String s:map.keySet())
        {
            res.add(map.get(s));
        }
        return res;
    }
}