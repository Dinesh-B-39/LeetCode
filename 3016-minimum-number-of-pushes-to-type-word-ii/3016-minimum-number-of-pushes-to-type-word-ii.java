class Solution {
    public int minimumPushes(String word) {
        int[] ar1=new int[26];
        int p=0;
        for(int i=0;i<word.length();i++)
        {
            if(ar1[word.charAt(i)-'a']==0)
            {
                p+=1;
            }
            ar1[word.charAt(i)-'a']+=1;
          
        }
        int[] arr=new int[p];
        int j1=0;
        for(int i=0;i<ar1.length;i++)
        {
            if(ar1[i]!=0)
            {
                arr[j1]=ar1[i];
                j1+=1;
            }
        }
        Arrays.sort(arr);
        int res=0;
        int n=0;
        for(int i=arr.length-1;i>=0;i-=8)
        {
            n+=1;
            for(int j=i;j>=Math.max(i-7,0);j--)
            {
                res+=arr[j]*n;
            }
        }
      
        return res;
        
    }
}