class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int c=0;
        for(int i=0;i<grumpy.length;i++)
        {
            if(grumpy[i]==0)
            {
                c+=customers[i];
            }
        }
        int m=0;
        for(int i=0;i<minutes;i++)
        {
            if(grumpy[i]==1)
            {
                m+=customers[i];
            }
        }
        int y=c+m;
        int maxe=y;
        for(int j=minutes;j<grumpy.length;j++)
        {
            if(grumpy[j-minutes]==1)
            {
                y-=customers[j-minutes];
            }
            if(grumpy[j]==1)
            {
                y+=customers[j];
            }
            maxe=Math.max(maxe,y);
        }
        return maxe;
    }
}