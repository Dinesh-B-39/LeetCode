class Solution {
    public int largestAltitude(int[] gain) {
        int maxe=0;
        int[] res=new int[gain.length+1];
        int c=0;
        for(int i=0;i<gain.length;i++)
        {
            c+=gain[i];
            res[i+1]=c;
            maxe=Math.max(maxe,res[i+1]);

        }
        return maxe;
    }
}