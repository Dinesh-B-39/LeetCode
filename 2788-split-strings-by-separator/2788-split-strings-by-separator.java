class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.size();i++)
        {
            sb.append(words.get(i));
            sb.append(separator+"");
        }
        sb.deleteCharAt(sb.length()-1);
        // System.out.println(sb.toString());
     String p = "\\" + separator;

        String[] arr=sb.toString().split(p);
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]);
        // }
        List<String> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!arr[i].equals(""))
            {
                res.add(arr[i]);
            }
        }
        return res;
    }
}