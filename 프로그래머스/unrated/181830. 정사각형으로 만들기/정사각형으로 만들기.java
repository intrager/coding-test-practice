import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length, col = arr[0].length;
        int[][] answer = new int[Math.max(row, col)][Math.max(row, col)];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}