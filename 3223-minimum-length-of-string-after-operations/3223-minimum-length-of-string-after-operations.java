class Solution {
    public int minimumLength(String s) {
        int z=0;
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']+=1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=3)
            {
                if(arr[i]%2==0)
                {
                    z+=arr[i]-2;
                }
                else
                {
                    z+=arr[i]-1;
                }
            }
        }
        return s.length()-z;
        
    }
}