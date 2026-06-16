class Solution {
    public String processStr(String s) {
     StringBuilder sb = new StringBuilder();
     for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isLetter(c)){
            sb.append(c);
            }else if(c=='*'){
                if(sb.length()==0){
                continue;
                }
            sb.deleteCharAt(sb.length()-1);
            }else if(c=='#'){
            hash(sb);
            }else if(c=='%'){
            sb = percent(sb);
            }
        }
        return sb.toString();
     }   
    public void hash(StringBuilder sb){
        if(sb.length()==0) return;
        int n = sb.length();
        for(int i=0;i<n;i++){
            sb.append(sb.charAt(i));
        }
    }
    public StringBuilder percent(StringBuilder sb){
        StringBuilder s = new StringBuilder();
        if(sb.length()==0) return s;
        for(int i=sb.length()-1;i>=0;i--){
            s.append(sb.charAt(i));
        }
        return s;
    }
}
