import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> answer = new ArrayList<>();
        int cnt = 0;
        for(String c : myString.split("x")) {
            if(c.isEmpty()) continue;
            cnt++;
            answer.add(c);
        }
        Collections.sort(answer);
        return answer.toArray(new String[cnt]);
    }
}