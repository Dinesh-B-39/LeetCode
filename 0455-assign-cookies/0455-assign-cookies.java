class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int c=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(i<g.length && j<s.length)
        {
            if(s[j]>=g[i])
            {
                c+=1;
                i+=1;
                j+=1;
            }
            else
            {
                j+=1;
            }
        }
        return c;
    }
}