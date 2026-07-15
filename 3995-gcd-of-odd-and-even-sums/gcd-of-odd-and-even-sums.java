class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven = 0;
        int sumOdd = 0;
        int even =2;
        int odd = 1;
        for(int i=0;i<n;i++){
            sumEven=sumEven+even;
            even+=2;
            sumOdd =sumOdd+odd;
            odd+=2;
        }
        return gcd(sumEven,sumOdd);

    }
   public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return Math.abs(a);
   }
}