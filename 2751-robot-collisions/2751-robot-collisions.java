class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        ArrayList<Integer> res=new ArrayList<>();
        int[][] arr=new int[positions.length][3];
        for(int i=0;i<positions.length;i++)
        {
            arr[i][0]=positions[i];
            arr[i][1]=healths[i];
            if(directions.charAt(i)=='L')
            {
                arr[i][2]=1;
            }
            else
            {
                arr[i][2]=0;
            }
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        Stack<int[]> stack=new Stack<>();

        for(int i=0;i<arr.length;i++)
        {
            if(stack.isEmpty())
            {
                stack.push(arr[i]);
                continue;
            }
           
            boolean flag=true;
            while(flag)
            {
                if(stack.isEmpty())
                {
                    stack.push(arr[i]);
                    break;
                }
                int[] prev=stack.peek();
             
                if(prev[2]==0 && arr[i][2]==1)
                {
                    if(prev[1]>arr[i][1])
                    {
                        prev[1]-=1;
                        stack.pop();
                        stack.push(prev);
                        break;
                    }
                    else if(arr[i][1]>prev[1])
                    {
                        arr[i][1]-=1;
                        stack.pop();
                    }
                    else
                    {
                        stack.pop();
                        break;
                    }
                }
                else
                {
                    stack.push(arr[i]);
                    flag=false;
                }
            }
            
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        while(!stack.isEmpty())
        {
            int[] ul=stack.pop();
            map.put(ul[0],ul[1]);
        }
        for(int i=0;i<positions.length;i++)
        {
            if(map.containsKey(positions[i]))
            {
                res.add(map.get(positions[i]));
            }
        }
       return res;
        
    }
}