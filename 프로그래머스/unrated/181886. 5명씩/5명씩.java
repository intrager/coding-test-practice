import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> answer = new ArrayList<>();
        int cnt = 0;
        for(int i = 0; i < names.length; i += 5) {
            answer.add(names[i]);
            cnt++;
        }
        return answer.toArray(new String[cnt]);
    }
}