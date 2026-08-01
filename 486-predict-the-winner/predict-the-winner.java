class Solution {
    public boolean predictTheWinner(int[] nums) {
        // int l = 0;
        // int r = nums.length-1;
        // int p1points = 0;
        // int p2points = 0;
        // boolean p1 = true;
        // while(l<= r){
        //     if(nums[l]>nums[r] && p1==true){
        //         p1points+=nums[l];
        //         p1 = false;
        //         l++;
        //     }else if(nums[l]<=nums[r] && p1 ==true){
        //         p1points+=nums[r];
        //         p1 = false;
        //         r--;
        //     }else if(nums[l]>nums[r] && p1 ==false){
        //         p2points+=nums[l];
        //         p1 = true;
        //         l++;
        //     }else if(nums[l]<=nums[r] && p1==false){
        //         p2points+=nums[r];
        //         p1 = true;
        //         r--;
        //     }
        // }
        // if(p1points>=p2points) return true;
        // return false;
        int n = nums.length;
        Integer[][] dp = new Integer[n][n];

        return solve(nums, 0, n - 1, dp) >= 0;
    }

    private int solve(int[] nums, int i, int j, Integer[][] dp) {
        if (i == j) {
            return nums[i];
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        int takeLeft = nums[i] - solve(nums, i + 1, j, dp);
        int takeRight = nums[j] - solve(nums, i, j - 1, dp);

        return dp[i][j] = Math.max(takeLeft, takeRight);
    }
}

