import java.util.*;

class Solution {
    static Integer[] Add(Integer[] stringArray, Integer value) {
        List<Integer> newList = new ArrayList<>(Arrays.asList(stringArray));
        newList.add(value);
        
        return newList.toArray(new Integer[0]);
    }
    
    public Integer[] solution(int n) {
        Integer[] answer = {};
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 1) {
                answer = Add(answer, i);
            }
        }

        return answer;
    }
}