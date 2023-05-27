import java.util.*;

class Solution {
    public Integer[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++)
                answer.add(arr[i]);
        }
        return answer.toArray(new Integer[answer.size()]);
    }
}