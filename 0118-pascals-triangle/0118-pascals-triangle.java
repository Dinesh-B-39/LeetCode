class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
       
        //  List<Integer> temp2=new ArrayList<>();
        List<Integer> r1=new ArrayList<>();
         List<Integer> temp=new ArrayList<>();
        temp.add(1);
         
        res.add(temp);
        // if(numRows>1)
        // {
            
        //      temp.add(1);
        //     temp.add(1);
        //     res.add(temp);
        // }
        
        for(int i=1;i<numRows;i++)
        {
          r1=new ArrayList<Integer>();
            r1.add(1);
            for(int j=1;j<=i-1;j++)
            {
                r1.add(temp.get(j-1)+temp.get(j));
            }
            r1.add(1);
            res.add(r1);
            temp=new ArrayList<Integer>(r1);
        }
        return res;
        
    }
}