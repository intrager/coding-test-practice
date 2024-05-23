import java.util.HashMap;
import java.util.Map;
​
class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            answer[i] = i - map.getOrDefault(ch, i + 1);
            map.put(ch, i);
        }
        return answer;
    }
}