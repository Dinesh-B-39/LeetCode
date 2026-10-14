class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            pq.offer(nums[i]);
        }
        int z=1;
        while(z<k)
        {
            pq.poll();
            z+=1;
        }
        return pq.poll();
    }
}