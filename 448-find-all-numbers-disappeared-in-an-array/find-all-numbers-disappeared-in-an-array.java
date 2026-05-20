class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     List<Integer> list = new ArrayList<>();
     int n = nums.length;
     Set<Integer> set = new HashSet<>();
     for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
     }
     int l = 1;
     while(l<=n){
        if(!set.contains(l)){
            list.add(l);
        }
        l++;
     }
     return list;
    }
}