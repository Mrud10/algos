class Solution {
    public int maximumPrimeDifference(int[] nums) {
        boolean[] isPrime = new boolean[101];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        int n = isPrime.length;
        for(int i=2;i*i<=n;i++){
             if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j] = false;
                }
             }
        }
        int l = 0;
        int r = nums.length-1;
        int dist = 0;
        while(l<=r){
            int numL = nums[l];
            int numR = nums[r];
            if(isPrime[numL]==true && isPrime[numR]==true){
                dist = Math.max(dist,r-l);
                l++;
                r--;
            }else if(isPrime[numL]==true && isPrime[numR]==false){
                r--;
            }else if(isPrime[numL]==false && isPrime[numR]==true){
                l++;
            }else{
                l++;
                r--;
            }
            
        }
        return dist;
    }
}