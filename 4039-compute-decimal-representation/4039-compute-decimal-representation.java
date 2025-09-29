class Solution {
    public int[] decimalRepresentation(int n) {
        StringBuilder sb=new StringBuilder(n+"");
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=sb.length()-1;i>=0;i--)
        {
            int n1=Integer.parseInt(sb.substring(i,sb.length()));
            if(n1!=0)
            {
                list.add(n1);
                System.out.println(n1);
            }
            sb.setCharAt(i,'0');
        }
        int[] res=new int[list.size()];
        int j=0;
        for(int i=list.size()-1;i>=0;i--)
        {
            res[j]=list.get(i);
            j+=1;
        }
        return res;
    }
}