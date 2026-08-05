class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<invocations.length;i++){
            int u = invocations[i][0];
            int v = invocations[i][1];

            list.get(u).add(v);
        }
       boolean [] visited = new boolean[n];
       dfs(list,visited,k);
       List<Integer> result = new ArrayList<>();
       for(int i=0;i<visited.length;i++){
        if(visited[i]==false){
            if(neighbours(visited,list,i)){
                for(int m=0;m<n;m++){
                    result.add(m);
                }
                return result;
            }
        }
       }
       for(int i=0;i<visited.length;i++){
        if(visited[i]==false){
            result.add(i);
        }
       }
       return result;
    
       
 
    }
    public void dfs(List<List<Integer>> list , boolean[] visited, int k){
        if(visited[k]==true)return;
        visited[k]=true;
        for(int i=0;i<list.get(k).size();i++){
            dfs(list,visited,list.get(k).get(i));
        }

    }
    public boolean neighbours(boolean[] visited , List<List<Integer>> list , int i){
        for(int j=0;j<list.get(i).size();j++){
            int neighbour = list.get(i).get(j);
            if(visited[neighbour]==true){
                return true;
            }
        }
        return false;
    }
}