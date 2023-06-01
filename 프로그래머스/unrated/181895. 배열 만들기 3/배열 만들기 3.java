import java.util.*;

class Solution {
    public Integer[] solution(int[] arr, int[][] intervals) {
        int cnt = 0;
        List<Integer> answer = new ArrayList<>();
        
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            answer.add(arr[i]);
            cnt++;
        }
        for(int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            answer.add(arr[i]);
            cnt++;
        }
        
        return answer.toArray(new Integer[cnt]);
    }
}