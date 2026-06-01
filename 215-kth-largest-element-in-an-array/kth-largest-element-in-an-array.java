class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
       for(int num : nums){
        pq.add(num);
       }
       int n = k;
       int ans = 0;
       while(n>0){
        ans = pq.poll();
        n--;
       }
        return ans;
    }
}// 1 2 3 4 5 6 