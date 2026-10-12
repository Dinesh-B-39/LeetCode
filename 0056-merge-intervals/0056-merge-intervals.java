class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)->
        {
            if(a[0]==b[0])
            {
                return Integer.compare(a[1],b[1]);
            }
            else
            {
                return Integer.compare(a[0],b[0]);
            }
        });
        ArrayList<int[]> list=new ArrayList<>();
        int x1=arr[0][0];
        int x2=arr[0][1];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][0]>=x1 && arr[i][0]<=x2)
            {
                x2=Math.max(x2,arr[i][1]);
            }
            else
            {
                int[] res={x1,x2};
                list.add(res);
                x1=arr[i][0];
                x2=arr[i][1];
            }
        }
                int[] res1={x1,x2};
                list.add(res1);
        int[][] fin=new int[list.size()][2];
        for(int i=0;i<list.size();i++)
        {
            fin[i]=list.get(i);
        }
        return fin;
    }
}