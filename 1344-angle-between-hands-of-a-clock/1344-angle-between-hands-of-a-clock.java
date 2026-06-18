class Solution {
    public double angleClock(int hour, int minutes) {
        double ans=Math.abs((30*hour)-(5.5*minutes));
        // System.out.println(ans);
        if(ans>180)
        {
            ans=360-ans;
        }
        return Math.abs(ans);
    }
}