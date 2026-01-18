class Solution {
   public int check(String[] garbage, char c) {
    for (int i = garbage.length - 1; i >= 0; i--) {
        if (garbage[i].indexOf(c) != -1) {
            return i;   // last index containing c
        }
    }
    return 0; // c does not exist anywhere
}
    public int garbageCollection(String[] garbage, int[] travel) {
        int p1=check(garbage,'P');
        int m1=check(garbage,'M');
        int g1=check(garbage,'G');
        int P=0;
        int G=0;
        int M=0;
        for(int i=0;i<p1;i++)
        {
            P+=travel[i];
        }
       for(int i=0;i<g1;i++)
        {
            G+=travel[i];
        }
        for(int i=0;i<m1;i++)
        {
            M+=travel[i];
        }
        for(int i=0;i<garbage.length;i++)
        {
            for(int j=0;j<garbage[i].length();j++)
            {
                if(garbage[i].charAt(j)=='G')
                {
                    G+=1;
                }
                else if(garbage[i].charAt(j)=='P')
                {
                    P+=1;
                }
                else if(garbage[i].charAt(j)=='M')
                {
                    M+=1;
                }
            }
           
        }

        return P+M+G;
    }
}