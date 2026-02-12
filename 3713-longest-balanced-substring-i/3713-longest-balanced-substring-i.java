class Solution {
    public boolean check(int[] arr)
    {
        int k=-1;
        int start=-1;
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]!=0)
        {
            k=arr[i];
            start=i;
            break;
        }
      }
      for(int i=start+1;i<arr.length;i++)
      {
        if(arr[i]!=0 && arr[i]!=k)
        {
            return false;
        }
      }
      return true;
    }
    public int longestBalanced(String s) {
        int maxe=0;
        for(int i=0;i<s.length();i++)
        {
            int[] arr=new int[26];
            for(int j=i;j<s.length();j++)
            {
                arr[s.charAt(j)-'a']+=1;
                if(check(arr))
                {
                    maxe=Math.max(maxe,j-i+1);
                }
            }
        }
        return maxe;
    }
}
