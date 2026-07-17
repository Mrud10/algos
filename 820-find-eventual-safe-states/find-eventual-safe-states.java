class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> result = new ArrayList<>();
        int n = graph.length;
        boolean [] visited = new boolean[n];
        boolean[] pathVisited = new boolean[n];
        boolean [] safe = new boolean[n];
        for(int i=0;i<n;i++){
               if(dfs(i,graph,visited,pathVisited,result,safe)){
                result.add(i);
               }
            
        }
        return result;
         
    }
    public boolean dfs(int i, int [][] graph , boolean [] visited , boolean[]  pathVisited, List<Integer> result, boolean[] safe){
        if(visited[i]==true) return safe[i];
        pathVisited[i]= true;
        visited[i] = true;
        for(int next : graph[i]){
            if(pathVisited[next]==true){
                pathVisited[i] = false;
                safe[i]=false;
                return false;
            }
            if(!dfs(next,graph,visited,pathVisited,result,safe)){
                pathVisited[i]=false;
                safe[i]=false;
                return false;
            }

        }
        pathVisited[i]=false;
        safe[i]=true;
        return true;
        
    }
}