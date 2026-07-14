class Solution {
    static final long MOD = 1_000_000_007L;
    static final long INV2 = 500_000_004L;

    public int minimumCost(int[] nums, int k) {
        int n = nums.length;
        long cons = k;
        long total = 0;
        long run = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] <= cons) {
                cons -= nums[i];
            } else {
                long need = nums[i] - cons;
                long fills = (need + k - 1L) / k;

                long fillsMod = fills % MOD;
                long termMod = ((2 * (run % MOD) % MOD) + fillsMod - 1 + MOD) % MOD;
                long sum = fillsMod * termMod % MOD * INV2 % MOD;
                total = (total + sum) % MOD;

                run += fills;
                cons += fills * (long) k;
                cons -= nums[i];
            }
        }
        return (int) total;
    }
}