class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set  = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int l = k;
        int n = nums.length;
        while(l<=k*n + k){
            if(!set.contains(l)){
                return l;
            }
            l=l+k;
        }
        return -1;
    }
}