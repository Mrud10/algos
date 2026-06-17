class Solution {
    public int alternatingSubarray(int[] nums) {
        int max = 0;
        int n = nums.length;
        int l = 0;
        int m = 1;
        int r = 2;
        if(n<=1) return -1;
        if(n==2 && nums[1]==nums[0]+1) return 2;
        int curr = 1;
        boolean first = true;
        while(m<n){
            if(nums[l]+1 == nums[m] && first == true ){
                curr++;
                first = false;
            }else 
            if(nums[l]-1 == nums[m] && first == false){
                curr
                
                ++;
                first = true;
            }else{
                if(nums[l]+1==nums[m]){
                    curr = 2;
                    first = false;
                }else{
                    curr = 1;
                    first = true;
                }
            }
            max = Math.max(curr,max);
            l++;
            m++;
        }
        if(max!=1) return max;
        return -1;
    }
}