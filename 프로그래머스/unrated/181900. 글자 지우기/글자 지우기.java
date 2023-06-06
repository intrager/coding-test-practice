import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        int cnt = 0;
        Arrays.sort(indices);
        for(int i = 0; i < my_string.length(); i++) {
            if(indices[cnt] == i) {
                cnt++;
                continue;
            }
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}