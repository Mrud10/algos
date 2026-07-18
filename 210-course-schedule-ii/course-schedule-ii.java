class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> result = new ArrayList<>();
        boolean [] visited = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];

            adj.get(v).add(u);
        }
        for(int i=0;i<numCourses;i++){
            if(dfs(i,visited,path,adj,result)){
               return new int[0];
        }
        }
        int [] ans = new int[result.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=result.get(result.size()-i-1);
        }
        return ans;
        

    }
    public boolean dfs(int i, boolean[] visited, boolean[] path, List<List<Integer>> adj, List<Integer> result){
      if(path[i]==true) return true;
      if(visited[i])return false;
        visited[i] = true;
        path[i]=true;
        for(int next : adj.get(i)){
            if(dfs(next,visited,path,adj,result)){
                return true;
            }
        }
        path[i]=false;
        result.add(i);
        return false;


    }   
}