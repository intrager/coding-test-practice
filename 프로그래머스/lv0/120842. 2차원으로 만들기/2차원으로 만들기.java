class Solution {
    public int[][] solution(int[] num_list, int n) {
        int cnt = 0;
        int[][] answer = new int[num_list.length / n][n];
        for(int i = 0; i < (num_list.length)/n; i++) {
            for(int j = 0; j < n; j++) {
                if(n % 2 == 0) answer[i][j] = num_list[cnt++];
                else answer[i][j] = num_list[cnt++];
            }
        }
        return answer;
    }
}