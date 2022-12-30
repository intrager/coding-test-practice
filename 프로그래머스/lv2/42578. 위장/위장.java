import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> spy = new HashMap<>();
        for(String[] dress : clothes) {
            String type = dress[1];
            spy.put(type, spy.getOrDefault(type, 0) + 1);
        }
        int answer = 1;
        for(Integer i : spy.values()) {
            answer *= i + 1;
        }
        
        return answer - 1;
    }
}