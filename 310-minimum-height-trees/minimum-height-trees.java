class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) {
    return Collections.singletonList(0);
    }
     List<Integer> list = new ArrayList<>();
     List<List<Integer>> adj = new ArrayList<>();
     int [] degree = new int[n];
     for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
     }
     for(int i=0;i<edges.length;i++){
        int u = edges[i][0];
        int v = edges[i][1];

        adj.get(u).add(v);
        adj.get(v).add(u);
        degree[u]++;
        degree[v]++;
     }
     Queue<Integer> queue = new LinkedList<>();
     int remaining = n;
     for(int i=0;i<n;i++){
        if(degree[i]==1){
            queue.offer(i);
        }
     }
     while(remaining>2)
     {
        int size = queue.size();
        remaining-=size;
        for(int i=0;i<size;i++){
            int leaf=queue.poll();
            for(int j : adj.get(leaf)){
                degree[j]--;
                if(degree[j]==1){
                    queue.offer(j);
                }
            }
        }
     }
     while(!queue.isEmpty()){
        int ans = queue.poll();
        list.add(ans);
     }
        return list;
    }
}