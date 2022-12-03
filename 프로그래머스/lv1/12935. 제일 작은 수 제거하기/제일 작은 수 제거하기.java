import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        List<Integer> list = new ArrayList<>();
        int min = arr[0];
        int cnt = 0;
        for(int i=0; i < arr.length; i++) {
            if(min >= arr[i]) {
                min = arr[i];
                cnt = i;
            }
            list.add(arr[i]);
        }
        list.remove(cnt);
        if(list.isEmpty()) {
            return answer;
        } else {
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}