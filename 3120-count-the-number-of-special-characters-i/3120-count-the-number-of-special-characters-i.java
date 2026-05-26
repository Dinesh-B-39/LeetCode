class Solution {
    public int numberOfSpecialChars(String word) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<word.length();i++)
        {
            int s1=(int)word.charAt(i);
            if(s1>=97)
            {
                arr1[s1-97]+=1;
            }
            else
            {
                arr2[s1-65]+=1;
            }


        }
        int c=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=0 && arr2[i]!=0)
            {
                c+=1;
            }
        }
        return c;
        
    }
}