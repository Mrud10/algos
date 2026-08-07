class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
       List<List<Integer>> list = new ArrayList<>();
       List<Integer> path = new ArrayList<>();
       dfs(list,path,graph,0);
       return list;
    }
    public void dfs(List<List<Integer>> list ,List<Integer> path , int[][] graph, int i){
        path.add(i);
        if(i==graph.length-1){
            list.add(new ArrayList<>(path));
        }else{
            for(int neighbour : graph[i]){
                dfs(list,path,graph,neighbour);
            }
        }
        path.remove(path.size()-1);
    }
}