class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        // Arrays.sort(queries);
        // Arrays.sort(dictionary);
        List<String> res=new ArrayList<>();
        for(int i=0;i<queries.length;i++)
        {
            String s1=queries[i];
           
            for(int j=0;j<dictionary.length;j++)
            {
                 int p=0;
                 String s2=dictionary[j];
                 for(int k=0;k<s2.length();k++)
                 {
                    if(s1.charAt(k)!=s2.charAt(k))
                    {
                        p+=1;
                    }
                    if(p>2)
                    {
                        break;
                    }
                 }
                 if(p<=2)
                 {
                    res.add(queries[i]);
                    break;
                 }


            }
        }
        return res;
    }
}