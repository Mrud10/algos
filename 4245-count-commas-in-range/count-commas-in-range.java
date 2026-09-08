class Solution {
    public int countCommas(int n) {
        // int l = n;
        // String s = Integer.toString(l);
        // if(s.length()<4) return 0;
        // int inOne = s.length()/3;
        // int count = 0;
        // for(int i=1000;i<=n;i++){
        //     count++;
        // }
        // return count * inOne;
        if(n>=1000) return (n-1000)+1;

        return 0;
    }
}