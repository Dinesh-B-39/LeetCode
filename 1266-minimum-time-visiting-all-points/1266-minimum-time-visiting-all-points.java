class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int c=0;
        for(int i=0;i<points.length-1;i++)
        {
            int x1=Math.abs(points[i][0]-points[i+1][0]);
            int x2=Math.abs(points[i][1]-points[i+1][1]);
            c+=Math.max(x1,x2);
        }
        return c;
    }
}   