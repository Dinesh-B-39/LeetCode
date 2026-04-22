class Solution {
    boolean flag=false;
    public boolean check(String s,HashSet<String> set,StringBuilder sb,int ind,HashMap<String,Boolean> map)
    {
        if(ind==s.length())
        {
            if(set.contains(sb.toString()))
            {
                flag=true;
            }
            return flag;
        }
        String s3=sb.toString()+" "+ind;
        if(map.containsKey(s3))
        {
            return map.get(s3);
        }
        
        boolean f1=false;
        if(set.contains(sb.toString()))
        {
            StringBuilder z1=new StringBuilder();
            z1.append(s.charAt(ind));
            f1=check(s,set,z1,ind+1,map);
        }
            sb.append(s.charAt(ind));
            boolean f2=check(s,set,sb,ind+1,map);
            map.put(s3,f1||f2);
        return f1||f2;
        
        
        
    }
    public boolean wordBreak(String s, List<String> dict) {
        HashSet<String> set=new HashSet<>();
        for(String s1:dict)
        {
            set.add(s1);
        }
        StringBuilder sb=new StringBuilder();
        HashMap<String,Boolean> map=new HashMap<>();
        return check(s,set,sb,0,map);
       
        
    }
}