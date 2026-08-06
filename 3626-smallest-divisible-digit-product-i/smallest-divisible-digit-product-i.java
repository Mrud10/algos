class Solution {
    public int smallestNumber(int n, int t) {
        int l = n;
        while(product(l)%t!=0){
            l++;
        }
        return l;
    
    }
    public int product(int n){
        int product = 1;
        while(n>0){
            int digit = n%10;
            product*=digit;
            n/=10;
        }
        return product;
    }
}