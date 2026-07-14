class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int start =0;
        int end = 0;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for(int i=0;i<2;i++){
            int number = startTime.charAt(i) - '0';
            n1 = n1*10 + number;
            int numberr = endTime.charAt(i)-'0';
            n2 = n2*10 + numberr;
        }
        start = start+n1*3600;
        end = end+n2*3600;
        for(int i=3;i<5;i++){
            int number = startTime.charAt(i) - '0';
            n3= n3*10 + number;
            int numberr =endTime.charAt(i) - '0';
            n4= n4*10 + numberr;   
        }
        start = start + n3*60;
        end = end + n4*60;
        for(int i=6;i<8;i++){
            int number = startTime.charAt(i) - '0';
            n5 = n5*10 + number;
            int numberr = endTime.charAt(i)-'0';
            n6 = n6*10 + numberr;
            }
            start = start + n5;
            end = end + n6;
            return end-start;
    }
}
// 01 -> 

// 14 * 60 * 60 

// 01
// start = s.charAt(i) -'0'