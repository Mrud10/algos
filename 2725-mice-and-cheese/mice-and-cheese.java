class Solution {
    class Pair{
        int index;
        int value;

        Pair(int index, int value){
            this.index=index;
            this.value=value;
        }
        
    }
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
     int n = reward1.length;
    Pair[] arr = new Pair[reward1.length];
    for(int i=0;i<reward1.length;i++){
        arr[i] = new Pair(i,reward1[i] - reward2[i]);
    }
    boolean valid [] = new boolean[n];
    Arrays.sort(arr,(a,b)->a.value - b.value);
    int total = 0;
    int lmfao = k;
    int l = reward1.length-1;
    while(lmfao>0){
        Pair current = arr[l];
        total += reward1[current.index];
        int index = current.index;
        valid[index] = true;
        l--;
        lmfao--;    
    }
    Pair [] sec = new Pair[reward2.length];
    for(int i=0;i<reward2.length;i++){
        sec[i] = new Pair(i,reward2[i]);
    }
    // Arrays.sort(sec,(a,b)->a.value - b.value);
    // int pointer = sec.length -1;
    for(int i=0;i<sec.length;i++){
        Pair current = sec[i];
        int ind = current.index;
        if(valid[ind]==false){
            total+=current.value;
        }
    }
    return total;
    }
}