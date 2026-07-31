class Solution {
    public int longestPalindromeSubseq(String s) {
    //    List<String> list = new ArrayList<>();
    //    generate(s,0,list,"");
    //    int maxSize = 0;
    //    for(int i=0;i<list.size();i++){
    //     String word = list.get(i);
    //     if(isPalindrome(word)){
    //         maxSize = Math.max(maxSize,word.length());
    //     }
    //    }
    //    return maxSize;
    

    //}
    // public void generate(String s , int index, List<String> list, String curr){
    //     if(index == s.length()){
    //         list.add(curr);
    //         return;
    //     }
    //     generate(s,index+1,list,curr+s.charAt(index));
    //     generate(s,index+1,list,curr);
    // }
    // public boolean isPalindrome(String s){
    //     int l = 0;
    //     int r = s.length()-1;
    //     while(l<r){
    //         if(s.charAt(l)!=s.charAt(r)){
    //             return false;
    //         }
    //         l++;
    //         r--;
    //     }
    //     return true;

        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
        sb.append(s.charAt(i));
        }
        String s2 = sb.toString();
        int n = s.length();
        int [][] dp = new int[n+1][n+1];
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(s.charAt(i)==s2.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }
}