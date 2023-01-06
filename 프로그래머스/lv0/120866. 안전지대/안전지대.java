import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        dfs(board);
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
    
    private void dfs(int[][] board) {
        int width = board.length;
        int height = board[0].length;
        
        boolean[][] visited = new boolean[board.length][board[0].length];
        int[] dx = {1, 1, 1, 0, -1, -1, -1, 0};
        int[] dy = {1, 0, -1, -1, -1, 0, 1, 1};
        
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 1) {
                    que.offer(i);
                    que.offer(j);
                    visited[i][j] = true;
                }
            }
        }
        
        while(!que.isEmpty()) {
            int x = que.poll();
            int y = que.poll();
            for(int k = 0; k < 8; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if(nx >= width || ny >= height || nx < 0 || ny < 0) continue;
                if(visited[nx][ny]) continue;
                if(board[nx][ny] == 1) continue;

                visited[nx][ny] = true;
                board[nx][ny] = 1;
            }
        }
    }
}