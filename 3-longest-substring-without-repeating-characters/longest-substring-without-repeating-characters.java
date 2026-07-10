class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
       int n = s.length();
       int l = 0;
       int hugest = 0;
       int r = 0;
       while(r<n){
        if(!set.contains(s.charAt(r))){
        set.add(s.charAt(r));
        hugest = Math.max(hugest,set.size());
        r++;
        }else{
            set.remove(s.charAt(l));
            l++;
        }
        }
        return hugest;
    }
}
