class Solution {
    public int countCoveredBuildings(int n, int[][] arr) {
        HashMap<Integer,ArrayList<Integer>> mapx=new HashMap<>();
        HashMap<Integer,ArrayList<Integer>> mapy=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(mapx.containsKey(arr[i][0]))
            {
                mapx.get(arr[i][0]).add(arr[i][1]);
            }
            else
            {
                mapx.put(arr[i][0],new ArrayList<Integer>());
                 mapx.get(arr[i][0]).add(arr[i][1]);
            }

            if(mapy.containsKey(arr[i][1]))
            {
                mapy.get(arr[i][1]).add(arr[i][0]);
            }
            else
            {
              mapy.put(arr[i][1],new ArrayList<Integer>());
                 mapy.get(arr[i][1]).add(arr[i][0]);  
            }
        }
        for(int i:mapx.keySet())
        {
            Collections.sort(mapx.get(i));
        }
        for(int i:mapy.keySet())
        {
            Collections.sort(mapy.get(i));
        }
        int z=0;
        for(int i=0;i<arr.length;i++)
        {
            int c=0;
            ArrayList<Integer> l1=mapx.get(arr[i][0]);
            
            if(l1.get(0)<arr[i][1] && l1.get(l1.size()-1)>arr[i][1])
            {
              c+=1;  
            }
             ArrayList<Integer> l2=mapy.get(arr[i][1]);
            
            if(l2.get(0)<arr[i][0] && l2.get(l2.size()-1)>arr[i][0])
            {
                c+=1;
            }
            if(c==2)
            {
                z+=1;
            }

        }
        return z;
        
    }
}