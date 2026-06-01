class Solution {
    public int minimumCost(int[] cost) {
     Arrays.sort(cost);
     int cnt = 0;
     int qwack = 1;
     int l = cost.length-1;
     for(int i=l;i>=0;i--){
        if(qwack%3==0){
            qwack++;
            continue;
        }else{
        cnt = cnt+ cost[i];
        qwack++;
        }
     }  
     return cnt;
    }
}
// [2,2,5,6,7,9]