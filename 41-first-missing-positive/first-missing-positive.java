class Solution {
    public int firstMissingPositive(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],nums[i]);
        }
        int l = 1;
        while(l<=n){
            if(map.containsKey(l)){
                l++;
            }else{
                return l;
            }
        }
        if(l==n+1) return l;
        return -1;
    }
}
