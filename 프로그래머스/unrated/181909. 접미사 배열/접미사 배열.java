import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        int cnt = 0;
        for(int i = 0; i < my_string.length(); i++) {
            answer.add(my_string.substring(i));
            cnt++;
        }
        Collections.sort(answer);
        return answer.toArray(new String[cnt]);
    }
}