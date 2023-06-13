import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String[] answer = my_string.split("");
        for(int i = s; i <= e; i++) {
            answer[i] = String.valueOf(my_string.charAt(e-i+s));
        }
        return Arrays
            .stream(answer)
            .collect(Collectors.joining());
    }
}