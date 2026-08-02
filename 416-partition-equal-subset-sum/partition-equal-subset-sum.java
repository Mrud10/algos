class Solution {
    public boolean canPartition(int[] nums) {
       int prefixSum = 0;
       if(nums.length==1) return false;
       for(int i=0;i<nums.length;i++){
        prefixSum+=nums[i];
       }
        if(prefixSum%2!=0)return false;
        int reqSum = prefixSum/2;
        boolean [] dp = new boolean[reqSum+1];
        dp[0] = true;
        for(int i=0;i<nums.length;i++){
            for(int j=reqSum;j>=nums[i];j--){
                if(dp[j-nums[i]]){
                    dp[j]=true;
                }
            }
        }
        return dp[reqSum];
    }
}