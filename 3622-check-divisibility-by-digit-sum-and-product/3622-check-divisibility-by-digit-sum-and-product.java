class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int p=n+1;
        p-=1;
        while(p>0){
            int k=p%10;
            sum+=k;
            prod*=k;
            p=p/10;
        }
        System.out.println("sum: "+sum+"Prod:"+prod);
        int z=sum+prod;
        return n%z==0;
        
    }
}