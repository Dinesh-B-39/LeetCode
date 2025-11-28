class Solution {
    public int findFinalValue(int[] arr, int original) {
        int low=0;
        int high=arr.length-1;
        Arrays.sort(arr);
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]<original)
            {
                low=mid+1;
            }
            else if(arr[mid]>original)
            {
                high=mid-1;
            }
            else if(arr[mid]==original)
            {
                original*=2;
                low=mid+1;
                high=arr.length-1;
            }

        }
        return original;
    }
}