class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] arr1, int[][] arr2) {
        List<List<Integer>> res1=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length)
        {
            int res=0;
            List<Integer> l1=new ArrayList<>();
            if(arr1[i][0]<arr2[j][0])
            {
                res+=arr1[i][1];
                
                    res+=arr2[j][1];
                
                l1.add(arr1[i][0]);
                l1.add(res);
                i+=1;
            }
            else if(arr1[i][0]>arr2[j][0])
            {
                res+=arr2[j][1];
                res+=arr1[i][1];
                l1.add(arr2[j][0]);
                l1.add(res);
                j+=1;

            }
            else
            {

                res+=arr1[i][1]+arr2[j][1];
                l1.add(arr1[i][0]);
                l1.add(res);
                i+=1;
                j+=1;
            }
            res1.add(l1);
        }
        while(i<arr1.length)
        {
            int res=0;
            List<Integer> l1=new ArrayList<>();
             res+=arr1[i][1];
                l1.add(arr1[i][0]);
                l1.add(res);
                i+=1;
            res1.add(l1);
        }
        while(j<arr2.length)
        {
            int res=0;
            List<Integer>l1=new ArrayList<>();
            res+=arr2[j][1];
                l1.add(arr2[j][0]);
                l1.add(res);
                j+=1;
                res1.add(l1);

        }
        return res1;
    }
}