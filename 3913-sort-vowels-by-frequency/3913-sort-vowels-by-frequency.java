class Solution {
    public String sortVowels(String s) {
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
        }
        int[][] arr=new int[map.size()][2];
        int z=0;
        for(char i:map.keySet())
        {
            int[] temp={i-'a',map.get(i)};
            arr[z]=temp;
            z+=1;
        }
        Arrays.sort(arr,(a,b)->
        {
            return b[1]-a[1];
        });
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            char c=(char)(arr[i][0]+97);
            int limit=arr[i][1];
            for(int j=0;j<limit;j++)
            {
                list.add(c);
                System.out.println(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        int v=0;
        for(int i=0;i<s.length();i++)
        {
             if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
             {
                sb.append(list.get(v));
                v+=1;
             }
             else
             {
                sb.append(s.charAt(i));
             }
        }
        return sb.toString();
    }
}