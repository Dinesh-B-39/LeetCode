class Solution {
    public boolean check(int ind,int[] arr,int[] visited)
    {
        if(arr[ind]==0)
        {
            return true;
        }
        boolean s1=false;
        boolean s2=false;
        if(ind+arr[ind]<arr.length && visited[ind+arr[ind]]!=-1)
        {
            visited[ind+arr[ind]]=-1;
            s1=check(ind+arr[ind],arr,visited);
            visited[ind+arr[ind]]=0;
        }
        if(ind-arr[ind]>=0 && visited[ind-arr[ind]]!=-1)
        {
            visited[ind-arr[ind]]=-1;
            s2=check(ind-arr[ind],arr,visited);
            visited[ind-arr[ind]]=0;
        }
        return s1 || s2;
    }
    public boolean canReach(int[] arr, int start) {
        int[] visited=new int[arr.length];
        return check(start,arr,visited);
        
    }
}