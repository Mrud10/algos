class Solution {
    public boolean isHappy(int n) {
        int number =n;
        HashSet<Integer> set = new HashSet<>();
        while(number!=1){
            int sum = 0;
            while(number>0){
            int digit = number % 10;
            sum = sum + (int)Math.pow(digit,2);
            number = number/10;
            }
            number = sum;  
            if(set.contains(number)) return false;
            set.add(number);
            
        }
        if(number == 1) return true;
        return false;
    }
}