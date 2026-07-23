class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean [] visited = new boolean[rooms.size()];
        dfs(rooms,visited,0);
        for(int i=0;i<visited.length;i++){
            if(visited[i]==false){
                return false;
            }
        }
        return true;
    }
    public void dfs(List<List<Integer>> rooms, boolean[] visited, int i){
        if(visited[i]==true) return;
        visited[i]=true;
        for(int j=0;j<rooms.get(i).size();j++){
            int value = rooms.get(i).get(j);
            dfs(rooms,visited,value);
        }
    }
}