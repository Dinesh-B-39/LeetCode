class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        int p1=g.length;
        int p2=s.length;
        while(i<p1 && j<p2)
        {
            if(g[i]<=s[j])
            {
                i+=1;
            }
            j+=1;
        }
        return i;
    }
}