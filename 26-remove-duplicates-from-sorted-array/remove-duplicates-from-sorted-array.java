class Solution {
    public int removeDuplicates(int[] nums) {
        int current = nums[0];
        int total = 1;
        for (int i = 1;i<nums.length;i++) {
            if (nums[i] != current) {
                total++;
                current = nums[i];
                nums[total - 1] = current;
            }
        }
        return total;
    }
}