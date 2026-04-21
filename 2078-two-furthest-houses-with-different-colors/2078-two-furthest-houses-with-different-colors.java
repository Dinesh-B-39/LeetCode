class Solution {
    public int maxDistance(int[] colors) {
        HashSet<Integer> set=new HashSet<>();
        int i=0;
        int j=colors.length-1;
        int maxe=Integer.MIN_VALUE;
        while(i<colors.length && j>=i)
        {
            if(set.contains(colors[i]))
            {
                i+=1;
                continue;
            }
            else
            {
                j=colors.length-1;
                while(colors[i]==colors[j])
                {
                    j-=1;
                }
                maxe=Math.max(maxe,j-i);
                set.add(colors[i]);
            }
            i+=1;
        }
        return maxe;
    }
}