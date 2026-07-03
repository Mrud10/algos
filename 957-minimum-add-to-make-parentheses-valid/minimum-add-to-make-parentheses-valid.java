class Solution {
    public int minAddToMakeValid(String s) {
        if(s.isEmpty()) return 0;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }else if(!st.isEmpty()&&s.charAt(i)==')' && st.peek()=='('){
                st.pop();
            }else if(st.isEmpty() && s.charAt(i)==')'){
                st.push(s.charAt(i));
            }else if(!st.isEmpty() &&st.peek()==')'&& s.charAt(i)==')'){
                st.push(')');
            }

        }
        return st.size();
    }
}