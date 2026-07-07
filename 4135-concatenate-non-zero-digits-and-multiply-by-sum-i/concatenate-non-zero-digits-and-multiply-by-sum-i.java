class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
       long x = 0;
       int rev = 0;;
       while(n>0){
        int first = n%10;
        if(first!=0){
        rev = rev * 10 + first;
        n = n/10;
        }else{
            n = n/10;
        }
        
       }
       int temp = rev;
       int sum = 0;
       while(temp>0){
        int digit = temp%10;
        sum = sum + digit;
        temp = temp/10;
       }
       int number = 0;
       while(rev>0){
        int digit = rev%10;
        number = number * 10 + digit;
        rev = rev/10;
       }
       long res = 0;
       res = (long)sum * (long)number;
       return res;


    }
}
