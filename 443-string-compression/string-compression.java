    class Solution {
        public int compress(char[] chars) {
            StringBuilder sb = new StringBuilder();
            int cur = 1;
            if(chars.length == 1){
                return 1;
            }
            for(int i=0;i<chars.length-1;i++){
                char c = chars[i];
                if(chars[i]==chars[i+1]){
                    cur++;
                }else if(chars[i+1]!=chars[i]){
                    if(cur!=1){
                        sb.append(c);
                        sb.append(cur);
                    }else{
                        sb.append(c);
                    }
                    cur = 1;
                }
                
                
            }
            sb.append(chars[chars.length-1]);
            if(cur!=1){
                sb.delete(sb.length()-1,sb.length());
                sb.append(chars[chars.length-1]);
                sb.append(cur);    
            }
           int l = 0;
           while(l<sb.length()){
            chars[l] = sb.charAt(l);
            l++;
           }
        
            return sb.length();
            // char [] result = new char[sb.length()];
            // for(int i=0;i<result.length;i++){
            //     result[i] = sb.charAt(i);
            // }
            // return result;
            
        }
    }