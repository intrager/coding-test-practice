import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
            
        for(int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < picture[i].length(); j++) {
                for(int n = 0; n < k; n++) {
                    sb.append(picture[i].charAt(j));
                }
            }
            for(int n = 0; n < k; n++) {
                answer.add(sb.toString());
            }
        }
        return answer.toArray(new String[answer.size()]);
    }
}