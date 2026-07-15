class Solution {
    public int[] check(String s)
    {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']+=1;
        }
        return arr;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] visited=new int[strs.length];
        List<List<String>> res=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            if(visited[i]!=-1)
            {
            List<String> list=new ArrayList<>();
            int[] arr=check(strs[i]);
            list.add(strs[i]);
            visited[i]=-1;
            for(int j=i+1;j<strs.length;j++)
            {
                if(visited[j]!=-1)
                {
                if(Arrays.equals(arr,check(strs[j])))
                {
                    list.add(strs[j]);
                    visited[j]=-1;
                }
                }
            }
            res.add(list);
            }
        }

        return res;
    }
}