class Solution {
    public String stoneGameIII(int[] stoneValue) {
        Integer[] dp=new Integer[stoneValue.length];
        int diff=solve(0,stoneValue,dp);
        if(diff>0)return "Alice";
        if(diff<0)return "Bob";
        return "Tie";
    }

    public int solve(int i,int[] stoneValue,Integer[] dp){
        if(i>=stoneValue.length)return 0;
        if(dp[i]!=null)return dp[i];

        int take=0;
        int maxDiff=Integer.MIN_VALUE;

        for(int k=0;k<3&&i+k<stoneValue.length;k++){
            take+=stoneValue[i+k];
            maxDiff=Math.max(maxDiff,take-solve(i+k+1,stoneValue,dp));
        }

        return dp[i]=maxDiff;
    }
}