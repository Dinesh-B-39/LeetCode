class Solution {
    public int minimumPushes(String word) {
        HashSet<Character> set=new HashSet<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<word.length();i++)
        {
            map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
        int[] arr=new int[map.size()];
        int j1=0;
        for(Character i:map.keySet())
        {
            arr[j1]=map.get(i);
            j1+=1;
            System.out.print(i+":"+map.get(i));
            System.out.println();
        }
        Arrays.sort(arr);
        int res=0;
        // int c=1;
        int n=0;
        for(int i=arr.length-1;i>=0;i-=8)
        {
            n+=1;
            for(int j=i;j>=Math.max(i-7,0);j--)
            {
                res+=arr[j]*n;
            }
        }
        // for(int i=0;i<word.length();i++)
        // {
        //     if(n%9==0)
        //     {
        //         c+=1;
        //     }
        //     if(!set.contains(word.charAt(i)))
        //     {
        //         // System.out.print(word.charAt(i)+" "+map.get(word.charAt(i)));
        //         // System.out.println();
        //         res+=c*map.get(word.charAt(i));
        //         set.add(word.charAt(i));
        //         n+=1;
        //     }
        // }
        return res;
        
    }
}