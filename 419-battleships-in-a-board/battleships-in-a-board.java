class Solution {
    public int countBattleships(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int total = 0;
        boolean [][] visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='X' && visited[i][j]==false){
                    dfs(board,visited,i,j);
                    total++;
                }
            }
        }
        return total;
    }
    public void dfs(char[][] board, boolean[][] visited, int i , int j){
        int n = visited.length;
        int m = visited[0].length;
        if(i>=n || j>=m || i<0 || j<0) return;
        if(visited[i][j]==true) return;
        if(board[i][j]!='X') return;
        visited[i][j]=true;
        dfs(board,visited,i+1,j);
        dfs(board,visited,i-1,j);
        dfs(board,visited,i,j-1);
        dfs(board,visited,i,j+1);
    }
}