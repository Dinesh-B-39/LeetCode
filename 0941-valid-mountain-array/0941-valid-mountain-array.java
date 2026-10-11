class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
        {
            return false;
        }
        int k=-1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                k=i;
            }
            else
            {
                break;
            }
        }
        if(k==-1 || k==arr.length-1)
        {
            return false;
        }
        for(int i=k+1;i<arr.length;i++)
        {
            if(arr[i]>=arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
}