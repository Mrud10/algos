class Solution {
    public int reverseDegree(String s) {
        int total = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int val = 'z'-c+1;
            val = val *(i+1);
            total+=val;
        }
        return total;
    }
}