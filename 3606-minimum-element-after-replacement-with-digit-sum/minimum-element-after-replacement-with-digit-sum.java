class Solution {
    public int minElement(int[] nums) {
       int min = Integer.MAX_VALUE;
       for(int i=0;i<nums.length;i++){
        int digit = nums[i];
        int sum = 0;
        while(digit>0){
            int d = digit%10;
            sum+=d;
            digit = digit/10;
        }
        min = Math.min(min,sum);
       }
       return min; 
    }
}