class Solution {
    public boolean check(int p)
    {
        String s=p+"";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char c:map.keySet())
        {
            int k=c-'0';
            if(map.get(c)!=k)
            {
                return false;
            }
        }
        return true;
    }
    public int nextBeautifulNumber(int n) {
        int p=n+1;
        boolean flag=true;
        while(true)
        {
            if(check(p))
            {
                return p;
            }
            p+=1;
        }
        
    }
}