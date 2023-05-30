import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();
        int cnt = 0;
        for(String str : strArr) {
            if(!str.contains("ad")) {
                answer.add(str);
                cnt++;
            }
        }
        
        return answer.toArray(new String[cnt]);
    }
}