class Solution {
    public int numberOfSpecialChars(String s) {
        int[] temp=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int n=(int)(s.charAt(i));
            if(n>=97)
            {
                temp[n-97]+=1;
            }
        }
        int c=0;
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int n=(int)s.charAt(i);
            if(n>=97)
            {
                arr1[n-97]+=1;
            }
            else
            {
                if(temp[n-65]==arr1[n-65] && temp[n-65]!=0)
                {
                    temp[n-65]=-1;
                    c+=1;
                }
                else
                {
                    temp[n-65]=-1;
                }
            }
        }
        return c;
        // System.out.println((int)'a');
        //  System.out.println((int)'A');
        //  return 0;
    }
}