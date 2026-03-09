class Solution {
    public boolean wordPattern(String p, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String[] arr=s.split(" ");
        if(p.length()!=arr.length)
        {
            return false;
        }
        for(int i=0;i<p.length();i++)
        {
            if(map.containsKey(p.charAt(i)))
            {
                if(!arr[i].equals(map.get(p.charAt(i))))
                {
                    return false;
                }
            }
            else
            {
                if(map.containsValue(arr[i]))
                {
                    return false;
                }
                map.put(p.charAt(i),arr[i]);
            }
        }
        return true;
    }
}