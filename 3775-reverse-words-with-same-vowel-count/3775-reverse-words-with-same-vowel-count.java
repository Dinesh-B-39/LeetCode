class Solution {
    public int check(String s1)
    {
        int z1=0;
        for(int i=0;i<s1.length();i++)
        {
             if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
            {
                z1+=1;
            }
        }
        return z1;
    }
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String s1=arr[0];
        int c=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
            {
                c+=1;
            }
        }
        for(int i=1;i<arr.length;i++)
        {
            if(check(arr[i])==c)
            {
                StringBuilder sb=new StringBuilder(arr[i]);
                arr[i]=sb.reverse().toString();
            }
        }
         StringBuilder sb1=new StringBuilder();
         for(int i=0;i<arr.length;i++)
         {
            sb1.append(arr[i]+" ");
         }
         return sb1.toString().trim();
    }
}