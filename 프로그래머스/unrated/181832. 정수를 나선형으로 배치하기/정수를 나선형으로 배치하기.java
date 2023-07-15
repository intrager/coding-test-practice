class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int cnt = 2;
        int i = 0, j = 0;
        answer[i][j] = 1;
        while(cnt <= n*n) {
            while(j + 1 < n && answer[i][j + 1] == 0) {
                if(cnt > n * n) break;
                answer[i][++j] = cnt++;
            }
            while(i + 1 < n && answer[i + 1][j] == 0) {
                if(cnt > n * n) break;
                answer[++i][j] = cnt++;
            }
            while(j > 0 && answer[i][j - 1] == 0) {
                if(cnt > n * n) break;
                answer[i][--j] = cnt++;   
            }
            while(i > 0 && answer[i - 1][j] == 0) {
                if(cnt > n * n) break;
                answer[--i][j] = cnt++;
            }
        }

        return answer;
    }
}