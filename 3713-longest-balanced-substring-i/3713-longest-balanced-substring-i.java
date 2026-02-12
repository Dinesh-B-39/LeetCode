class Solution {
    public boolean check(HashMap<Character,Integer> map)
    {
        HashSet<Integer> set=new HashSet<>();
        for(Character c:map.keySet())
        {
            set.add(map.get(c));
        }
        if(set.size()==1)
        {
            return true;
        }
        return false;
    }
    public int longestBalanced(String s) {
        int maxe=0;
        for(int i=0;i<s.length();i++)
        {
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=i;j<s.length();j++)
            {
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                if(check(map))
                {
                    maxe=Math.max(maxe,j-i+1);
                }

            }
        }
        return maxe;
    }
}