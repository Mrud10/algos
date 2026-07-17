class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        return dfs(source,destination,visited,edges,adj);
    }
    public boolean dfs(int current , int destination, boolean[]visited , int[][]edges,List<List<Integer>> adj){
        if(visited[current]==true) return false;
        visited[current] = true;
        if(current==destination) return true;
        for(int next : adj.get(current)){
            if(!visited[next]){
                if(dfs(next,destination,visited,edges,adj)){
                    return true;
                }
            }
        }
        return false;
    }
}