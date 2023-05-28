import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        int cnt = 0;
        for(String str : my_string.trim().split(" ")) {
            if(str.equals("")) continue;
            answer.add(str);
            cnt++;
        }
        return answer.toArray(new String[cnt]);
    }
}