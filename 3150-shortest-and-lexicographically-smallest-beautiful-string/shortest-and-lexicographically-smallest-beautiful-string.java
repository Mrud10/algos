class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int min = Integer.MAX_VALUE;
        String ans = "";
        for(int i=0;i<s.length();i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<s.length();j++){
                sb.append(s.charAt(j));
                if(isBeautiful(s,i,j,k)){
                    if(min>sb.length()|| (min == sb.length() && sb.toString().compareTo(ans) < 0)){
                        min = sb.length();
                        ans = sb.toString();
                    }
                }
            }
        }
        return ans;
    }
    public boolean isBeautiful(String s,int l,int r , int k){
        int ones = 0;
        for(int i=l;i<=r;i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
        }
        return ones==k;
    }
}