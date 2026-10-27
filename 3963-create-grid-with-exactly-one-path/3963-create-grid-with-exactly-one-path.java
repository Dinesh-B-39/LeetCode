class Solution {
    public String[] createGrid(int m, int n) {
        String[] res=new String[m];
        
        for(int i=1;i<m;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n-1;j++)
            {
                sb.append("#");
            }
            sb.append(".");
            res[i]=sb.toString();

        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            sb.append(".");
        }
        res[0]=sb.toString();
        return res;
    }
}