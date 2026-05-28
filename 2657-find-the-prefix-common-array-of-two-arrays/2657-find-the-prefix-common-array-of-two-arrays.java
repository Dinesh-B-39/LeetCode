class Solution {
    public int check(int[] arr1,int[] arr2)
    {
        int c=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=0 && arr1[i]==arr2[i])
            {
                c+=1;
            }
        }
        return c;
    }
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr1=new int[51];
        int[] arr2=new int[51];
        int[] res=new int[A.length];
        int c=0;
        for(int i=0;i<res.length;i++)
        {
            arr1[A[i]]+=1;
            arr2[B[i]]+=1;
            
            res[i]=c;
            if(A[i]!=B[i])
            {

            
            if(arr2[A[i]]!=0)
            {
                c+=1;
            }
            if(arr1[B[i]]!=0)
            {
                c+=1;
            }
            }
            else
            {
                c+=1;
            }
            res[i]=c;

        }

    return res;
        
    }
}