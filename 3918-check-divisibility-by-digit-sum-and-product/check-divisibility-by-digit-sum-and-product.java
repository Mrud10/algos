class Solution {
    public boolean checkDivisibility(int n) {
        return n%(digitSum(n)+product(n))==0;    
    }
    public int digitSum(int n){
        int dig = 0;
        while(n>0){
            int digit = n%10;
            dig+=digit;
            n=n/10;
        }
        return dig;
    }
    public int product(int n){
        int product = 1;
        while(n>0){
            int digit = n%10;
            product=product*digit;
            n=n/10;
        }
        return product;
    }
}