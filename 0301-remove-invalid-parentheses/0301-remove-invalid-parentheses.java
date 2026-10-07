class Solution {
    TreeMap<Integer,ArrayList<String>> map=new TreeMap<>();
    public void check(int ind,String s,int k,int del,StringBuilder sb)
    {
        if(ind==s.length())
        {
            if(k==0)
            {
                if(!map.containsKey(del))
                {
                    map.put(del,new ArrayList<String>());
                }
                ArrayList<String> temp=map.get(del);
                String r=sb.toString();
                if(!temp.contains(r))
                {
                        map.get(del).add(r);
                }
                
            }
            return;
        }
        StringBuilder v1=new StringBuilder(sb.toString());
        if(s.charAt(ind)=='(')
        {
            sb.append('(');
            check(ind+1,s,k+1,del,sb);
        }
        else if(s.charAt(ind)==')')
        {
            if(k>0)
            {
                sb.append(')');
                check(ind+1,s,k-1,del,sb);
            }
        }
        else
        {
            sb.append(s.charAt(ind));
            check(ind+1,s,k,del,sb);
        }
        if(s.charAt(ind)=='(' || s.charAt(ind)==')' )
        {
            check(ind+1,s,k,del+1,v1);
        }
        

    }
    public List<String> removeInvalidParentheses(String s) 
    {
        StringBuilder sb=new StringBuilder();
        check(0,s,0,0,sb);
        for(int i:map.keySet())
        {
            return map.get(i);
        }
        ArrayList<String> res=new ArrayList<>();
        res.add("");
        return res;
    }
}