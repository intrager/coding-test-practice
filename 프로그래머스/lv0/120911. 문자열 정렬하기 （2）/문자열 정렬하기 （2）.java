import java.util.Arrays;
class Solution {
    public String solution(String my_string) {    
        char[] answer = my_string.toLowerCase().toCharArray();
        Arrays.sort(answer, 0, answer.length);
        return String.valueOf(answer);
    }
}