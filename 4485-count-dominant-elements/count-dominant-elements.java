class Solution {
    public int countDominantElements(int[] nums) {
      if(nums.length==1) return 1;
      int count = 0;
      if(nums[1]<=nums[0]){
        count++;
      } 
      if(nums[nums.length-1]>=nums[nums.length-2]){
        count++;
      }
      for(int i=1;i<nums.length-1;i++){
        int l = nums[i-1];
        int r = nums[i+1];
        if (2 * nums[i] >= l + r){
            count++;
        }
      }
      return count;
    }
}