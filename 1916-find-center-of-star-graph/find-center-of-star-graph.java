class Solution {
    public int findCenter(int[][] edges) {
        int max = 0;
        List<List<Integer>> result = new ArrayList<>();
        for(int[] edge : edges){
            max = Math.max(max,Math.max(edge[0],edge[1]));
        }
        for(int i=0;i<=max;i++){
            List<Integer> list = new ArrayList<>();
            result.add(list);
        }
        for(int i=0;i<edges.length;i++){
            List<Integer> list = new ArrayList<>();
            int u = edges[i][0];
            int v = edges[i][1];

            result.get(u).add(v);
            result.get(v).add(u);
            
        }
        int ans = 0;
        for(int i=0;i<result.size();i++){
            int size = result.get(i).size();
            if(size > 1){
                ans = i;
            }
        }
        return ans;
    }
}