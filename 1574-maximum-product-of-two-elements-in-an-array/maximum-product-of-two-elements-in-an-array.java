class Solution {
    public int maxProduct(int[] nums) {
        int firstMax = 0;
        int secondMax =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=firstMax){
                secondMax = firstMax;
                firstMax = nums[i];
            }if(nums[i]<firstMax && nums[i]>secondMax){
                secondMax = nums[i];
            }
        }
        return (firstMax-1)*(secondMax-1);
    }
}