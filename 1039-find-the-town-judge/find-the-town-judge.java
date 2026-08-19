class Solution {
    public int findJudge(int n, int[][] trust) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<trust.length;i++){
         int truster = trust[i][0];
         int trustee = trust[i][1];
         adj.get(trustee).add(truster);
        }
        int tj = -1;
        for(int i=0;i<adj.size();i++){
            int size = adj.get(i).size();
            if(size == n-1 && isNot(adj,i)){
                tj = i;
            }
        }
        return tj;
    }
    public boolean isNot(List<List<Integer>> adj , int trustee){
        for(int i=0;i<adj.size();i++){
            if(i==trustee) continue;
            for(int j=0;j<adj.get(i).size();j++){
                if(adj.get(i).get(j)==trustee){
                    return false;
                }
            }
        }
        return true;
    } 
}