import java.util.*;

class Solution {
    public Integer[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        int cnt;
        for(int i = 0; i < arr.length; i++) {
            cnt = 0;
            for(int j : delete_list) {
                if(arr[i] == j) cnt++;
            }
            if(cnt == 0) answer.add(arr[i]);
        }
        return answer.toArray(new Integer[answer.size()]);
    }
}