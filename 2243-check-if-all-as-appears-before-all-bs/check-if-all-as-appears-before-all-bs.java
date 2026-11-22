
class Solution {
    public boolean checkString(String s) {
        int firstB = s.indexOf('b');

        if(firstB == -1){
            return true;
        }

        for(int i=firstB;i<s.length();i++){
            if(s.charAt(i)=='a'){
                return false;
            }
        }
        return true;
    }
}
    