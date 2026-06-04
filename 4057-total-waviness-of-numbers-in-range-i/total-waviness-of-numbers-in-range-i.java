class Solution {
    public int totalWaviness(int num1, int num2) {
        int waviness = 0;
        for(int i=num1;i<=num2;i++){
           int tot = wav(i);
           waviness+=tot;
        }
        return waviness;

    }
    public int wav(int n){
        if(n<=99) return 0;
        String s = Integer.toString(n);
        int peak = 0;
        int valley = 0;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i) > s.charAt(i-1) && s.charAt(i) > s.charAt(i+1)){
                peak++;
            }
            if(s.charAt(i)<s.charAt(i-1) && s.charAt(i)<s.charAt(i+1)){
                valley++;
            }
        }

        return peak + valley;
    }
}