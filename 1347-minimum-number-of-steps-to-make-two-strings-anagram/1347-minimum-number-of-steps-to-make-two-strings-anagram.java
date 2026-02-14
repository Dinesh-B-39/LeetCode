class Solution {
    public void check(int[] arr,String s)
    {
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']+=1;
        }
    }
    public int minSteps(String s, String t) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        check(arr1,s);
        check(arr2,t);
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            int z=s.charAt(i)-'a';
            if(arr1[z]!=-1)
            {
                if(arr2[z]<arr1[z])
                {
                    c+=arr1[z]-arr2[z];
                }
                arr1[z]=-1;
            }
        }
        return c;
    }
}