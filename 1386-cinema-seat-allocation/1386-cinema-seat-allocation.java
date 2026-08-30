class Solution {
    public int maxNumberOfFamilies(int n, int[][] seats) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<seats.length;i++)
        {
            if(!map.containsKey(seats[i][0]))
            {
                ArrayList<Integer> list=new ArrayList<>();
                list.add(seats[i][1]);
                map.put(seats[i][0],list);
            }
            else
            {
                map.get(seats[i][0]).add(seats[i][1]);
            }
        }
        int[][] arr=new int[map.size()][3];
        int p=0;
        int res=0;
        for(int i1:map.keySet())
        {   
            ArrayList<Integer> l1=new ArrayList<>(map.get(i1));
            for(int i=0;i<l1.size();i++)
            {
                int m=l1.get(i);
                if(m==2 || m==3)
                {
                    arr[p][0]=-1;
                }
                else if(m==4 || m==5)
                {
                    arr[p][1]=-1;
                    arr[p][0]=-1;
                }
                else if(m==6 || m==7)
                {
                    arr[p][2]=-1;
                    arr[p][1]=-1;
                }
                else if(m==9 || m==8)
                {
                    arr[p][2]=-1;
                    
                }
               
            }
            p+=1;
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(arr[i][j]!=-1)
                {
                    res+=1;
                    if(j<2)
                    {
                        arr[i][j+1]=-1;
                    }
                }
            }
        }

        int y=n-map.size();
        System.out.println(y);
        res+=y*2;
        return res;
    }
}