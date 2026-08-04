class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder [] arr = new StringBuilder[numRows];
        for(int i=0;i<arr.length;i++){
            arr[i] = new StringBuilder();
        }
        int currentRow = 0;
        boolean down = true;
        int l=0;
        while(l<s.length()){
            if(down){
                StringBuilder sb  = arr[currentRow];
                sb.append(s.charAt(l));
                currentRow++;
                l++;
                if(currentRow==numRows-1){
                down = false;
                }
            }else{
                StringBuilder sb = arr[currentRow];
                sb.append(s.charAt(l));
                currentRow--;
                l++;
                if(currentRow==0){
                    down = true;
                }
            }
            
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            StringBuilder sb = arr[i];
            for(int j=0;j<sb.length();j++){
                result.append(sb.charAt(j));
            }
        }
        return result.toString();
    }   
}