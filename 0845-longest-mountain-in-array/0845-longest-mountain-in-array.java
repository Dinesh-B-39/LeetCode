class Solution {
    public int longestMountain(int[] arr) {
        int k=0;
        int maxe=0;
        while(k<arr.length)
        {
            int flag=0;
            k+=1;
            int zem=-1;
            int z=-1;
            int p=-1;
            for(int i=k;i<arr.length;i++)
            {
                if(arr[i]>arr[i-1])
                {
                    z=i;
                }
                else
                {
                    break;
                }
            }
           
            for(int j=z+1;j<arr.length;j++)
            {
                 if(z==-1)
                {
                    flag=-1;
                    break;
                }
                if(arr[j]>=arr[j-1])
                {
                    p=j;
                    break;
                }
                else
                {
                    if(zem==-1)
                    {
                        zem=j;   
                    }
                    maxe=Math.max(maxe,j-k+2);
                    
                }
            }
            if(flag==0)
            {
                if(p==-1)
                {
                    k=z+1;
                }
                else
                {
                    if(zem!=-1)
                    {
                        k=zem;
                    }
                    
                }
            }
            
           
        }
        return maxe;
    }
}