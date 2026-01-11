class Solution {
    public int residuePrefixes(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            int n=map.size();
            if(n==(i+1)%3)
            {
                c+=1;
            }
        }
        return c;
    }
}