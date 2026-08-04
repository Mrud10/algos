class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            smallest = Math.min(smallest,nums[i]);
            largest = Math.max(largest,nums[i]);
            set.add(nums[i]);
        }
        
        for(int i=smallest;i<=largest;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}