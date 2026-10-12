class Solution {
    public String largestNumber(int[] nums) {
        Integer[] arr=new Integer[nums.length];
        int zerosCount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(nums[i]==0)
            {
                zerosCount+=1;
            }
            arr[i]=nums[i];
        }
        if(zerosCount==nums.length)
        {
            return "0";
        }
        Arrays.sort(arr,(a,b)->
        {
            String ab=a+""+b;
            String ba=b+""+a;
            return ba.compareTo(ab);
        });
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}