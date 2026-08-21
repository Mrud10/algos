class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0;
        int sumCost = 0;
        for(int num : gas){
            sumGas+=num;
        }
        for(int num:cost){
            sumCost += num;
        }
        if(sumCost >sumGas) return -1;
        int [] net = new int[gas.length];
        for(int i=0;i<net.length;i++){
            net[i]=gas[i]-cost[i];
        }
        int tot = 0;
        for(int i=0;i<net.length;i++){
            tot+=net[i];
        }
        if(tot<0) return -1;
        int start = 0;
        int currentFuel = 0;
        for(int i=0;i<net.length;i++){
            currentFuel+=net[i];
            if(currentFuel<0){
                start=i+1;;
                currentFuel=0;
            }
        }
        return start;
    }
}