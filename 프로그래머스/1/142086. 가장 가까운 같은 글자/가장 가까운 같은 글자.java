import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        
        for(int i = 0; i < len; i++) {
            String str = s.substring(0, i);
            if(str.indexOf(s.charAt(i)) == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - str.lastIndexOf(s.charAt(i));
            }
        }
        return answer;
    }
}